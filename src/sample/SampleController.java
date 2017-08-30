package sample;

import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class SampleController {
    public Label helloWorld;

    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorld.setText("AWWWW YISSSS");
    }
}
