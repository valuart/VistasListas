package com.example.vistaslistas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vistaslistas.Modelo.Inmueble;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private InmuebleAdapter iadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rvInmueble);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL,false);
        rv.setLayoutManager(gridLayoutManager);
        iadapter = new InmuebleAdapter(ObtenerInmuebles(), this,getLayoutInflater());
        rv.setAdapter(iadapter);
    }

    private ArrayList <Inmueble> ObtenerInmuebles(){
        ArrayList<Inmueble> lista = new ArrayList<>();
        lista.add(new Inmueble("Colon 1325", (double) 45000,R.drawable.casa1));
        lista.add(new Inmueble("Mitre 132", (double) 50000,R.drawable.casa2));
        lista.add(new Inmueble("Lafinur 25", (double) 70000,R.drawable.casa3));
        lista.add(new Inmueble("San Martin 13", (double) 35000,R.drawable.casa1));
        lista.add(new Inmueble("Las Palomas 32", (double) 20000,R.drawable.casa2));
        lista.add(new Inmueble("Lanus 55", (double) 50000,R.drawable.casa3));
        return lista;
    }
}