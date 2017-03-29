package chuongnh.hcm.foody.View.Home.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import chuongnh.hcm.foody.Model.ModelWhatEat;
import chuongnh.hcm.foody.R;
import chuongnh.hcm.foody.View.Home.Adapter.AdapterWhatEat;

/**
 * Created by Nguyen Hoang Chuong on 3/29/2017.
 */

public class FragmentWhatEat extends Fragment {

    private RecyclerView recyclerView;
    private AdapterWhatEat adapterWhatEat;

    public FragmentWhatEat() {
    }

    // TODO: Rename and change types and number of parameters
    public static FragmentWhatEat newInstance() {
        return new FragmentWhatEat();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_whateat, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recycleViewWhatEat);
        List<ModelWhatEat> modelWhatEatList = new ArrayList<>();

        ModelWhatEat modelWhatEat = new ModelWhatEat(
                "",
                "Chả Bò Bánh Mì",
                "Somtum Der - Món Ăn Thái - Món Ăn Thái",
                "123 Pastuer, Quận 1", "", "Nguyễn Hoàng Chương", "29/08/2017");

        for (int i = 0; i < 100; i++) {
            modelWhatEatList.add(modelWhatEat);
        }

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);

        adapterWhatEat = new AdapterWhatEat(getActivity(), modelWhatEatList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterWhatEat);
        adapterWhatEat.notifyDataSetChanged();

        return view;
    }
}