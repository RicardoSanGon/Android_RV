package com.example.practica_recycle_view.Models.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica_recycle_view.Models.Carros;
import com.example.practica_recycle_view.R;

import java.util.List;

public class CarrosAdapter extends RecyclerView.Adapter<CarrosAdapter.ViewHolder> {
    private List<Carros> carros;

    public CarrosAdapter(List<Carros> carros) {
        this.carros = carros;
    }

    @NonNull
    @Override
    public CarrosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater l= LayoutInflater.from(parent.getContext());
        View listaItem=l.inflate(R.layout.carroitem,parent,false);
        return new ViewHolder(listaItem);
    }

    @Override
    public void onBindViewHolder(@NonNull CarrosAdapter.ViewHolder holder, int position) {
        Carros c=carros.get(position);
        holder.setData(c);
    }

    @Override
    public int getItemCount() {
        return carros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtMarca,txtKilometraje,txtPrecio;
        Carros carro;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtMarca=itemView.findViewById(R.id.itMarca);
            this.txtKilometraje=itemView.findViewById(R.id.itKm);
            this.txtPrecio=itemView.findViewById(R.id.itPrecio);
            itemView.setOnClickListener(this);

        }

        public void setData(Carros c) {
            txtMarca.setText(c.getMarca());
            txtKilometraje.setText(c.getKilometraje());
            txtPrecio.setText(c.getPrecio());
        }

        @Override
        public void onClick(View v) {
            Intent i=new Intent(Intent.ACTION_DIAL);
            i.setData(Uri.parse("8717876204"));
            itemView.getContext().startActivity(i);
        }
    }
}
