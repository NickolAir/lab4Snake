package ru.nsu.ccfit.ratushnyak.snakes.view.event;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.ratushnyak.snakes.configuration.GameConfig;
import ru.nsu.ccfit.ratushnyak.snakes.connections.NetNode;

public class JoinToGameEvent extends UserEvent {
    @NotNull
    private final NetNode masterNode;
    @NotNull
    private final String masterName;
    @NotNull
    private final GameConfig config;

    public JoinToGameEvent(@NotNull NetNode masterNode, @NotNull String masterName, @NotNull GameConfig config) {
        super(UserEventType.JOIN_GAME);
        this.masterNode = masterNode;
        this.masterName = masterName;
        this.config = config;
    }

    @NotNull
    public GameConfig getConfig() {
        return config;
    }

    @NotNull
    public String getMasterName() {
        return masterName;
    }

    @NotNull
    public NetNode getMasterNode() {
        return masterNode;
    }
}
