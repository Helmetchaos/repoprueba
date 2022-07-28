package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv1 = (ListView) findViewById(R.id.lv1);
        String[] fotos = getResources().getStringArray(R.array.fotos);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.formato, fotos);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id)
            {
                mostrar(posicion);
            }
        });
    }

    private void mostrar(int pos)
    {
        Intent intent;
        switch(pos){
            case 0:
                intent = new Intent(this, Guapa.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(this, Gato.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(this, Oso.class);
                startActivity(intent);
                break;
        }
    }
}