package com.example.MarkManagement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField nameField;
    @FXML
    private TextField idField;
    @FXML
    private TextField marksField;
    @FXML
    private TableView<Student> studentTable;
    @FXML
    private TableColumn<Student, String> nameColumn;
    @FXML
    private TableColumn<Student, String> idColumn;
    @FXML
    private TableColumn<Student, Integer> marksColumn;

    private final ObservableList<Student> studentList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty());
        marksColumn.setCellValueFactory(cellData -> cellData.getValue().marksProperty().asObject());
        studentTable.setItems(studentList);
    }

    @FXML
    private void onAddStudentClick() {
        String name = nameField.getText();
        String id = idField.getText();
        int marks;

        try {
            marks = Integer.parseInt(marksField.getText());
        } catch (NumberFormatException e) {
            showAlert("Invalid Marks", "Marks must be a number.");
            return;
        }

        Student newStudent = new Student(name, id, marks);
        studentList.add(newStudent);
        nameField.clear();
        idField.clear();
        marksField.clear();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
