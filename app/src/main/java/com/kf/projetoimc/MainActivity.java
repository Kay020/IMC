package com.kf.projetoimc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular(View view){

            TextView textResult = (TextView)findViewById(R.id.textResult);
            EditText textPeso = (EditText) findViewById(R.id.textPeso);
            EditText textAltura = (EditText) findViewById(R.id.textAltura);

            float resul;
            int peso = Integer.parseInt(textPeso.getText().toString());
            float altura = Float.parseFloat(textAltura.getText().toString());

            resul = peso / (altura * altura);



            if(resul <= 18.5){

                textResult.setText("Abaixo do peso!");
            }
            else if(resul > 25 && resul <= 30){

                textResult.setText("Acima do peso!");
            }
            else if(resul > 18.5 && resul <= 25){

                textResult.setText("Peso ok!");
            }
            else{
                textResult.setText("Peso Excessivo!");
            }
    }
}