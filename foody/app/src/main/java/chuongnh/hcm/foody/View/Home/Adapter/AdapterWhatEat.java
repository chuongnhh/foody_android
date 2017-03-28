package chuongnh.hcm.foody.View.Home.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import chuongnh.hcm.foody.R;

/**
 * Created by Nguyen Hoang Chuong on 3/27/2017.
 */

public class AdapterWhatEat  extends RecyclerView.Adapter<AdapterWhatEat.ViewHolder> {

    private Context context;
    private List<String> stringList;

    public AdapterWhatEat(Context context, List<String> stringList) {
        this.context = context;
        this.stringList = stringList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textViewWhatEatTitle);
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
        holder.textView.setText(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

}