package ru.nsu.ccfit.ratushnyak.snakes.connections.messages;

public class PingMessage extends Message {
    public PingMessage() {
        super(MessageType.PING);
    }
}
