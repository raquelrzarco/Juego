package com.raquel.juego;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.raquel.juego.bean.UsuarioBean;
import com.raquel.juego.fragments.PersonajesFragment;
import com.raquel.juego.fragments.TipsFragment;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawer;
    private NavigationView navView;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Preferncias preferencias = new Preferncias(this);

        UsuarioBean usuarioBean = preferencias.getUsuario();

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        navView = (NavigationView) findViewById(R.id.navView);
        setSupportActionBar(toolbar);

        View header=navView.getHeaderView(0); //Acccedes a al head
        TextView txtNombreHeader = (TextView) header.findViewById(R.id.txtNombre);
        usuarioBean.getNombre();

        setSupportActionBar(toolbar);
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
            case R.id.item_perfil:

                break;
            case R.id.item_descripcion:
                //Solo fragment
                //fm.beginTransaction().replace(R.id.container,fragment_descripcion).commit();
                break;
            case R.id.item_personajes:
                //con lista
                PersonajesFragment listPersonajesFragment = PersonajesFragment.newInstance();
                fm.beginTransaction().replace(R.id.container,listPersonajesFragment).commit();
                break;
            case R.id.item_objetos:
                //con lista
            case R.id.item_tips:
                TipsFragment tipsFragment = TipsFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, tipsFragment).commit();
            case R.id.item_ajustes:
                //Solo fragment
            case R.id.item_salir:
                Preferncias preferencias = new Preferncias(this);
                preferencias.setLogin(false);
                Intent intent = new Intent(this,LoginActivity.class);
                startActivity(intent);
                finish();
                break;
                //Solo fragment
        }
        item.setChecked(true);
        getSupportActionBar().setTitle(item.getTitle());
        drawer.closeDrawers();
        return true;
    }
}