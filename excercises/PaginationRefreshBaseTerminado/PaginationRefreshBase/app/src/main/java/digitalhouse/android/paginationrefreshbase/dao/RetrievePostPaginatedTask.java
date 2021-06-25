package digitalhouse.android.paginationrefreshbase.dao;

import android.os.AsyncTask;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
public class RetrievePostPaginatedTask extends AsyncTask<String, Void, List<Post>> {

    private ResultListener<List<Post>> listener;

    public RetrievePostPaginatedTask(ResultListener<List<Post>> listenerFromController) {
        this.listener = listenerFromController;
    }

    //Esto método se ejecuta mientras sigue corriendo la tarea principal. Aqui lo que haremos es conectarnos
    // al servicio y descargar la lista.
    @Override
    protected List<Post> doInBackground(String... params) {
        String url = params[0];
        List<Post> posts = new ArrayList<>();

        HTTPConnectionManager connectionManager = new HTTPConnectionManager();
        InputStream inputStream = null;
        BufferedReader bufferedReader = null;
        PostContainer postContainer = null;

        try {
            //ACA LE CONCATENO AL PEDIDO EL OFFSET
            inputStream = connectionManager.getRequestStream(url);
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Gson gson = new Gson();
            postContainer = gson.fromJson(bufferedReader, PostContainer.class);
            posts = postContainer.getPostList();
        } catch (DAOException e) {
            e.printStackTrace();
        }finally {

            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

            connectionManager.closeConnection();
        }

        return posts;
    }

    //Una vez terminado el procesamiento, le avisamos al listener que ya tiene la lista disponible.
    @Override
    protected void onPostExecute(List<Post> posts) {
        this.listener.finish(posts);
    }
}