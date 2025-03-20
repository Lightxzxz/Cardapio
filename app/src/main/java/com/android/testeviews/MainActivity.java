package com.android.testeviews;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = findViewById(R.id.lista); // criar a lista de itens

        Cardapio carnivoro = new Cardapio("carnivoro",
                "R$39,00", "carnivoro");
        Cardapio duplo = new Cardapio("duplo",
                "R$45,00", "duplo");
        Cardapio picanha = new Cardapio("picanha",
                "R$50,00", "picanha");
        Cardapio retro = new Cardapio("retro",
                "R$29,00", "retro");
        Cardapio texano = new Cardapio("texano",
                "R$35,00", "texano");
        Cardapio tradicional = new Cardapio("tradicional",
                "R$40,00", "tradicional");

        ArrayList<Cardapio> cardapios = new ArrayList<>();
        cardapios.add(carnivoro);
        cardapios.add(duplo);
        cardapios.add(picanha);
        cardapios.add(retro);
        cardapios.add(texano);
        cardapios.add(tradicional);

        ListaAdapter adapter = new ListaAdapter(this, R.layout.layout_lista, cardapios);
        lista.setAdapter(adapter);

    }
}