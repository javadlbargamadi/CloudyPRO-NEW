package com.sematecjavaproject.cloudypro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;

    ImageView imgDrawerLayout;
    ImageView imgSearchIcon;
    TabLayout tabLayout;
    ViewPager viewPager;

    FragmentAdapterActivity fragmentAdapterActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        imgDrawerLayout = findViewById(R.id.imgDrawerLayout);
        imgSearchIcon = findViewById(R.id.imgSearchIcon);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        fragmentAdapterActivity = new FragmentAdapterActivity(getSupportFragmentManager());

        viewPager.setAdapter(fragmentAdapterActivity);

        tabLayout.setupWithViewPager(viewPager);

        imgDrawerLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        imgSearchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
    }
}
