package ru.nsu.ccfit.ratushnyak.snakes.connections.messages;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.ratushnyak.snakes.game.Direction;

import java.util.Objects;

public class SteerMessage extends Message {
    @NotNull
    private final Direction direction;

    public SteerMessage(@NotNull Direction direction) {
        super(MessageType.STEER);
        this.direction = Objects.requireNonNull(direction, "Direction cant be null");
    }

    @NotNull
    public Direction getDirection() {
        return direction;
    }
}
