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

import java.util.List;

/**
 * A TIS-100 problem statement.
 *
 * @author Eric Bottard
 */
public interface Specification {

    public String getName();

    public String[] getDescription();

    public Stream[] getInputStreams();

    public Stream[] getOutputStreams();

    public Stream[] getImageStreams();

    public List<Tile> getLayout();

    public static enum Tile {
        TILE_COMPUTE, TILE_MEMORY, TILE_DAMAGED;
    }


    public static class Stream {

        private final String name;

        private final List<Integer> data;

        public Stream(String name, List<Integer> data) {
            this.name = name;
            this.data = data;
        }

        public String getName() {
            return name;
        }

        public List<Integer> getData() {
            return data;
        }
    }
}
