package digitalhouse.android.paginationrefreshbase.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import digitalhouse.android.paginationrefreshbase.R;
import digitalhouse.android.paginationrefreshbase.controller.PostController;
import digitalhouse.android.paginationrefreshbase.model.Post;
import digitalhouse.android.paginationrefreshbase.util.ResultListener;


public class MainActivity extends AppCompatActivity {
    //Declaro todas estas variables como globales ya que las voy a usar a lo largo de la clase.
    private RecyclerView recyclerView;
    private AdapterPost adapterPost;
    private LinearLayoutManager linearLayoutManager;
    private PostController postController;
    private Boolean isLoading = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        postController = new PostController();
        postController.getPostListPaginated(new ResultListener<List<Post>>() {
            @Override
            public void finish(List<Post> result) {
                // ACA ENTRA CUANDO ME LLAMA EL CONTROLLER CUANDO TERMINA
                adapterPost.setPostList(result);
                adapterPost.notifyDataSetChanged();
            }
        }, MainActivity.this);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);


        //Seteo el adapter y los elementos del recyclerView
        adapterPost = new AdapterPost(getApplicationContext());
        recyclerView.setAdapter(adapterPost);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if (!postController.getEndPaging()){

                    Integer total = adapterPost.getItemCount();
                    Integer lastVisiblePosition = linearLayoutManager.findLastVisibleItemPosition();

                    // SI NO ESTA CARGANDO Y SE ESTA MOSTRANDO EL ANTE-ANTEULTIMO.
                    if (!isLoading && lastVisiblePosition + 2 >=  total) {
                        isLoading = true;
                        adapterPost.addNullElem();
                        postController.getPostListPaginated(new ResultListener<List<Post>>() {
                            @Override
                            public void finish(List<Post> result) {
                                isLoading = false;
                                adapterPost.removeNullElem();
                                adapterPost.addPostList(result);
                                adapterPost.notifyDataSetChanged();
                            }
                        }, MainActivity.this);
                    }

                }






            }
        });




    }
}











