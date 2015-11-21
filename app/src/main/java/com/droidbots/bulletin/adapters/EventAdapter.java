package com.droidbots.bulletin.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.droidbots.bulletin.EventActivity;
import com.droidbots.bulletin.R;
import com.droidbots.bulletin.info.EventInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ashish on 11/21/2015.
 */
public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ResultEventViewHolder> {
    public List<EventInfo> eventList = new ArrayList<>();
   // public int image[] = {R.drawable.item1, R.drawable.item2, R.drawable.item3, R.drawable.item4, R.drawable.item5, R.drawable.item6};
    Context context;

    public EventAdapter(Context context,List<EventInfo> eventList) {
        this.context = context;
        this.eventList=eventList;
    }

    public void setList(ArrayList<EventInfo> eventList){
        this.eventList = eventList;
        notifyDataSetChanged();
    }


    @Override
    public int getItemCount() {
        return eventList.size();
    }


    @Override
    public void onBindViewHolder(ResultEventViewHolder ViewHolder, int i) {
        EventInfo ci = eventList.get(i);
       // contactViewHolder.vName.setText(ci.getName());
        //contactViewHolder.vImage.setImageResource(image[1]);

     /*   contactViewHolder.setClickListener(new ResultStoreViewHolder.ClickListener() {
            @Override
            public void onClick(View v, int pos) {
                StoreInfo s = storeList.get(pos);
            }
        });
*/
    }


    @Override
    public ResultEventViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Log.v("type", String.valueOf(i));
        View itemView;
        itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_event_layout, viewGroup, false);

        return new ResultEventViewHolder(itemView);

    }


    class ResultEventViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        protected TextView vName;
        protected ImageView vImage;

        public ResultEventViewHolder(View v) {
            super(v);


            v.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            Intent i=new Intent(context, EventActivity.class);
            context.startActivity(i);
        }

    }


}