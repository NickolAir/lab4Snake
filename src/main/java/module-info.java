module ru.nsu.ccfit.ratushnyak.snakes {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.slf4j;
    requires com.google.protobuf;
    requires annotations;
    requires org.apache.commons.lang3;


    opens ru.nsu.ccfit.ratushnyak.snakes.UI.controllers to javafx.fxml;
    opens ru.nsu.ccfit.ratushnyak.snakes.UI.utils to javafx.fxml;
    opens ru.nsu.ccfit.ratushnyak.snakes.game.player to javafx.fxml;
    exports ru.nsu.ccfit.ratushnyak.snakes;
    exports ru.nsu.ccfit.ratushnyak.snakes.UI.controllers;
    exports ru.nsu.ccfit.ratushnyak.snakes.UI.utils;
    exports ru.nsu.ccfit.ratushnyak.snakes.game.player;
}