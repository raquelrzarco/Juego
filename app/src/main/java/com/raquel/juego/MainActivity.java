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
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.raquel.juego.bean.UsuarioBean;
import com.raquel.juego.fragments.AjustesFragment;
import com.raquel.juego.fragments.DescripcionFragment;
import com.raquel.juego.fragments.ObjetosFragment;
import com.raquel.juego.fragments.PerfilFragment;
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
        txtNombreHeader.setText("Hola, " +usuarioBean.getNombre());

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_action_menu);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navView.setNavigationItemSelectedListener(this);

        fm = getSupportFragmentManager();
        fm.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);

        DescripcionFragment descripcionFragment = DescripcionFragment.newInstance();
        fm.beginTransaction().replace(R.id.container, descripcionFragment).commit();
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
                //Solo fragment
                PerfilFragment perfilFragment = PerfilFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, perfilFragment).commit();
                break;
            case R.id.item_descripcion:
                //Solo fragment
                DescripcionFragment descripcionFragment = DescripcionFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, descripcionFragment).commit();
                break;
            case R.id.item_personajes:
                //con lista
                PersonajesFragment personajesFragment = PersonajesFragment.newInstance();
                fm.beginTransaction().replace(R.id.container,personajesFragment).commit();
                break;
            case R.id.item_objetos:
                //con lista
                ObjetosFragment objetosFragment = ObjetosFragment.newInstance();
                fm.beginTransaction().replace(R.id.container,objetosFragment).commit();
                break;
            case R.id.item_tips:
                //Lista
                TipsFragment tipsFragment = TipsFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, tipsFragment).commit();
                break;
            case R.id.item_ajustes:
                //Solo fragment
                AjustesFragment ajustesFragment = AjustesFragment.newInstance();
                fm.beginTransaction().replace(R.id.container, ajustesFragment).commit();
                break;
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