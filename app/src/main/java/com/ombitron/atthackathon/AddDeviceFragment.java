package com.ombitron.atthackathon;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ombitron.atthackathon.lists.ClientAdapter;

import java.util.ArrayList;

/**
 * Created by eric on 1/3/15.
 */
public class AddDeviceFragment extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.add_device, container,false);
        return view;
    }
}
