module com.munafsheikh.github.xopy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.munafsheikh.github.xopy to javafx.fxml;
    exports com.munafsheikh.github.xopy;
}