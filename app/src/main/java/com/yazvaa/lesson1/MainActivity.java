package com.yazvaa.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSet(View view) {
        final ToggleButton toggleButton = findViewById(R.id.ToggleButton_Test);
        toggleButton.setChecked(true);
        final Switch swtch = findViewById(R.id.Switch_Test);
        swtch.setChecked(true);
    }

    public void clickNext(View view) {
        Intent intent = new Intent(this, Task2.class);
        startActivity(intent);
    }
}