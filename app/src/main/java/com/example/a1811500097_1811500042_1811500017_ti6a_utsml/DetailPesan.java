package com.example.a1811500097_1811500042_1811500017_ti6a_utsml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailPesan extends AppCompatActivity {
    private Button Kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pesan);
        Bundle bundle = getIntent().getExtras();

        //nilai
        TextView namaPembeli = findViewById(R.id.namaPembeli);
        TextView alamatPembeli = findViewById(R.id.alamatPembeli);
        TextView jumlah = findViewById(R.id.txtJumlah);
        TextView totalHarga = findViewById(R.id.txtTotalHarga);
        TextView method = findViewById(R.id.tvMethod);
        TextView namaMakanan = findViewById(R.id.namaMakanan);

        //setNilai
        namaPembeli.setText("Nama Pembeli : " + bundle.getCharSequence("namaPembeli"));
        alamatPembeli.setText("Alamat Pembeli : " + bundle.getCharSequence("alamatPembeli"));
        jumlah.setText("Jumlah :  "+ bundle.getCharSequence("jumlah") + " Bungkus");//selesai
        totalHarga.setText("Total Harga : Rp " + bundle.getCharSequence("harga"));
        method.setText("Metode Pembayaran : " + bundle.getCharSequence("pembayaran"));//selesai
        namaMakanan.setText("Nama Makanan : " + bundle.getCharSequence("namaMakanan"));

        Kembali = findViewById(R.id.Kembali);

        Kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kembali = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(kembali);
                finish();
            }
        });

    }
}