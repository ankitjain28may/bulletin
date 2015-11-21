package com.droidbots.bulletin.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.droidbots.bulletin.R;
import com.droidbots.bulletin.adapters.EventAdapter;
import com.droidbots.bulletin.info.EventInfo;

import java.util.ArrayList;
import java.util.List;

public class EventFragment extends Fragment {


    private static final String PAGE = "page";
    private int mPage;
    public static EventFragment newInstance( int page) {
        EventFragment frag = new EventFragment();
        Bundle b = new Bundle();
        b.putInt(PAGE, page);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        if (!getArguments().containsKey(PAGE))
            throw new RuntimeException("Fragment must contain a \"" + PAGE + "\" argument!");
        mPage = getArguments().getInt(PAGE);
    }


    RecyclerView eventList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Select a layout based on the current page
        int layoutResId;

                layoutResId = R.layout.fragment_event_list;


        // Inflate the layout resource file
        View view = getActivity().getLayoutInflater().inflate(layoutResId, container, false);

        // Set the current page index as the View's tag (useful in the PageTransformer)
        view.setTag(mPage);


        eventList = (RecyclerView) view.findViewById(R.id.cardList);
        eventList.setHasFixedSize(false);
        LinearLayoutManager llm1 = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
        llm1.setSmoothScrollbarEnabled(true);
        eventList.setLayoutManager(llm1);

        EventAdapter storesAdapter = new EventAdapter(getActivity(),createList(10));
        eventList.setAdapter(storesAdapter);



        return view;
    }


    private List<EventInfo> createList(int size) {

        List<EventInfo> result = new ArrayList<EventInfo>();
        for (int i = 1; i <= size; i++) {
            EventInfo ci = new EventInfo();


            result.add(ci);

        }
        return result;
    }

}