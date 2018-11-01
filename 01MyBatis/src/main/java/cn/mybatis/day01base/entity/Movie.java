package cn.mybatis.day01base.entity;/**
 * Created by Happy on 2018-10-30.
 */

/**
 * 作者：微冷的雨
 *
 * @create 2018-10-30
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class Movie {
      private Integer  movieid;
      private String moviename;
      private String moviedirctor;
      private String movieactor;

    public Movie() {
    }

    public Movie(String moviename, String moviedirctor, String movieactor) {
        this.moviename = moviename;
        this.moviedirctor = moviedirctor;
        this.movieactor = movieactor;
    }

    public Integer getMovieid() {
        return movieid;
    }

    public void setMovieid(Integer movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getMoviedirctor() {
        return moviedirctor;
    }

    public void setMoviedirctor(String moviedirctor) {
        this.moviedirctor = moviedirctor;
    }

    public String getMovieactor() {
        return movieactor;
    }

    public void setMovieactor(String movieactor) {
        this.movieactor = movieactor;
    }
}


















