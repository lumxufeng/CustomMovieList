package sg.edu.rp.c346.custommovielist;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<MovieItem> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);

        alMovieList = new ArrayList<>();

        MovieItem movie1 = new MovieItem("Avengers Infinity War", "Release Date: 2018.04");
        MovieItem movie2 = new MovieItem("Justice League", "Release Date: 2017.11");

        alMovieList.add(movie1);
        alMovieList.add(movie2);

        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);

        lvMovie.setAdapter(caMovie);

    }
}
