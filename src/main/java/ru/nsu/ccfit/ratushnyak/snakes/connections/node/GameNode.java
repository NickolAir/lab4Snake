package ru.nsu.ccfit.ratushnyak.snakes.connections.node;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.ratushnyak.snakes.game.Direction;
import ru.nsu.ccfit.ratushnyak.snakes.connections.NetNode;
import ru.nsu.ccfit.ratushnyak.snakes.connections.NodeHandler;
import ru.nsu.ccfit.ratushnyak.snakes.connections.messages.Message;


public interface GameNode {
    void handleMessage(@NotNull NetNode sender, @NotNull Message message);

    void setNodeHandler(@NotNull NodeHandler nodeHandler);

    void makeMove(@NotNull Direction direction);

    void stop();
}
