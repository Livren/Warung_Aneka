package com.example.a1811500097_1811500042_1811500017_ti6a_utsml;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
//menampilkan data daftar gulir.
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoMakanan, ArrayList<String> namaMakanan,ArrayList<String> infoMakanan, Context context) {
        this.fotoMakanan = fotoMakanan;
        this.namaMakanan = namaMakanan;
        this.infoMakanan = infoMakanan;
        this.context = context;
    }

    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,final int position) {
        Glide.with(context).asBitmap().load(fotoMakanan.get(position)).into(holder.imageViewFotoMakanan);
        holder.textViewNamaMakanan.setText(namaMakanan.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
//                fungsi intent untuk berpindah halaman ketika menu diklik

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("foto_makanan", fotoMakanan.get(position));
                intent.putExtra("nama_makanan", namaMakanan.get(position));
                intent.putExtra("info_makanan", infoMakanan.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    //mengambil data dan menampilkannya
    public int getItemCount() {
        return namaMakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewFotoMakanan;
        TextView textViewNamaMakanan;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoMakanan = itemView.findViewById(R.id.imageViewFotoMakanan);
            textViewNamaMakanan = itemView.findViewById(R.id.textViewNamaMakanan);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
