package digitalhouse.android.paginationrefreshbase.controller;

import android.content.Context;


import java.util.List;

import digitalhouse.android.paginationrefreshbase.dao.PostDAO;
import digitalhouse.android.paginationrefreshbase.model.Post;
import digitalhouse.android.paginationrefreshbase.util.ResultListener;


/**
 * Created by digitalhouse on 6/06/16.
 */
public class PostController {

    //El controller se encarga de pedirle la lista al DAO y luego le avisa al listener de la vista que ya esta disponible para que la use.
    public void getPostListPaginated(final ResultListener<List<Post>> listenerFromView, Context context) {
        PostDAO postDAO = new PostDAO();
        postDAO.getPostsPaginated(new ResultListener<List<Post>>() {
            @Override
            public void finish(List<Post> resultado) {
                listenerFromView.finish(resultado);
            }
        },0,10);
    }
}
