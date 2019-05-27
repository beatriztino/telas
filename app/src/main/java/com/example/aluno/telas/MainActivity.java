package com.example.aluno.telas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sobre;
    private Button lab1;
    private Button lab2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sobre = (Button) findViewById(R.id.buttonSobre);
        lab1 = (Button) findViewById(R.id.buttonlab1);
        lab2 =(Button) findViewById(R.id.buttonlab2);
        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para outra tela!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, SobreActivity.class));
            }
        });
        lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para outra tela!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Lab1Activity.class));
            }
        });
        lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Indo para outra tela!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, Lab2Activity.class));
            }
        });
    }
}
