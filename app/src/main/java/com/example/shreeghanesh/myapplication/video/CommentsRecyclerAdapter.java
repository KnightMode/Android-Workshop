package com.example.shreeghanesh.myapplication.video;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.shreeghanesh.myapplication.databinding.ItemCommentBinding;

import java.util.ArrayList;
import java.util.List;

public class CommentsRecyclerAdapter extends RecyclerView.Adapter<CommentsRecyclerAdapter.CommentsViewHolder> {

    private List<CommentItemViewModel> commentItemViewModels = new ArrayList<>();

    @NonNull
    @Override
    public CommentsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        ItemCommentBinding itemBinding = ItemCommentBinding.inflate(layoutInflater, viewGroup, false);
        return new CommentsViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentsViewHolder commentsViewHolder, int position) {
        CommentItemViewModel commentItemViewModel = commentItemViewModels.get(position);
        commentsViewHolder.bind(commentItemViewModel);
    }

    @Override
    public int getItemCount() {
        return commentItemViewModels.size();
    }

    public void setCommentItemViewModels(List<CommentItemViewModel> commentItemViewModels) {
        this.commentItemViewModels.addAll(commentItemViewModels);
        notifyDataSetChanged();
    }

    public class CommentsViewHolder extends RecyclerView.ViewHolder {

        private ItemCommentBinding itemCommentBinding;

        public CommentsViewHolder(ItemCommentBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemCommentBinding = itemBinding;
        }

        public void bind(CommentItemViewModel commentItemViewModel) {
            itemCommentBinding.textViewComment.setText(commentItemViewModel.getComment());
            itemCommentBinding.executePendingBindings();
        }
    }
}
