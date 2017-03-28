package chuongnh.hcm.foody.View.Home.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import chuongnh.hcm.foody.Model.ModelWhere;
import chuongnh.hcm.foody.R;
import chuongnh.hcm.foody.View.Home.Adapter.ApdapterWhere;

/**
 * Created by Nguyen Hoang Chuong on 3/27/2017.
 */

public class FragmentWhere extends Fragment {

    private RecyclerView recyclerView;
    private ApdapterWhere apdapterWhere;

    public FragmentWhere() {
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentWhere newInstance() {
        return new FragmentWhere();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_where, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycleViewWhere);
        List<ModelWhere> modelWhereList = new ArrayList<>();

        ModelWhere modelWhere = new ModelWhere(
                "Amore Coffee & Fresh Bread",
                "10B Kỳ Đồng, P.9, Quận 3, TP. HCM",
                "9.0",
                "13305.9km",
                "",

                "",
                "Nguyen Hoang Chuong",
                "Mình rất thích món ăn ở đây, vừa ngon lại còn rẻ nữa.",
                "8.0",

                "",
                "Phạm Thanh Trúc Linh",
                "Mình rất thích món ăn ở đây, vừa ngon lại còn rẻ nữa.",
                "8.5");

        for (int i = 0; i < 100; i++) {
            modelWhereList.add(modelWhere);
        }
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        apdapterWhere = new ApdapterWhere(getActivity(), modelWhereList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(apdapterWhere);
        apdapterWhere.notifyDataSetChanged();
        return view;
    }
}