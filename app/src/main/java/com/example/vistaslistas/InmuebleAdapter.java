package com.example.vistaslistas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.vistaslistas.Modelo.Inmueble;

import java.util.ArrayList;

public class InmuebleAdapter extends RecyclerView.Adapter <InmuebleAdapter.ViewHolder> {
    private ArrayList<Inmueble> inmueble;
    private Context context;
    private LayoutInflater layoutInflater;

    public InmuebleAdapter(ArrayList<Inmueble> inmueble, Context context, LayoutInflater layoutInflater) {
        this.inmueble = inmueble;
        this.context = context;
        this.layoutInflater = layoutInflater;
    }

    @NonNull
    @Override
    //Referenciar a la vista item y pasarsela al viewholder
    public InmuebleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= layoutInflater.inflate(R.layout.item_inmueble, parent, false);
        return new ViewHolder(view);
    }

    @Override
    //Se ejecuta por cada item de la vista
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.tvdir.setText(inmueble.get(position).getDireccion());
       holder.tvPre.setText(inmueble.get(position).getPrecio()+"");
       holder.fot.setImageResource(inmueble.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return inmueble.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvdir;
        private TextView tvPre;
        private ImageView fot;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvdir=itemView.findViewById(R.id.tvDireccion);
            tvPre=itemView.findViewById(R.id.tvPrecio);
            fot=itemView.findViewById(R.id.ivFoto);
        }
    }
}
