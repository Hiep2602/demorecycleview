package com.example.hieph.demorecycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.zip.Inflater;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    List<item_data> list_item;
    Context context;
   

    public Adapter(List<item_data> list_item, Context context) {
        this.list_item = list_item;
        this.context = context;

    }


    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_data, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter.ViewHolder viewHolder, final int position) {
        Picasso.with(context).
                load(list_item.get(position).getImage())
                .into(viewHolder.imv);
        viewHolder.setItemClick(new ClickItem() {
            @Override
            public void Click(View v, int position,boolean isLongClick) {
                if (isLongClick) {
                    Toast.makeText(context, "cli", Toast.LENGTH_SHORT).show();
                }else
                    Toast.makeText(context, "cli", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list_item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener,View.OnLongClickListener {
        private ImageView imv;

        private ClickItem clickItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imv = itemView.findViewById(R.id.imv_image1);
            imv.setOnClickListener(this);

        }
        public void setItemClick(ClickItem clickitem){
            this.clickItem = clickitem;
        }

        @Override
        public void onClick(View v) {
            clickItem.Click(v,getAdapterPosition(),false);
        }

        @Override
        public boolean onLongClick(View v) {
             clickItem.Click(v,getAdapterPosition(),false);
             return true;
        }
    }
        public interface ClickItem {
            public void Click(View v,int position,boolean isLongclick);
        }
}
