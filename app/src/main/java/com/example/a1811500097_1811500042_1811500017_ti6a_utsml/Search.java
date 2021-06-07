package com.example.a1811500097_1811500042_1811500017_ti6a_utsml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Search extends AppCompatActivity {
    private ArrayList<String> fotoMakanan = new ArrayList<>();//Deskripsi fungsi array
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        getDataFromInternet();

    }

    //berfungsi untuk membuat menu makanan bergulir kebawah
    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.listView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan,  this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    //ambil data
    private void getDataFromInternet(){
        namaMakanan.add("Nasi Goreng");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/nasgormafia-b191807f2a6aa267e2474d958bbff0e6.jpg");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");


        namaMakanan.add("Bakso");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/bakso-ranto-5eddecd8a4e9865a8546a7af884ab093.jpg");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");

        namaMakanan.add("Mie Ayam");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/doyanbakmi-1db5ff1d59a493877ddbc51d78ce72a1.jpg");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");

        namaMakanan.add("Sate Ayam");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/jajanyogya-4fec536762239d734d2cd78a6e66e946.jpg");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");

        namaMakanan.add("Rujak Buah");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/cecekuliner-bd5830694014e3147ea9a695528272e2.jpg");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");

        namaMakanan.add("Nasi Padang");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/ajakmakan-c9904b6b6fbf7b78bb9c97aa2fac0e69.jpg");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");

        namaMakanan.add("Ketoprak");
        fotoMakanan.add("https://cdn.popbela.com/content-images/post/20190305/a3668c99956be925ec8b08bd000d55dc.jpg");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");

        namaMakanan.add("Nasi Uduk");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/MWm0lAiOEM.jpg");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");

        namaMakanan.add("Soto");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/HAreePpDt1.jpg");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");

        namaMakanan.add("Gado-Gado");
        fotoMakanan.add("https://ds393qgzrxwzn.cloudfront.net/resize/m720x480/cat1/img/images/0/3hK8KLFy3G.jpg");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");

        namaMakanan.add("Sup Sapi");
        fotoMakanan.add("https://www.masakapahariini.com/wp-content/uploads/2019/01/sop-daging-sapi-780x440.jpg");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");

        namaMakanan.add("Ayap Penyet");
        fotoMakanan.add("https://akcdn.detik.net.id/community/media/visual/2020/10/28/ayam-penyet-ala-jawa-timur-1.jpeg?w=700&q=90");
        infoMakanan.add("Alamat: JL.safri No.250 samping Toko Bangunan Abadi.    Dijamin Halal dan Enak. Harga RP. 25.000/bungkus");

        prosesRecyclerViewAdapter();
    }
//menyambungkan setiap tombol ke layout
    public void search(View view){
        Intent i = new Intent(this, Search.class);
        startActivity(i);
    }

    public void prof(View view){
        Intent i = new Intent(this, Profile.class);
        startActivity(i);
    }

    public void home(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}