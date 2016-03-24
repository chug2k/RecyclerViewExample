package com.vn.coderschool.recyclerexample;

/**
 * Created by charles on 3/24/16.
 */
public class Student {
    private String name;
    private String github;

    public String getName() {
        return name;
    }

    public String getGithub() {
        return github;
    }

    public Student(String name, String github) {
        this.name = name;
        this.github = github;
    }
}

