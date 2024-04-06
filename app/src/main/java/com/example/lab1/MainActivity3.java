package com.example.lab1;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.vista3);

    }

    ArrayList<String> vista4 = new ArrayList<>();
    public void Vista4 (View view) {
        Intent intent = new Intent(this,MainActivity4.class);
        intent.putExtra("historial",vista4);
        startActivity(intent);

    }
}