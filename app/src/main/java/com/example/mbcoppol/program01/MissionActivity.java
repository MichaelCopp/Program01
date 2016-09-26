package com.example.mbcoppol.program01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MissionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission);
    }

    public void loadFaculty(View view){
        startActivity(new Intent(MissionActivity.this, FacultyActivity.class));
    }

    public void loadCourse(View view){
        startActivity(new Intent(MissionActivity.this, CourseActivity.class));
    }
}
