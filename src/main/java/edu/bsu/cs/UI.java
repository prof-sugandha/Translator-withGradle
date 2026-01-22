package edu.bsu.cs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class UI extends Application{
    public static void main(String[] args){
        launch(args);
    }
    private final Button translateButton = new Button("Translate");
    private final TextField inputField = new TextField();
    private final TextField outputField = new TextField();
    private final ComboBox<String> translatorSelector = new ComboBox<>();

    @Override
    public void start(Stage primaryStage){
        outputField.setEditable(false);
        configure(primaryStage);
        configureComboBox();
        configureTranslateButton();
    }
    private void configure(Stage stage){
        stage.setTitle("Translator");
        stage.setScene(new Scene(createRoot()));
        stage.sizeToScene();
        stage.show();
    }
    private Pane createRoot() {
        VBox root = new VBox();
        root.getChildren().addAll( //
                new Label("Input:"), //
                inputField, //
                translatorSelector, //
                translateButton, //
                new Label("Output:"),//
                outputField);
        return root;
    }
    private void configureComboBox() {
        translatorSelector.getItems().addAll("Identity","Canadian");
    }

    private void configureTranslateButton() {
        translateButton.setOnAction(event -> translateInputFieldToOutputField());
    }

    private void translateInputFieldToOutputField() {

        Translator translator;

        String choice = translatorSelector.getValue();
        if ("Canadian".equals(choice)) {
            translator = new CanadianTranslator();
        } else {
            translator = new IdentityTranslator();
        }


        String translation = translator.translate(inputField.getText());
        outputField.setText(translation);
    }

}
