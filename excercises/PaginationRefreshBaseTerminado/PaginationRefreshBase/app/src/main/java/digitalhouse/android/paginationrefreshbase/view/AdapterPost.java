package digitalhouse.android.paginationrefreshbase.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import digitalhouse.android.paginationrefreshbase.R;
import digitalhouse.android.paginationrefreshbase.model.Post;


public class AdapterPost extends RecyclerView.Adapter{
    private static final Integer ITEM_VIEW_COMMON = 1;
    private static final Integer ITEM_VIEW_PROGRESS_BAR = 2;

    private List<Post> postList;
    private Context context;

    public AdapterPost(Context context) {

        this.context = context;
        this.postList = new ArrayList<>();
    }

    public void setPostList(List<Post> postList) {
        this.postList = postList;
    }

    public void addPostList(List<Post> postList) {
        this.postList.addAll(postList);
    }

    public void addNullElem(){
        this.postList.add(null);
        notifyDataSetChanged();
    }

    public void removeNullElem(){
        this.postList.remove(getItemCount()-1);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        if (postList.get(position) == null){
            return ITEM_VIEW_PROGRESS_BAR;
        } else {
            return ITEM_VIEW_COMMON;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == ITEM_VIEW_COMMON) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_detalle, parent, false);
            return new PostViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.progress_bar_item, parent, false);
            return new ProgressHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof PostViewHolder) {
            Post aPost = postList.get(position);
            PostViewHolder unTitularViewHolder = (PostViewHolder) holder;
            unTitularViewHolder.bindPost(aPost, context);
        }
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    private static class ProgressHolder extends RecyclerView.ViewHolder{
        public ProgressHolder(View itemView) {
            super(itemView);
        }
    }

    private static class PostViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewId;
        private TextView textViewTitulo;
        private TextView textViewBody;
        private ImageView imageViewThumbnail;

        public PostViewHolder(View itemView) {
            super(itemView);
            textViewId = (TextView) itemView.findViewById(R.id.textViewId);
            textViewTitulo = (TextView) itemView.findViewById(R.id.textViewTitulo);
            textViewBody = (TextView) itemView.findViewById(R.id.textViewBody);
            imageViewThumbnail = (ImageView) itemView.findViewById(R.id.imageViewThumbnail);
        }

        public void bindPost(Post aPost, Context context){
            textViewId.setText(aPost.getID());
            textViewTitulo.setText(aPost.getTitle());
            textViewBody.setText(aPost.getBody());
            Glide.with(context).load("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/User_icon_2.svg/2000px-User_icon_2.svg.png").error(R.drawable.offlineuser).into(imageViewThumbnail);
        }
    }

}









