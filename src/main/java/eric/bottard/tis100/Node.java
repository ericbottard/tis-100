/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eric.bottard.tis100;

import org.fusesource.jansi.Ansi;

import java.util.ArrayList;
import java.util.List;

/**
 * Base class for the Basic Execution Node in TIS-100 (T21).
 * <p>Maintains state of the registers and current execution pointer.
 * Subclasses must implement the actual communication logic for ports.</p>
 *
 * @author Eric Bottard
 */
public abstract class Node {

    private List<Instruction> instructions = new ArrayList<>();

    private int pointer;

    public int getCycles() {
        return cycles;
    }

    private int cycles;

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }

    public int getBak() {
        return bak;
    }

    public void setBak(int bak) {
        this.bak = bak;
    }

    private int acc;

    private int bak;

    public String[] getSource() {
        return source;
    }

    private final String[] source;

    public Node(String[] source) {
        this.source = source;
        for (int i = 0; i < source.length; i++) {
            instructions.add(null);
        }
    }

    void setInstruction(int line, Instruction instruction) {
        instructions.set(line, instruction);
    }

    void setNextLine(int line) {
        this.pointer = line;
        while (pointer < instructions.size() && instructions.get(pointer) == null) {
            pointer++;
        }
        // Wrap at end
        if (pointer == instructions.size()) {
            this.pointer = 0;
            while (pointer < instructions.size() && instructions.get(pointer) == null) {
                pointer++;
            }
        }
    }

    void nextLine() {
        setNextLine(pointer + 1);
    }

    public boolean tick() {
        Instruction toRun = nextInstruction();
        if (toRun != null) {
            cycles++;
            toRun.execute();
            return true;
        } else {
            return false;
        }
    }

    private Instruction nextInstruction() {
        return pointer < instructions.size() ? instructions.get(pointer) : null;
    }

    public ValueSource sourceRegister(String reg) {
        switch (reg) {
            case "ACC":
                return () -> acc;
            case "NIL":
                return () -> 0;
            default:
                throw new IllegalArgumentException("Can't read register " + reg);
        }
    }

    public ValueDestination destinationRegister(String reg) {
        switch (reg) {
            case "ACC":
                return (v) -> acc = v;
            case "NIL":
                return (v) -> {
                };
            default:
                throw new IllegalArgumentException("Can't write to register " + reg);
        }
    }

    public abstract ValueSource sourcePort(String port);

    public abstract ValueDestination destinationPort(String port);

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(source.length * 10);
        for (int i = 0; i < source.length; i++) {
            if (i == pointer) {
                sb.append("> ");
            } else {
                sb.append("  ");
            }
            sb.append(source[i]).append('\n');
        }
        sb.append("-----------------------------\n");
        sb.append("   ACC=").append(acc).append(",  BAK=").append(bak).append(", cyc=").append(cycles).append('\n');
        sb.append("-----------------------------\n");
        return sb.toString();
    }


    public int getNextLine() {
        return pointer;
    }

}
