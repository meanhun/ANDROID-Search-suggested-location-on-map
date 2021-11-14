package com.share4happy;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterAddress extends ArrayAdapter<Address_list> {
    Activity context;
    int resource;
    @NonNull List<Address_list> objects;
    public AdapterAddress(@NonNull Activity context, int resource, @NonNull List<Address_list> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View row, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        row = layoutInflater.inflate(this.resource,null);
        TextView tv = row.findViewById(R.id.textView);
        Address_list name_address = this.objects.get(position);
        tv.setText(name_address.getName());
        return row;
    }
}
