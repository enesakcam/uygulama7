package com.example.uygulama7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber,editTextYas;
    Button buttonKaydet;
    TextView textViewSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextYas = findViewById(R.id.editTextYas);
        editTextNumber = findViewById(R.id.editTextNumber);
        buttonKaydet = findViewById(R.id.buttonKaydet);
        textViewSonuc = findViewById(R.id.textViewSonuc);
        buttonKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yas = Integer.parseInt(editTextYas.getText().toString());
                Personel personel = new Personel();
                personel.setYas(yas);
                int maas = Integer.parseInt(editTextNumber.getText().toString());
                personel.setMaas(maas);
                textViewSonuc.setText("Yaş:"+personel.getYas()+" Maaş:"+personel.getMaas());

            }});
    }
}