package com.ombitron.atthackathon.lists;

import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.ombitron.atthackathon.Client;
import com.ombitron.atthackathon.lists.ClientAdapter;

import java.util.ArrayList;

/**
 * Created by eric on 1/3/15.
 */
public class ClientListFragment extends ListFragment {

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Log.e("CLientListingsClick", position + " " + id);
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        ArrayList clients = new ArrayList();
        Client client = new Client("Test Client");
        clients.add(client);
        ClientAdapter adapter = new ClientAdapter(inflater.getContext(), clients);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
