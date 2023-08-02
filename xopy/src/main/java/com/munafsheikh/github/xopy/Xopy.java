package com.munafsheikh.github.xopy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.Clipboard;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.awt.*;
import java.awt.event.ActionListener;

public class Xopy extends Application {

    final SystemTray tray = SystemTray.getSystemTray();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Xopy.class.getResource("xopy" +
                ".fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("xopy!");
        stage.setScene(scene);
        stage.show();
        initSystemTray();
    }

    public static void main(String[] args) {
        launch();
    }


    private void initSystemTray() throws IOException {
        if (SystemTray.isSupported() == false) {
            System.err.println("No system tray available");
            return;
        }
        try {
            final PopupMenu popupMenu = new PopupMenu();
            final TrayIcon trayIcon = new TrayIcon(ImageIO.read(new File("copy_icon.png")), "Multi");


            MenuItem exitItem = new MenuItem("Exit");
            exitItem.addActionListener(e -> {
                System.out.println("Something happened!");
                System.exit(0);
            });
            popupMenu.add(exitItem);
            trayIcon.setPopupMenu(popupMenu);

            tray.add(trayIcon);
        } catch (IOException | AWTException e) {
            e.printStackTrace();
        }
    }
}