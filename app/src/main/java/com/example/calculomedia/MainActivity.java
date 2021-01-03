package com.example.calculomedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edN1, edN2;
    TextView edResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularMedia(View view) {
        edN1 = (EditText) findViewById(R.id.edN1);
        edN2 = (EditText) findViewById(R.id.edN2);
        edResultado = (TextView) findViewById(R.id.edResultado);

        float n1 = Float.parseFloat(edN1.getText().toString());
        float n2 = Float.parseFloat(edN2.getText().toString());
        float media = (float) ((n1 * 0.4) + (n2 * 0.6));
        float precisaTirar = (float) (6 - (n1 * 0.4));
        String situacao = null;


        if(n2 > 0){
            if (media >= 6)
                situacao = "APROVADO";
            else
                situacao = "REPROVADO";
            String msg = "RESULTADO: VOCÊ FOI " + situacao + " COM MÉDIA " + media;
            edResultado.setText(msg);
        }
        else {
            String msg = "VOCÊ PRECISA TIRAR " + precisaTirar + " NA N2.";
            edResultado.setText(msg);
        }
    }
}