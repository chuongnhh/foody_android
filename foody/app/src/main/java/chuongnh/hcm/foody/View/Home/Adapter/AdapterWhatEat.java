package chuongnh.hcm.foody.View.Home.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import chuongnh.hcm.foody.Model.ModelWhatEat;
import chuongnh.hcm.foody.R;

/**
 * Created by Nguyen Hoang Chuong on 3/27/2017.
 */

public class AdapterWhatEat extends RecyclerView.Adapter<AdapterWhatEat.ViewHolder> {

    private Context context;
    private List<ModelWhatEat> modelWhatEatList;

    public AdapterWhatEat(Context context, List<ModelWhatEat> modelWhatEatList) {
        this.context = context;
        this.modelWhatEatList = modelWhatEatList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewWhatEatFoodImage;
        private TextView textViewWhatEatFoodName;

        private TextView textViewWhatEatShopName;
        private TextView textViewWhatEatAddress;

        private ImageView imageViewWhatEatUserImage;

        private TextView textViewWhatEatUserName;
        private TextView textViewWhatEatCommentContent;

        public ViewHolder(View itemView) {
            super(itemView);
            imageViewWhatEatFoodImage = (ImageView) itemView.findViewById(R.id.imageViewWhatEatFoodImage);
            textViewWhatEatFoodName = (TextView) itemView.findViewById(R.id.textViewWhatEatFoodName);

            textViewWhatEatShopName = (TextView) itemView.findViewById(R.id.textViewWhatEatShopName);
            textViewWhatEatAddress = (TextView) itemView.findViewById(R.id.textViewWhatEatAddress);

            imageViewWhatEatUserImage = (ImageView) itemView.findViewById(R.id.imageViewWhatEatUserImage);
            textViewWhatEatUserName = (TextView) itemView.findViewById(R.id.textViewWhatEatUserName);
            textViewWhatEatCommentContent = (TextView) itemView.findViewById(R.id.textViewWhatEatCommentContent);
        }
    }

    @Override
    public AdapterWhatEat.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_recycleview_whateat, parent, false);
        AdapterWhatEat.ViewHolder viewHolder = new AdapterWhatEat.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AdapterWhatEat.ViewHolder holder, int position) {
        //holder.imageViewWhatEatFoodImage.setText(modelWhatEatList.get(position).getFoodImage());
        holder.textViewWhatEatFoodName.setText(modelWhatEatList.get(position).getFoodName());

        holder.textViewWhatEatShopName.setText(modelWhatEatList.get(position).getShopName());
        holder.textViewWhatEatAddress.setText(modelWhatEatList.get(position).getAddress());

        holder.textViewWhatEatUserName.setText(modelWhatEatList.get(position).getUserComment());
        holder.textViewWhatEatCommentContent.setText(modelWhatEatList.get(position).getCommentContent());
    }

    @Override
    public int getItemCount() {
        return modelWhatEatList.size();
    }

}