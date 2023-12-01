package com.example.upcycling2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.upcycling2.databinding.ReciclagemItemBinding;
import com.example.upcycling2.model.Reciclagem;

import java.util.ArrayList;

public class ReciclagemAdapter extends RecyclerView.Adapter<ReciclagemAdapter.ReciclagemViewHolder>{
    private final ArrayList<Reciclagem> reciclagemList;
    private final Context context;

    public ReciclagemAdapter(ArrayList<Reciclagem> reciclagemList, Context context) {
        this.reciclagemList = reciclagemList;
        this.context = context;
    }

    @NonNull
    @Override
    public ReciclagemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ReciclagemItemBinding listItem;
        listItem = ReciclagemItemBinding.inflate(LayoutInflater.from(context),parent, false);
        return new ReciclagemViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ReciclagemViewHolder holder, int position) {
        holder.binding.imgReciclagem.setBackgroundResource(reciclagemList.get(position).getImgReciclagem());
        holder.binding.txtName.setText(reciclagemList.get(position).getReciclagemNome());
        holder.binding.txtDescricao.setText(reciclagemList.get(position).getReciclagemDescricao());

    }

    @Override
    public int getItemCount() {
        return reciclagemList.size();
    }

    public static class ReciclagemViewHolder extends RecyclerView.ViewHolder{

        ReciclagemItemBinding binding;

        public ReciclagemViewHolder(ReciclagemItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
