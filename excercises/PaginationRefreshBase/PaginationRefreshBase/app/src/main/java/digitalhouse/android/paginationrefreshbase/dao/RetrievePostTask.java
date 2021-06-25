package digitalhouse.android.paginationrefreshbase.dao;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.util.List;

import digitalhouse.android.paginationrefreshbase.model.Post;
import digitalhouse.android.paginationrefreshbase.model.PostContainer;
import digitalhouse.android.paginationrefreshbase.util.DAOException;
import digitalhouse.android.paginationrefreshbase.util.HTTPConnectionManager;
import digitalhouse.android.paginationrefreshbase.util.ResultListener;

/**
 * Created by digitalhouse on 21/06/17.
 */

//ESTA CLASE ES UNA CLASE QUE ME PERMITE GENERAR UNA TAREA ASINCRONICA. ES DECIR, ESTA TAREA SE EJECUTARA
// INDEPENDIENTEMENTE DE LO QUE ESTE HACIENDO COMO ACTIVIDAD PRINCIPAL
public class RetrievePostTask extends AsyncTask<String, Void, List<Post>> {

    private ResultListener<List<Post>> listener;

    public RetrievePostTask(ResultListener<List<Post>> listener) {
        this.listener = listener;
    }


    PostContainer postContainer;

    //Esto método se ejecuta mientras sigue corriendo la tarea principal. Aqui lo que haremos es conectarnos
    // al servicio y descargar la lista.
    @Override
    protected List<Post> doInBackground(String... params) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        HTTPConnectionManager connectionManager = new HTTPConnectionManager();
        String input = null;

        try {
            input = connectionManager.getRequestString("http://blooming-garden-41675.herokuapp.com/posts/paginated");
            Gson gson = new Gson();
            postContainer = gson.fromJson(input, PostContainer.class);
        } catch (DAOException e) {
            e.printStackTrace();
        }

        return postContainer.getPostList();
    }

    //Una vez terminado el procesamiento, le avisamos al listener que ya tiene la lista disponible.
    @Override
    protected void onPostExecute(List<Post> productList) {
        this.listener.finish(productList);
    }
}