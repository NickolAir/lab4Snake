package ru.nsu.ccfit.ratushnyak.snakes.connections.messagehandler;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.ratushnyak.snakes.connections.NetNode;
import ru.nsu.ccfit.ratushnyak.snakes.connections.messages.ErrorMessage;


public interface ErrorMessageHandler {
    void handle(@NotNull NetNode sender, @NotNull ErrorMessage errorMsg);
}
