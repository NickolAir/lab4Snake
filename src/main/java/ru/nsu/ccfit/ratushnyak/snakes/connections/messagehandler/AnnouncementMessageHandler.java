package ru.nsu.ccfit.ratushnyak.snakes.connections.messagehandler;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.ratushnyak.snakes.connections.NetNode;
import ru.nsu.ccfit.ratushnyak.snakes.connections.messages.AnnouncementMessage;


public interface AnnouncementMessageHandler {
    void handle(@NotNull NetNode sender, @NotNull AnnouncementMessage announcementMsg);
}
