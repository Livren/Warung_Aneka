package com.example.a1811500097_1811500042_1811500017_ti6a_utsml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.textfield.TextInputEditText;

public class DetailActivity extends AppCompatActivity {
    ImageView imageViewFotoMakanan;
    TextView textViewNamaMakanan, textViewInfoMakanan;
    int jumlah = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imageViewFotoMakanan = findViewById(R.id.imageViewFotoMakanan);
        textViewNamaMakanan = findViewById(R.id.textViewNamaMakanan);
        textViewInfoMakanan = findViewById(R.id.textViewInfoMakanan);
        Button pesan = findViewById(R.id.pesan);
        EditText namaP = findViewById(R.id.namaPembeli);
        EditText alamatP = findViewById(R.id.alamatPembeli);
        TextView jum = findViewById(R.id.jumlah);
        RadioGroup Pembayaran = findViewById(R.id.bayar);

        getIncomingExtra();


        pesan.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DetailPesan.class);
                Bundle bundle = new Bundle();


                int totalHarga = hitungHarga();//akses codingan harga


                bundle.putString("namaPembeli", namaP.getText().toString());
                bundle.putString("alamatPembeli", alamatP.getText().toString());
                bundle.putString("jumlah", jum.getText().toString());
                bundle.putString("namaMakanan", textViewNamaMakanan.getText().toString());
                int id = Pembayaran.getCheckedRadioButtonId();
                RadioButton rdButton = findViewById(id);
                bundle.putString("pembayaran", rdButton.getText().toString());
                bundle.putString("harga", Integer.toString(totalHarga));
                intent.putExtras(bundle);
                startActivity(intent);// fungsi pindah halaman ke activity_detail
            }
        });

    }


    private int hitungHarga(){//jumlah pesanan * harga
        int harga = 20000;
        return jumlah * harga;
    }

    public void plus(View view){
        if(jumlah==30){
            Toast.makeText(this,"sudah mencapai batas",Toast.LENGTH_SHORT).show();
            return;
        }
        jumlah = jumlah+1 ;
        data(jumlah);
    }

    public void mines(View view){
        if (jumlah==1){
            Toast.makeText(this,"siahkan masukan jumlah yang benar",Toast.LENGTH_SHORT).show();
            return;
        }
        jumlah = jumlah -1;
        data(jumlah);
    }

    public void data(int nomor) {
        TextView jumlahtxt = (TextView) findViewById(R.id.jumlah);
        jumlahtxt.setText("" + nomor);
    }

    private void getIncomingExtra(){
        if(getIntent().hasExtra("foto_makanan")&& getIntent().hasExtra("nama_makanan")&& getIntent().hasExtra("info_makanan")){
            String fotoMakanan = getIntent().getStringExtra("foto_makanan");
            String namaMakanan = getIntent().getStringExtra("nama_makanan");
            String infoMakanan = getIntent().getStringExtra("info_makanan");

            setDataActivity(fotoMakanan, namaMakanan, infoMakanan);
        }
    }
    private void setDataActivity(String fotoMakanan, String namaMakanan, String infoMakanan){
        Glide.with(this).asBitmap().load(fotoMakanan).into(imageViewFotoMakanan);
        textViewNamaMakanan.setText(namaMakanan);
        textViewInfoMakanan.setText(infoMakanan);
    }
}