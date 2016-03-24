package com.vn.coderschool.recyclerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    StudentsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Hoan", "hoanle"));
        students.add(new Student("Trung", "Hinaka"));
        students.add(new Student("Trang", "HynTrang"));


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvStudents);
        mAdapter = new StudentsAdapter(students);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
