package ru.nsu.ccfit.ratushnyak.snakes.view;

import org.jetbrains.annotations.NotNull;
import ru.nsu.ccfit.ratushnyak.snakes.view.event.UserEvent;


public interface GamePresenter {
    void fireEvent(@NotNull UserEvent userEvent);
}
