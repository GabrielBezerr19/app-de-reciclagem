package com.example.upcycling2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.upcycling2.adapter.ReciclagemAdapter;
import com.example.upcycling2.databinding.ActivityMainBinding;
import com.example.upcycling2.model.Reciclagem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnIrParaSegundaAtividade;
    private ActivityMainBinding binding;
    private ReciclagemAdapter reciclagemAdapter;
    private ArrayList<Reciclagem> reciclagemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewReciclagem = binding.RecyclerViewReciclagem;
        recyclerViewReciclagem.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewReciclagem.setHasFixedSize(true);
        reciclagemAdapter = new ReciclagemAdapter(reciclagemList, this);
        recyclerViewReciclagem.setAdapter(reciclagemAdapter);
        getReciclagem();
    }


    private void getReciclagem(){
        Reciclagem reciclagem1 = new Reciclagem(
            R.drawable.abajur,
                "Abajur",
                "O Abajur Reciclável é uma peça de iluminação elegante e ecologicamente correta, projetada para promover a sustentabilidade."
        );
        reciclagemList.add(reciclagem1);

        Reciclagem reciclagem2 = new Reciclagem(
                R.drawable.chaves,
                "Suporte para chaves",
                "Uma solução prática e sustentável para organizar suas chaves diariamente."
        );
        reciclagemList.add(reciclagem2);

        Reciclagem reciclagem3 = new Reciclagem(
                R.drawable.jarro,
                "Jarro",
                "O Jarro Reciclável é uma escolha consciente e sustentável para armazenar líquidos."
        );
        reciclagemList.add(reciclagem3);

        Reciclagem reciclagem4 = new Reciclagem(
                R.drawable.suporte,
                "Suporte para celular",
                "Este suporte é uma solução ecologicamente correta para manter seu dispositivo ao alcance, enquanto contribui para a sustentabilidade."
        );
        reciclagemList.add(reciclagem4);

        Reciclagem reciclagem5 = new Reciclagem(
                R.drawable.carrinho,
                "Suporte para celular",
                "Este pequeno veículo combina criatividade e consciência ambiental, oferecendo uma solução prática para transporte leve."
        );
        reciclagemList.add(reciclagem5);
    }
}