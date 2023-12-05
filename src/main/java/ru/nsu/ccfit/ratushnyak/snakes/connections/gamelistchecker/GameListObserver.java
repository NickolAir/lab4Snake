package ru.nsu.ccfit.ratushnyak.snakes.connections.gamelistchecker;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public interface GameListObserver {
    void updateGameList(@NotNull Collection<GameInfo> gameInfos);
}
