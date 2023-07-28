package com.isil.p1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TrabajoAdapter extends RecyclerView.Adapter<TrabajoAdapter.TrabajoViewHolder> {
    private Context context;
    private List<Trabajo> trabajoList;

    public TrabajoAdapter(Context context, List<Trabajo> trabajoList) {
        this.context = context;
        this.trabajoList = trabajoList;
    }

    @NonNull
    @Override
    public TrabajoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_trabajo, parent, false);
        return new TrabajoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TrabajoViewHolder holder, int position) {
        Trabajo trabajo = trabajoList.get(position);
        holder.nombre.setText(trabajo.getNombre());
        holder.descripcion.setText(trabajo.getDescripcion());
        holder.precio.setText("S/ "+ trabajo.getPrecio());
        holder.foto.setImageResource(trabajo.getFoto());
    }

    @Override
    public int getItemCount() {
        return trabajoList.size();
    }

    public static class TrabajoViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre, descripcion, precio;
        private ImageView foto;

        public TrabajoViewHolder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.tvNombre);
            descripcion = itemView.findViewById(R.id.tvDescripcion);
            precio = itemView.findViewById(R.id.tvPrecio);
            foto = itemView.findViewById(R.id.ivFoto);
        }
    }
}
