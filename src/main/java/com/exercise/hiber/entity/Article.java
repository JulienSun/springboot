package com.exercise.hiber.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="articles")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="article_id")
    @Getter @Setter private int articleId;

    @Column(name="title")
    @Getter @Setter private String title;

    @Column(name="category")
    @Getter @Setter private String category;
}
