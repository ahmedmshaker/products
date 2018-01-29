package com.assignment.businessboomertask.products.view;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import com.assignment.businessboomertask.R;
import com.assignment.businessboomertask.base.Constants;
import com.assignment.businessboomertask.home.view.MainActivity;
import com.assignment.businessboomertask.productdetails.view.DetailsActivity;
import com.assignment.businessboomertask.products.model.Item;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by shika on 25-Jan-18.
 */

public class ProductsRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<Item> products;
    LayoutInflater layoutInflater;
    Picasso picasso;
    MainActivity mainActivity;

    String accessToken;

    private final int VIEW_TYPE_ITEM = 0;
    private final int VIEW_TYPE_LOADING = 1;

    @Inject
    public ProductsRecyclerAdapter(MainActivity mainActivity, Picasso picasso) {
        products = new ArrayList<>();
        layoutInflater = LayoutInflater.from(mainActivity);
        this.picasso = picasso;
        this.mainActivity = mainActivity;
    }


    @Override
    public int getItemCount() {
        return products.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_ITEM) {
            View view = layoutInflater.inflate(R.layout.recycler_product_item, parent, false);
            return new ProductViewHolder(view);
        } else if (viewType == VIEW_TYPE_LOADING) {
            View view = layoutInflater.inflate(R.layout.loading_item, parent, false);
            return new LoadingViewHolder(view);
        }
        return null;
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof ProductViewHolder) {
            Item item = products.get(position);
            ProductViewHolder itemViewHolder = (ProductViewHolder) holder;

            if (item.getImages() != null && item.getImages().get(0) != null) {
                String path = item.getImages().get(0).getPath();
                picasso.load(Constants.BASE_URL + Constants.IMAGE_PATH + path).into(itemViewHolder.productImageView);
            }

            itemViewHolder.productName.setText(item.getName());
            itemViewHolder.productRating.setRating(item.getAverageRating());


        } else if (holder instanceof LoadingViewHolder) {
            LoadingViewHolder loadingViewHolder = (LoadingViewHolder) holder;
            loadingViewHolder.progressBar.setIndeterminate(true);
        }

    }

    @Override
    public int getItemViewType(int position) {
        return products.get(position) == null ? VIEW_TYPE_LOADING : VIEW_TYPE_ITEM;
    }


    public void setAuthToken(String token) {
        this.accessToken = token;
    }

    public void setProductsItems(List<Item> items) {
        products.clear();
        products.addAll(items);
        notifyDataSetChanged();
    }

    class LoadingViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.progressBar1)
        ProgressBar progressBar;

        public LoadingViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    class ProductViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.product_image)
        CircleImageView productImageView;

        @BindView(R.id.product_name)
        TextView productName;

        @BindView(R.id.product_rating)
        RatingBar productRating;

        public ProductViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @OnClick(R.id.card_item)
        void onClick() {

            //we can do it with Event Bus but i don't have enough time
            Intent intent = new Intent(mainActivity, DetailsActivity.class);
            intent.putExtra(Constants.CODE, products.get(getAdapterPosition()).getCode());
            intent.putExtra(Constants.AUTH_TOKEN, accessToken);
            mainActivity.startActivity(intent);
        }
    }
}
