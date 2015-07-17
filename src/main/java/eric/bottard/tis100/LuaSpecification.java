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

import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.lib.jse.JsePlatform;

import java.util.ArrayList;
import java.util.List;

/**
 * A Specification constructed from interpreting a lua script.
 *
 * @author Eric Bottard
 */
public class LuaSpecification implements Specification {

    private String name;

    private String[] description;

    private Stream[] inputStreams;

    private Stream[] outputStreams;

    private Stream[] imageStreams;

    private List<Tile> layout;

    public LuaSpecification(String file, int rows, int columns) {
        inputStreams = new Stream[columns];
        outputStreams = new Stream[columns];
        imageStreams = new Stream[columns];

        Globals globals = JsePlatform.standardGlobals();
        globals.set("TILE_COMPUTE", "TILE_COMPUTE");
        globals.set("TILE_MEMORY", "TILE_MEMORY");
        globals.set("TILE_DAMAGED", "TILE_DAMAGED");

        globals.set("STREAM_INPUT", "STREAM_INPUT");
        globals.set("STREAM_OUTPUT", "STREAM_OUTPUT");
        globals.set("STREAM_IMAGE", "STREAM_IMAGE");

        globals.get("dofile").call(LuaValue.valueOf(file));
        LuaValue layoutTable = globals.get("get_layout").call();

        layout = new ArrayList<>(rows * columns);
        for (int i = 1; i <= rows * columns; i++) {
            layout.add(Tile.valueOf(layoutTable.get(i).toString()));
        }

        LuaValue streamsTable = globals.get("get_streams").call();
        for (int i = 1; i <= streamsTable.length(); i++) {
            int index = streamsTable.get(i).get(3).toint();
            String name = streamsTable.get(i).get(2).toString();
            List<Integer> data = new ArrayList<>();
            for (int j = 1; j <= streamsTable.get(i).get(4).length(); j++) {
                data.add(streamsTable.get(i).get(4).get(j).toint());
            }
            if (streamsTable.get(i).get(1).toString().equals("STREAM_INPUT")) {
                inputStreams[index] = new Stream(name, data);
            } else if (streamsTable.get(i).get(1).toString().equals("STREAM_OUTPUT")) {
                outputStreams[index] = new Stream(name, data);
            }
        }

        LuaValue descriptionTable = globals.get("get_description").call();
        description = new String[descriptionTable.length()];
        for (int i = 1; i <= descriptionTable.length(); i++) {
            description[i-1] = descriptionTable.get(i).toString();
        }

        name = globals.get("get_name").call().toString();

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String[] getDescription() {
        return description;
    }

    @Override
    public Stream[] getInputStreams() {
        return inputStreams;
    }

    @Override
    public Stream[] getOutputStreams() {
        return outputStreams;
    }

    @Override
    public Stream[] getImageStreams() {
        return imageStreams;
    }

    @Override
    public List<Tile> getLayout() {
        return layout;
    }
}
