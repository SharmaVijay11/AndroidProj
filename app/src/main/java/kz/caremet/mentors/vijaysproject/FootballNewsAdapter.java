package kz.caremet.mentors.vijaysproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import kz.caremet.mentors.vijaysproject.models.FootballNews;

public class FootballNewsAdapter extends RecyclerView.Adapter<FootballNewsAdapter.FootballNewsViewHolder> {

    private ArrayList<FootballNews> dataset;
    private Context context;
    private OnItemFootballNewsClickListener onItemFootballNewsClickListener;

    FootballNewsAdapter(
            ArrayList<FootballNews> dataset,
            Context context,
            OnItemFootballNewsClickListener onItemFootballNewsClickListener
    ){
        this.dataset = dataset;
        this.context = context;
        this.onItemFootballNewsClickListener = onItemFootballNewsClickListener;
    }

    @NonNull
    @Override
    public FootballNewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FootballNewsViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_list,parent,false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull FootballNewsViewHolder holder, int position) {
        holder.bind(dataset.get(position));
    }


    @Override
    public int getItemCount() {
        return dataset.size();
    }

    class FootballNewsViewHolder extends RecyclerView.ViewHolder{

        FootballNewsViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        void bind(final FootballNews p){
            TextView titleTextView = itemView.findViewById(R.id.titleTextView);
            TextView descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            ImageView mainImage = itemView.findViewById(R.id.mainImage);
            ImageButton shareBtn = itemView.findViewById(R.id.listShareBtn);
            TextView created_at = itemView.findViewById(R.id.created_at);

            titleTextView.setText(p.getTitle());
            descriptionTextView.setText(p.getShortDescription());

            Glide.with(context)
                    .load(p.getImage_url())
                    .placeholder(R.drawable.ic_ball_load)
                    .into(mainImage);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemFootballNewsClickListener.startDetailsActivity(p.getId());
                }
            });

            created_at.setText(DateFormatter.getFormattedStringFromDate(p.getCratetion_date()));


            shareBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemFootballNewsClickListener.showToast("Не получилось сделать");
                }
            });
        }
    }
}

