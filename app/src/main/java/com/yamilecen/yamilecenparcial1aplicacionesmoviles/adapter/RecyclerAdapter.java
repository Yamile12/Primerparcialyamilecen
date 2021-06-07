package com.yamilecen.yamilecenparcial1aplicacionesmoviles.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yamilecen.yamilecenparcial1aplicacionesmoviles.R;
import com.yamilecen.yamilecenparcial1aplicacionesmoviles.model.ItemList;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {
    private List<ItemList> items;
    private RecyclerItemClick itemClick;

    public RecyclerAdapter(List<ItemList> items, RecyclerItemClick itemClick) {
        this.items = items;
        this.itemClick = itemClick;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view,parent,false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerHolder holder, int position) {
        final ItemList item = items.get(position);
        holder.imgItem.setImageResource(item.getImgResource());
        holder.tvTitulo.setText(item.getTitulo());
        holder.tvDescripcion.setText(item.getDescripcion());
        holder.tvCaracteristicas.setImageResource(item.getImgCaracteristicas());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClick.itemClick(item);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder{
        private ImageView imgItem;
        private TextView tvTitulo;
        private  TextView tvDescripcion;
        private  ImageView tvCaracteristicas;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            imgItem = itemView.findViewById(R.id.imgItem);
            tvTitulo = itemView.findViewById(R.id.tvTitulo);
            tvDescripcion = itemView.findViewById(R.id.tvDescripcion);
            tvCaracteristicas = itemView.findViewById(R.id.tvCaracteristicas);

        }
    }
    public interface RecyclerItemClick{
        void itemClick(ItemList item);
    }
}
