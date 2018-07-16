package sg.edu.rp.c346.custommovielist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by 16043921 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id; // it is the movie_item
    ArrayList<MovieItem> movieList;

    //TODO
    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MovieItem> objects) {
        super(context, resource, objects);
        parent_context = context; //assignment initializing
        layout_id = resource;
        movieList = objects;

    }

    //display 1 row item this method will be called once
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);

        MovieItem currentItem = movieList.get(position);
        String name = currentItem.getName();
        String date = currentItem.getDate();

        tvName.setText(name);
        tvDate.setText(date);

        return rowView;
    }
}
