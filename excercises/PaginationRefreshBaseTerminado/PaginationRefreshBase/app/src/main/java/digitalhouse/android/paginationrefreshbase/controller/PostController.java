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
    private static final Integer LIMIT = 10;
    private Integer offset = 0;

    private Boolean endPaging = false;

    public Boolean getEndPaging() {
        return endPaging;
    }

    //El controller se encarga de pedirle la lista al DAO y luego le avisa al listener de la vista que ya esta disponible para que la use.
    public void getPostListPaginated(final ResultListener<List<Post>> listenerFromView, Context context) {
        PostDAO postDAO = new PostDAO();
        postDAO.getPostsPaginated(new ResultListener<List<Post>>() {
            @Override
            public void finish(List<Post> resultado) {
                if (resultado != null && resultado.size() > 0){
                    offset = offset + LIMIT;
                    listenerFromView.finish(resultado);
                } else {
                    endPaging = true;
                }
            }
        },offset,LIMIT);
    }
}
