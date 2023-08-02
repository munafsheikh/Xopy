package com.munafsheikh.github.xopy;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

import java.util.Date;

public class XopyController {



    Clipboard clipboard = Clipboard.getSystemClipboard();

    // Write data to clipboard

    @FXML
    private Label welcomeText;

    @FXML
    protected void onCopyButtonClick() {
        System.out.println("Copy button clicked!");

        // Read data from clipboard
        String clipboardContent = clipboard.getString();
        System.out.println("Clipboard content: " + clipboardContent);


    }

    @FXML
    protected void onPasteButtonClick() {
        System.out.println("Paste button clicked!");
        ClipboardContent content = new ClipboardContent();
        content.putString("Your text here " + (new Date()).toString());
        clipboard.setContent(content);

    }
}