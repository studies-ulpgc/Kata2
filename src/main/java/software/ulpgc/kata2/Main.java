package software.ulpgc.kata2;

import software.ulpgc.kata2.io.MovieDeserializer;
import software.ulpgc.kata2.io.RemoteMovieLoader;
import software.ulpgc.kata2.model.Movie;

import java.util.List;

public class Main {
    private static final String url =
            "https://datasets.imdbws.com/title.basics.tsv.gz";

    public static void main(String[] args) {
        List<Movie> movies = new RemoteMovieLoader(url, MovieDeserializer::fromTsv).loadAll();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
