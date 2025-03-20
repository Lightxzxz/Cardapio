package com.android.testeviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListaAdapter extends ArrayAdapter<Cardapio> {
    private Context contexto;
    private int resourceLayout;
    private List<Cardapio> listaCardapios;

    public ListaAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Cardapio> objects) {
        super(context, resource, objects);
        this.contexto = context;
        this.resourceLayout = resource;
        this.listaCardapios = objects;
    };

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(contexto).inflate(resourceLayout, parent, false);
        }

        Cardapio cardapio = listaCardapios.get(position);

        TextView txtComida = convertView.findViewById(R.id.txt01);
        TextView txtPreco = convertView.findViewById(R.id.txt02);
        ImageView imgIcon = convertView.findViewById(R.id.img);

        txtComida.setText(cardapio.getComida());
        txtPreco.setText(cardapio.getPreco());

        // Definir imagem (precisa estatr em drawable)
        //imgIcon.setImageResource(R.drawable.ic_launcher_foreground);

        int imageResource = contexto.getResources().getIdentifier(
                cardapio.getImg(), "drawable", contexto.getPackageName()
        );

        if (imageResource != 0) {
            imgIcon.setImageResource(imageResource);
        } else {
            imgIcon.setImageResource(R.drawable.ic_launcher_background); // Imagem padrão caso não encontre
        }

        return convertView;
    }
}
