package chuongnh.hcm.foody.View.Home;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import chuongnh.hcm.foody.R;
import chuongnh.hcm.foody.View.Home.Adapter.ViewPagerAdapter;
import chuongnh.hcm.foody.View.Home.Fragment.FragmentWhatEat;
import chuongnh.hcm.foody.View.Home.Fragment.FragmentWhere;

public class HomeActivity extends AppCompatActivity {

    private Context context;
    private TabLayout tabLayout;

    private TextView textViewWhatEat;
    private TextView textViewWhere;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        connectView();
        setSupportActionBar(toolbar);

        toolbar.setTitle(null);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home_plus:
                        Toast.makeText(getApplication(), "menu home plus click", Toast.LENGTH_SHORT).show();
                        break;
                }
                return false;
            }
        });
        addPages();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    private void connectView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar_home);
        textViewWhatEat = (TextView) findViewById(R.id.textViewWhatEat);
        textViewWhere = (TextView) findViewById(R.id.textViewWhere);
        viewPager = (ViewPager) findViewById(R.id.viewpager_home);
    }

    private void addPages() {
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), context, viewPager, tabLayout);
        viewPager.setAdapter(viewPagerAdapter);
        viewPagerAdapter.addFragment(FragmentWhere.newInstance(), getString(R.string.where));
        viewPagerAdapter.addFragment(FragmentWhatEat.newInstance(), getString(R.string.whate_eat));
        viewPagerAdapter.notifyDataSetChanged();


        viewPager.setCurrentItem(0);
        textViewWhere.setSelected(true);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (viewPager.getCurrentItem() == 0)
                    resetTextViewSelected(true);
                else if (viewPager.getCurrentItem() == 1)
                    resetTextViewSelected(false);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void setTextViewWhere(View view) {
        resetTextViewSelected(true);
        viewPager.setCurrentItem(0);
    }

    public void setTextViewWhatEat(View view) {
        resetTextViewSelected(false);
        viewPager.setCurrentItem(1);
    }

    private void resetTextViewSelected(boolean state) {
        textViewWhere.setSelected(state);
        textViewWhatEat.setSelected(!state);
    }
}
