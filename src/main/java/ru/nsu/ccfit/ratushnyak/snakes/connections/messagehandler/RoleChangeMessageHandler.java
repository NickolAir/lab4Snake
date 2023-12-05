package ru.nsu.ccfit.ratushnyak.snakes.connections.messagehandler;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.ratushnyak.snakes.connections.NetNode;
import ru.nsu.ccfit.ratushnyak.snakes.connections.messages.RoleChangeMessage;

public interface RoleChangeMessageHandler {
    void handle(@NotNull NetNode sender, @NotNull RoleChangeMessage roleChangeMsg);
}
