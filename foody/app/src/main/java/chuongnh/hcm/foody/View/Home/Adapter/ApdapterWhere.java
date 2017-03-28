package chuongnh.hcm.foody.View.Home.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import chuongnh.hcm.foody.Model.ModelWhere;
import chuongnh.hcm.foody.R;

/**
 * Created by Nguyen Hoang Chuong on 3/27/2017.
 */

public class ApdapterWhere extends RecyclerView.Adapter<ApdapterWhere.ViewHolder> {

    private Context context;
    private List<ModelWhere> modelWhereList;

    public ApdapterWhere(Context context, List<ModelWhere> modelWhereList) {
        this.context = context;
        this.modelWhereList = modelWhereList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewWhereShopName;
        private TextView textViewShopRate;
        private TextView textViewWhereShopAddress;
        private TextView textViewWhereShopKm;

        private ImageView imageViewWhereShopImage;

        private Button buttonShopOrder;

        private  ImageView imageViewIconUserImage1;

        private TextView textViewUserComment1;
        private TextView textViewUserRate1;
        private TextView textViewCommentContent1;

        private  ImageView imageViewIconUserImage2;

        private TextView textViewUserComment2;
        private TextView textViewUserRate2;
        private TextView textViewCommentContent2;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewWhereShopName = (TextView) itemView.findViewById(R.id.textViewWhereShopName);
            textViewShopRate = (TextView) itemView.findViewById(R.id.textViewShopRate);
            textViewWhereShopAddress = (TextView) itemView.findViewById(R.id.textViewWhereShopAddress);
            textViewWhereShopKm = (TextView) itemView.findViewById(R.id.textViewWhereShopKm);

            imageViewWhereShopImage = (ImageView) itemView.findViewById(R.id.imageViewWhereShopImage);

            buttonShopOrder = (Button) itemView.findViewById(R.id.buttonShopOrder);

            imageViewIconUserImage1 = (ImageView) itemView.findViewById(R.id.imageViewIconUserImage1);

            textViewUserComment1 = (TextView) itemView.findViewById(R.id.textViewUserComment1);
            textViewUserRate1 = (TextView) itemView.findViewById(R.id.textViewUserRate1);
            textViewCommentContent1 = (TextView) itemView.findViewById(R.id.textViewCommentContent1);


            imageViewIconUserImage2 = (ImageView) itemView.findViewById(R.id.imageViewIconUserImage2);

            textViewUserComment2 = (TextView) itemView.findViewById(R.id.textViewUserComment2);
            textViewUserRate2 = (TextView) itemView.findViewById(R.id.textViewUserRate2);
            textViewCommentContent2 = (TextView) itemView.findViewById(R.id.textViewCommentContent2);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_recycleview_where, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textViewWhereShopName.setText(modelWhereList.get(position).getShopName());
        holder.textViewShopRate.setText(modelWhereList.get(position).getShopRate());
        holder.textViewWhereShopAddress.setText(modelWhereList.get(position).getShopAddress());
        holder.textViewWhereShopKm.setText(modelWhereList.get(position).getShopKm());

        holder.textViewUserComment1.setText(modelWhereList.get(position).getUserComment1());
        holder.textViewUserRate1.setText(modelWhereList.get(position).getUserRate1());
        holder.textViewCommentContent1.setText(modelWhereList.get(position).getCommentContent1());

        holder.textViewUserComment2.setText(modelWhereList.get(position).getUserComment2());
        holder.textViewUserRate2.setText(modelWhereList.get(position).getUserRate2());
        holder.textViewCommentContent2.setText(modelWhereList.get(position).getCommentContent2());
    }

    @Override
    public int getItemCount() {
        return modelWhereList.size();
    }

}
