package com.example.countries;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.twocoffeesoneteam.glidetovectoryou.GlideToVectorYou;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ExampleViewHolder> {
    private Context context;
    private ArrayList<Model> arrayList;

    public MyAdapter(Context ctx, ArrayList<Model> aList) {
        context = ctx;
        arrayList = aList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list, parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        Model currentItem = arrayList.get(position);
        String imageUrl = currentItem.getFlag();
        String creatorName1 = currentItem.getName();
        String creatorName2 = currentItem.getCapital();
        String creatorName3 = currentItem.getRegion();
        String creatorName4 = currentItem.getSubregion();
        String creatorName5 = currentItem.getPopulation();
        String creatorName6 = currentItem.getBorders();
        String creatorName7 = currentItem.getLanguages();

        holder.t1.setText("Country Name : "+creatorName1);
        holder.t2.setText("Capital : "+creatorName2);
        holder.t3.setText("Region : "+creatorName3);
        holder.t4.setText("Subregion : "+creatorName4);
        holder.t5.setText("Papulation " +creatorName5);
        holder.t6.setText("Borders : "+creatorName6);
        holder.t7.setText("Languages :" + creatorName7);
        GlideToVectorYou.init().with(context)
                .load(Uri.parse(imageUrl),holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView t1,t2,t3,t4,t5,t6,t7;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.image_view);
            t1 = itemView.findViewById(R.id.tv1);
            t2 = itemView.findViewById(R.id.tv2);
            t3 = itemView.findViewById(R.id.tv3);
            t4 = itemView.findViewById(R.id.tv4);
            t5 = itemView.findViewById(R.id.tv5);
            t6 = itemView.findViewById(R.id.tv6);
            t7 = itemView.findViewById(R.id.tv7);
        }
    }
}