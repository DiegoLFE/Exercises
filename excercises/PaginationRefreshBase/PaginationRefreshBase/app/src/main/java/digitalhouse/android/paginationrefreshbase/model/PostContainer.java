package digitalhouse.android.paginationrefreshbase.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by andres on 22/06/16.
 */
public class PostContainer {

    @SerializedName("result")
    private List<Post> postList;

    public List<Post> getPostList() {
        return postList;
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }
}
