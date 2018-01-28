package com.bitcoinmanager0118.bitcoinmanager0118;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.bitcoinmanager0118.bitcoinmanager0118.View.BookMarkFragment;
import com.bitcoinmanager0118.bitcoinmanager0118.View.MainFragment;
import com.bitcoinmanager0118.bitcoinmanager0118.View.SettingFragment;

public class MainActivity extends AppCompatActivity {

    FrameLayout main_fragmelayout;

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    MainFragment mainFragment = new MainFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_fragmelayout,mainFragment).commit();
                    return true;
                case R.id.navigation_dashboard:
                    BookMarkFragment bookMarkFragment = new BookMarkFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_fragmelayout,bookMarkFragment).commit();
                    return true;
                case R.id.navigation_notifications:
                    SettingFragment settingFragment = new SettingFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_fragmelayout,settingFragment).commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_fragmelayout = (FrameLayout)findViewById(R.id.main_fragmelayout);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);



    }

}
