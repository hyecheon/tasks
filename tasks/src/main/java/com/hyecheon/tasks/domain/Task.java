package com.hyecheon.tasks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class Task {
    @Id
    private String id;
    private String name;
    @JsonFormat(pattern = "MM/dd/yyyy")
    private LocalDate localeDate;
    private Boolean completed;

    public Task() {
    }

    public Task(String id, String name, LocalDate localeDate, Boolean completed) {
        this.id = id;
        this.name = name;
        this.localeDate = localeDate;
        this.completed = completed;
    }

    public Task(String name, LocalDate localeDate, Boolean completed) {
        this.name = name;
        this.localeDate = localeDate;
        this.completed = completed;
    }
}



