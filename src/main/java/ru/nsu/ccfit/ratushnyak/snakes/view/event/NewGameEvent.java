package ru.nsu.ccfit.ratushnyak.snakes.view.event;

public class NewGameEvent extends UserEvent {
    public NewGameEvent() {
        super(UserEventType.NEW_GAME);
    }
}
