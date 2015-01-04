package com.ombitron.atthackathon.lists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.ombitron.atthackathon.Client;
import com.ombitron.atthackathon.R;


import java.util.ArrayList;

/**
 * Created by eric on 1/3/15.
 */
public class ClientAdapter extends ArrayAdapter<Client> {
    private static class ViewHolder {
        TextView name;
    }

    public ClientAdapter(Context context, ArrayList<Client> clients){
        super(context, R.layout.client_listing, clients);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Client client = getItem(position);
        ViewHolder viewHolder;
        if(convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from((getContext()));
            convertView = inflater.inflate(R.layout.client_listing, null);
            viewHolder.name = (TextView) convertView.findViewById(R.id.rName);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.name.setText(client.getName());

        return convertView;
    }

}
