package com.raquel.juego.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.raquel.juego.R;
import com.raquel.juego.bean.TipsBean;

import java.util.List;

/**
 * Created by ALUMNOS on 03/04/2017.
 */

public class TipsAdapter extends ArrayAdapter<TipsBean> {
    private Context context;
    private int resource;
    private List<TipsBean> objects;

    public TipsAdapter(Context context, int resource, List<TipsBean> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource = resource;
        this.objects=objects;
    }
    class ViewHolder{
        TextView descripciontips;
        TextView tip1;
        TextView tip2;
        TextView tip3;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        TipsAdapter.ViewHolder viewHoldertips;

        View convertView1 = convertView;
        ViewHolder viewHolder;
        if (convertView1 ==null){
            viewHolder = new ViewHolder();
            convertView1= LayoutInflater.from(context).inflate(resource,null);
            viewHolder.descripciontips = (TextView) convertView1.findViewById(R.id.descripciontips);
            viewHolder.tip1 = (TextView) convertView1.findViewById(R.id.tip1);
            viewHolder.tip2 = (TextView) convertView1.findViewById(R.id.tip2);
            viewHolder.tip3 = (TextView) convertView1.findViewById(R.id.tip3);
            convertView1.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView1.getTag();
        }
        TipsBean tipsBean = objects.get(position);
        viewHolder.descripciontips.setText(tipsBean.getPresentaciontip());
        viewHolder.tip1.setText(String.valueOf(tipsBean.getTip1()));
        viewHolder.tip2.setText(String.valueOf(tipsBean.getTip2()));
        viewHolder.tip3.setText(String.valueOf(tipsBean.getTip3()));

        return convertView1;
    }
}
