package ru.nsu.ccfit.ratushnyak.snakes.game;

public interface GameObservable {
    void addObserver(GameObserver gameObserver);

    void removeObserver(GameObserver gameObserver);

    void notifyObservers();
}
