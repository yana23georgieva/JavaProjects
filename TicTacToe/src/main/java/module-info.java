module com.example.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tictactoe to javafx.fxml;
    exports com.example.tictactoe;
}