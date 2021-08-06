package com.example.music_player;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.recyclerview.widget.RecyclerView;


import java.util.List;


public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.ViewHolder> {
    private List<SongInfo> songList;
    private Context context;

    public MyCustomAdapter(List<SongInfo> list, Context context) {
        this.songList = list;
        this.context = context;
    }

    @Override
    public MyCustomAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item,parent,false);
        return new ViewHolder(v);
    }
    //en son bu
    @Override
    public void onBindViewHolder( MyCustomAdapter.ViewHolder holder, int position) {
        SongInfo songInfoItems=songList.get(position);
        if(songInfoItems.getSong_name().endsWith(".m4a") || songInfoItems.getSong_name().endsWith(".wav")){
            if(!songInfoItems.getSong_name().endsWith("(1).m4a")){
                holder.artistNameTxt.setText(songInfoItems.getArtist_name());
                holder.songNameTxt.setText(songInfoItems.getSong_name());
            }

        }
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView songNameTxt;
        TextView artistNameTxt;
        public ViewHolder(View itemView) {
            super(itemView);
            songNameTxt=itemView.findViewById(R.id.textViewName);
            artistNameTxt=itemView.findViewById(R.id.textViewArtistName);

        }
    }

}
