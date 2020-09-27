package com.example.volleypag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.VH> {
    private List<Comment> commentList;
    public CommentAdapter(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @NonNull
    @Override
    public CommentAdapter.VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.comment_list, parent));
    }

    @Override
    public void onBindViewHolder(@NonNull CommentAdapter.VH holder, int position) {
        Comment comment = commentList.get(position);

        if(comment != null){
            holder.name.setText(comment.getName());
            holder.body.setText(comment.getBody());
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class VH extends RecyclerView.ViewHolder{
        TextView name, body;
        public VH(View itemView){
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.textView1);
            body = (TextView) itemView.findViewById(R.id.textView2);

        }
    }
}
