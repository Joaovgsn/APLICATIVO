package com.jv.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jv.applistacurso.R;
import com.jv.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

        pessoa.setPrimeiroNnome("joao victor");
        pessoa.setSobrenome("gomes santos");
        pessoa.setCursoDesejado("desenvolvimento de sistemas");
        pessoa.setTelefoneContato("38 984052927");
    }

}
