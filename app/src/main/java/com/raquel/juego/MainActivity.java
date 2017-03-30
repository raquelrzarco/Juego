package com.raquel.juego;


import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawer;
    private NavigationView navView;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        navView = (NavigationView) findViewById(R.id.navView);
        setSupportActionBar(toolbar);


        setSupportActionBar(toolbar);
        //No funciona preguntar por qué
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navView.setNavigationItemSelectedListener(this);

        fm = getSupportFragmentManager();
        fm.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                drawer.openDrawer(GravityCompat.START);
                break;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_descripcion:
                //Solo fragment
                //fm.beginTransaction().replace(R.id.container,fragment_descripcion).commit();
                break;
            case R.id.item_personajes:
                //con lista
            case R.id.item_objetos:
                //con lista
            case R.id.item_tips:
                //Solo fragment
            case R.id.item_ajustes:
                //Solo fragment
            case R.id.item_salir:
                //Solo fragment
        }
        item.setChecked(true);
        getSupportActionBar().setTitle(item.getTitle());
        drawer.closeDrawers();
        return true;
    }
}