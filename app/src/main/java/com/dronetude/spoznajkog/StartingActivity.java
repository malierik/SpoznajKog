package com.dronetude.spoznajkog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingActivity extends AppCompatActivity {

    Button btn_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        btn_start = findViewById(R.id.btn_start);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);
    }
    public void odpriIskanje(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
