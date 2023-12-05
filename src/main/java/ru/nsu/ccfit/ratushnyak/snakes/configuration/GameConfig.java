package ru.nsu.ccfit.ratushnyak.snakes.configuration;

public interface GameConfig {

    int getFieldWidth();

    int getFieldHeight();

    int getFoodStaticNumber();

    int getFoodPerPlayer();

    double getProbabilityOfDeadSnakeCellsToFood();
}
