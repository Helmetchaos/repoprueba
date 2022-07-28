package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Guapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Comentado para Ampliación I
        //setContentView(R.layout.guapa);

        // Añadido para Ampliación I
        setContentView(R.layout.comun);
        ImageView imagen = findViewById(R.id.imagen);
        imagen.setImageResource(R.drawable.guapa);
    }


    public void volver(View view){
        finish();
    }
}
