package com.example.uygulama10;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Solider solider;
    public Tanker tanker;
    String message = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        solider = new Solider();
        tanker = new Tanker();
        TextView textViewMessage = findViewById(R.id.tvMessage);
        Button buttonAsker = findViewById(R.id.buttonSoldier);
        Button buttonTankci = findViewById(R.id.buttonTank);
        buttonAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message = solider.fire();
                textViewMessage.setText(message);
            }
        });
        buttonTankci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                message = tanker.fire();
                textViewMessage.setText(message);
            }
        });
    }
}