package com.example.digitalhouse.persondatabase.view;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.digitalhouse.persondatabase.R;
import com.example.digitalhouse.persondatabase.controller.PersonController;
import com.example.digitalhouse.persondatabase.model.Person;
import com.example.digitalhouse.persondatabase.utils.ResultListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PersonController personController;
    private AdapterPersonas adapterPersonas;
    private ProgressBar progressBar;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapterPersonas = new AdapterPersonas(this);
        recyclerView.setAdapter(adapterPersonas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        //PONGO A CORRER EL PROGRESS BAR HASTA QUE SE CARGUE LA LISTA DE PERSONAS DE INTERNET
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setIndeterminate(true);

        personController = new PersonController(this);
        cargarLista();

        final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefresh);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                cargarLista();
            }
        });

    }


    public void cargarLista() {
        personController.obtenerListaDePersonas(new ResultListener<List<Person>>() {
            @Override
            public void finish(List<Person> persons) {
                adapterPersonas.setPersonList(persons);
                adapterPersonas.notifyDataSetChanged();
                Toast.makeText(MainActivity.this, "Refrescando lista", Toast.LENGTH_SHORT).show();
                swipeRefreshLayout.setRefreshing(false);
            }
        });
    }
}