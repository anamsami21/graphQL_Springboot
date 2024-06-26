package com.graphQL.graphQL_Springboot.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "project_books")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
