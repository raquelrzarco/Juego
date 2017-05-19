package com.raquel.juego.Dialogs;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.raquel.juego.R;

public class RegistroFragment extends DialogFragment {


    public RegistroFragment() {
        // Required empty public constructor
    }

    public static RegistroFragment newInstance(){
        RegistroFragment dialogRegistroFragment = new  RegistroFragment();
        return  dialogRegistroFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public  interface RegistroDialogListener{
        void onPositiveClick(RegistroFragment dialogRegistroFragment);
        void onNegativeClick(RegistroFragment dialogRegistroFragment);

    }

    private RegistroDialogListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener= (RegistroDialogListener) getActivity();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Alert Dialog");
        builder.setMessage("Pulsa Ok para registrarse");
        builder.setCancelable(false);

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onPositiveClick(RegistroFragment.this);
            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onNegativeClick(RegistroFragment.this);
            }
        });

        return builder.create();
    }
}
