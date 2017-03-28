package chuongnh.hcm.foody.View.Main;

import android.app.LocalActivityManager;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

import chuongnh.hcm.foody.R;
import chuongnh.hcm.foody.View.Account.AccountActivity;
import chuongnh.hcm.foody.View.Collection.CollectionActivity;
import chuongnh.hcm.foody.View.Home.HomeActivity;
import chuongnh.hcm.foody.View.Notification.NotificationActivity;
import chuongnh.hcm.foody.View.Search.SearchActivity;

public class MainActivity extends AppCompatActivity {

    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectView();
        loadTabs(savedInstanceState);
        setBackgroundTabs();
        tabHost.getTabWidget().setBaselineAligned(false);
    }

    // set backgroud tab widget
    private void setBackgroundTabs() {
        Resources res = getResources();
        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
            tabHost.getTabWidget().getChildAt(i).setBackgroundColor(res.getColor(R.color.transparent));
        }
    }

    // connect View
    private void connectView() {
        tabHost = (TabHost) findViewById(android.R.id.tabhost);
    }

    // add tabs
    private void addTabs(String title, int drawable, Class<?> c) {
        Resources res = getResources();
        TabHost.TabSpec spec = tabHost.newTabSpec(title);
        spec.setIndicator("", res.getDrawable(drawable));
        Intent intent = new Intent(this, c);
        spec.setContent(intent);
        tabHost.addTab(spec);
    }

    // load tabs
    private void loadTabs(Bundle savedInstanceState) {
        LocalActivityManager localActivityManager = new LocalActivityManager(this, false);
        localActivityManager.dispatchCreate(savedInstanceState);
        tabHost.setup(localActivityManager);

        addTabs(getString(R.string.home), R.drawable.bg_tab_home_main, HomeActivity.class);
        addTabs(getString(R.string.collection), R.drawable.bg_tab_collection_main, CollectionActivity.class);
        addTabs(getString(R.string.account), R.drawable.bg_tab_search_main, SearchActivity.class);
        addTabs(getString(R.string.notification), R.drawable.bg_tab_notification_main, NotificationActivity.class);
        addTabs(getString(R.string.account), R.drawable.bg_tab_account_main, AccountActivity.class);

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {

            }
        });
    }
}
