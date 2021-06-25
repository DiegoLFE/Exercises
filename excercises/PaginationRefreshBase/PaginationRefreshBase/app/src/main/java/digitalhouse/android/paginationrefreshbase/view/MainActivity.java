package digitalhouse.android.paginationrefreshbase.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import digitalhouse.android.paginationrefreshbase.R;


public class MainActivity extends AppCompatActivity {
    //Declaro todas estas variables como globales ya que las voy a usar a lo largo de la clase.
    private RecyclerView recyclerView;
    private AdapterPost adapterPost;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        //Seteo el adapter y los elementos del recyclerView
        adapterPost = new AdapterPost(getApplicationContext());
        recyclerView.setAdapter(adapterPost);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}











