package digitalhouse.android.paginationrefreshbase.dao;

import java.util.List;

import digitalhouse.android.paginationrefreshbase.model.Post;
import digitalhouse.android.paginationrefreshbase.util.ResultListener;


/**
 * Created by digitalhouse on 6/06/16.
 */
public class PostDAO {
    //ESTE METODO CHEQUEA SI TIENE CONEXION DE INTERNET, EN CASO AFIRMATIVO GENERAMOS EL ASYNC TASK Y PEDIMOS EL LISTADO A LA
    //URL, EN CASO NEGATIVO PEDIMOS EL CONTENIDO A LA BASE DE DATOS.
    public void getAllPosts(final ResultListener<List<Post>> listenerFromController) {
        RetrievePostTask retrieveProductsTask = new RetrievePostTask(listenerFromController);
        retrieveProductsTask.execute();
    }

    //ESTE METODO CHEQUEA SI TIENE CONEXION DE INTERNET, EN CASO AFIRMATIVO GENERAMOS EL ASYNC TASK Y PEDIMOS EL LISTADO A LA
    //URL, EN CASO NEGATIVO PEDIMOS EL CONTENIDO A LA BASE DE DATOS.
    public void getPostsPaginated(final ResultListener<List<Post>> listener,
                                  Integer offset, Integer limit) {
        RetrievePostPaginatedTask retrieveProductsTask =
                new RetrievePostPaginatedTask(listener);
        retrieveProductsTask.execute("http://blooming-garden-41675.herokuapp.com/posts/paginated?offset="+offset+"&pageSize=" + limit);
    }
}




















