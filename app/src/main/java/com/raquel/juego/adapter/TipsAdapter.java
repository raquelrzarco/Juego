package com.raquel.juego.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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
        TextView tips;
        TextView numerotip;


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
            viewHolder.tips = (TextView) convertView1.findViewById(R.id.tips);
            viewHolder.numerotip = (TextView) convertView1.findViewById(R.id.numerotip);

            convertView1.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView1.getTag();
        }
        TipsBean tipsBean = objects.get(position);
        viewHolder.tips.setText(tipsBean.getPresentaciontip());
        viewHolder.numerotip.setText(tipsBean.getTip2());


        return convertView1;
    }
}
