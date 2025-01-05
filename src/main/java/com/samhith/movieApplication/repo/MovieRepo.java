package com.samhith.movieApplication.repo;

import com.samhith.movieApplication.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieRepo {
    //jdbc connection

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc(){
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }


    public void save(Movie m) {
        //System.out.println("saved the data");

        //run or insert values into table
        String sql = "insert into movieDB (director, hours, genre, id, name, imdb_rating) values (?, ?, ?, ?, ?, ?)";
        int rows = jdbc.update(sql, m.getDirector(), m.getDuration(), m.getGenre(), m.getId(), m.getName(), m.getImdbRating());
        System.out.println(rows + "effected");
    }


    //Show all the movies in the database
    public List<Movie> findAll() {
        String sql = "select * from movieDB";

        return jdbc.query(sql, (rs,rowNum) -> {
            //create an object
            Movie m = new Movie();

            m.setName(rs.getString("name"));
            m.setDirector(rs.getString("director"));
            m.setDuration(rs.getFloat("duration"));
            m.setGenre(rs.getString("genre"));
            m.setImdbRating(rs.getFloat("imdbRating"));
            m.setId(rs.getInt("id"));
            return m;
        });
    }
}
