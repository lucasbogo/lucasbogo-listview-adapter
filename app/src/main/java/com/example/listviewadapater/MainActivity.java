package com.example.listviewadapater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // variável myListView que 'linka' com a ListView Recèm criada no Constraint Layout
        ListView myListView = (ListView)findViewById(R.id.myListView);

        // Criar arraylist com dados estáticos (didático, depois penso em deixar dinâmico)
        ArrayList<String> programmingLanguages = new ArrayList<String>(Arrays.asList("java","php","python"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, programmingLanguages);

        myListView.setAdapter(arrayAdapter);

        // OnItemClickListener p/ mostrar tstr msg.
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), "Linguagem de Programação tocada: "
                 + programmingLanguages.get(position), Toast.LENGTH_LONG).show();
            }
        });
    }

        /* ==== 1° tentativa: Conhecendo ListView ==== */

        /* ==== ADICIONAR CONTEÚDO NA LISTA (ESTATÍCO) ==== */
        // programmingLanguages.add("java");
        // programmingLanguages.add("php");
        // programmingLanguages.add("python");

       // ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, programmingLanguages);

       // myListView.setAdapter(arrayAdapter);

        // Criar um 'Listener' para um 'click' de um objeto na list
       // myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          //  @Override
         //   public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

           //     Log.i("Linguagem de Programação tocada", programmingLanguages.get(position));
        //    }
      //  });
   // }
}