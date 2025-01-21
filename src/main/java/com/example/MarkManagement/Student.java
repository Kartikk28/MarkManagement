package com.example.MarkManagement;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Student {
    private final SimpleStringProperty name;
    private final SimpleStringProperty id;
    private final SimpleIntegerProperty marks;

    public Student(String name, String id, int marks) {
        this.name = new SimpleStringProperty(name);
        this.id = new SimpleStringProperty(id);
        this.marks = new SimpleIntegerProperty(marks);
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public SimpleStringProperty idProperty() {
        return id;
    }

    public SimpleIntegerProperty marksProperty() {
        return marks;
    }
}
