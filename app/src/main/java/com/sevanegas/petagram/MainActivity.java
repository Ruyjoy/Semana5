    package com.sevanegas.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.sevanegas.petagram.fragment.BlankFragment;
import com.sevanegas.petagram.fragment.RecyclerViewFragment;

import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayaout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayaout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();
        setToolBar();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_opciones, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {

            switch (item.getItemId()){
                case R.id.acercaDe:
                    Intent intent=new Intent(this, acercaDe.class);
                    startActivity(intent);
                    break;
            }
            switch (item.getItemId()){
               case R.id.btFav:
                   Intent i = new Intent(this, Favorito.class);
                    startActivity(i);
                    break;
            }
            switch (item.getItemId()){
                case R.id.Contacto:
                   Intent g=new Intent(this, Contacto.class);
                   startActivity(g);
                    return true;

            }
            return super.onOptionsItemSelected(item);
        }

        private ArrayList<Fragment> agregarFragments(){
            ArrayList<Fragment> fragments = new ArrayList<>();

            fragments.add(new RecyclerViewFragment());
            fragments.add(new BlankFragment());

            return fragments;
        }

        private void setUpViewPager(){
            viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
            tabLayaout.setupWithViewPager(viewPager);

            //tabLayaout.getTabAt(0).setIcon(R.drawable.iconhouse);
            //tabLayaout.getTabAt(1).setIcon(R.drawable.iconpug);
        }

        public void setToolBar(){
            Toolbar appBar = findViewById(R.id.actionbar);
            setSupportActionBar(appBar);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            tabLayaout.getTabAt(0).setIcon(R.drawable.iconhouse);
            tabLayaout.getTabAt(1).setIcon(R.drawable.iconpug);

        }
    }