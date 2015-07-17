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

import org.springframework.messaging.support.GenericMessage;

/**
 * An implementation of {@link Node} where communication over ports is done using
 * Spring Integration channels.
 *
 * @author Eric Bottard
 */
public class SpringNode extends Node {

    public void setPorts(Ports ports) {
        this.ports = ports;
    }

    private Ports ports;

    public SpringNode(String[] source) {
        super(source);
    }

    @Override
    public ValueSource sourcePort(String port) {
        switch (port) {
            case "UP":
                return () -> (Integer) ports.inUp().receive().getPayload();
            case "DOWN":
                return () -> (Integer) ports.inDown().receive().getPayload();
            case "LEFT":
                return () -> (Integer) ports.inLeft().receive().getPayload();
            case "RIGHT":
                return () -> (Integer) ports.inRight().receive().getPayload();
            default:
                throw new IllegalStateException("Cannot read from port " + port);
        }
    }

    @Override
    public ValueDestination destinationPort(String port) {
        switch (port) {
            case "UP":
                return (v) -> ports.outUp().send(new GenericMessage<>(v));
            case "DOWN":
                return (v) -> ports.outDown().send(new GenericMessage<>(v));
            case "LEFT":
                return (v) -> ports.outLeft().send(new GenericMessage<>(v));
            case "RIGHT":
                return (v) -> ports.outRight().send(new GenericMessage<>(v));
            default:
                throw new IllegalStateException("Cannot write to port " + port);
        }
    }
}
