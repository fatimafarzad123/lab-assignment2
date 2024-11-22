package com.example.practice2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {

        // Labels
        Label nameLabel = new Label("Name:");
        Label fatherNameLabel = new Label("Father Name:");
        Label cnicLabel = new Label("CNIC:");
        Label dateLabel = new Label("Date (Picker):");
        Label genderLabel = new Label("Gender:");
        Label cityLabel = new Label("City:");
        Label imageLabel = new Label("Image:");
        Label myAccountLabel = new Label("My Account");


        TextField nameField = new TextField();
        TextField fatherNameField = new TextField();
        TextField cnicField = new TextField();
        TextField cityField = new TextField();
        DatePicker datePicker = new DatePicker();


        ComboBox<String> genderComboBox = new ComboBox<>();
        genderComboBox.getItems().addAll("Male", "Female", "Other");


        Button uploadButton = new Button("Upload Image");


        Button saveButton = new Button("Save");


        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameField, 1, 0);
        gridPane.add(fatherNameLabel, 0, 1);
        gridPane.add(fatherNameField, 1, 1);
        gridPane.add(cnicLabel, 0, 2);
        gridPane.add(cnicField, 1, 2);
        gridPane.add(dateLabel, 0, 3);
        gridPane.add(datePicker, 1, 3);
        gridPane.add(genderLabel, 0, 4);
        gridPane.add(genderComboBox, 1, 4);
        gridPane.add(cityLabel, 0, 5);
        gridPane.add(cityField, 1, 5);
        gridPane.add(imageLabel, 0, 6);
        gridPane.add(uploadButton, 1, 6);


        HBox bannerBox = new HBox(myAccountLabel);
        bannerBox.setAlignment(Pos.CENTER);
        bannerBox.setPadding(new Insets(10));
        bannerBox.setStyle("-fx-background-color: #f0f0f0; -fx-padding: 10px;");
        myAccountLabel.setFont(Font.font(16));


        VBox vBox = new VBox(bannerBox, gridPane, saveButton);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(20));


        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Person Form");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
