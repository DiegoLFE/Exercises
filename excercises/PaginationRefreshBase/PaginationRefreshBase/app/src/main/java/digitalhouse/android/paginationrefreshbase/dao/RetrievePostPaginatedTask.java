package digitalhouse.android.paginationrefreshbase.dao;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.util.List;

import digitalhouse.android.paginationrefreshbase.model.Post;
import digitalhouse.android.paginationrefreshbase.model.PostContainer;
import digitalhouse.android.paginationrefreshbase.util.HTTPConnectionManager;
import digitalhouse.android.paginationrefreshbase.util.ResultListener;

/**
 * Created by digitalhouse on 21/06/17.
 */

//ESTA CLASE ES UNA CLASE QUE ME PERMITE GENERAR UNA TAREA ASINCRONICA. ES DECIR, ESTA TAREA SE EJECUTARA
// INDEPENDIENTEMENTE DE LO QUE ESTE HACIENDO COMO ACTIVIDAD PRINCIPAL
public class RetrievePostPaginatedTask extends AsyncTask<String, Void, List<Post>> {

    private ResultListener<List<Post>> listener;

    //Aca voy a guardar el offset y el pageSize que me van a pasar para hacer el pedido al servicio
    private Integer offset;
    private Integer pageSize;

    public RetrievePostPaginatedTask(ResultListener<List<Post>> listenerFromController,
                                     Integer offset, Integer pageSize) {
        this.listener = listenerFromController;
        this.offset = offset;
        this.pageSize = pageSize;
    }

    //Esto método se ejecuta mientras sigue corriendo la tarea principal. Aqui lo que haremos es conectarnos
    // al servicio y descargar la lista.
    @Override
    protected List<Post> doInBackground(String... params) {

        HTTPConnectionManager connectionManager = new HTTPConnectionManager();
        String input = null;
        PostContainer postContainer = null;

        try {
            Thread.sleep(5000);
            //ACA LE CONCATENO AL PEDIDO EL OFFSET
            input = connectionManager.getRequestString("http://blooming-garden-41675.herokuapp.com/posts/paginated?offset="+offset+"&pageSize=" + pageSize);
            Gson gson = new Gson();
            postContainer = gson.fromJson(input, PostContainer.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return postContainer.getPostList();
    }

    //Una vez terminado el procesamiento, le avisamos al listener que ya tiene la lista disponible.
    @Override
    protected void onPostExecute(List<Post> posts) {
        this.listener.finish(posts);
    }
}