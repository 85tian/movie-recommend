package tj.platform.movierecommend.model.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.nio.file.DirectoryIteratorException;
import java.util.Date;
import java.util.List;

/**
 * @author 85
 * @date 2018/3/3 2018-03-03 20:03
 * @description ${description}
 */
public class Movie {
    //Id
    private String movieId;
    //电影名称
    private String movieName;

    //制片国家|地区
    private ProduceCountry produceCountry;
    //语言
    private String language;
    //上映日期
    private Date releaseDate;
    //片长
    private String runtime;
    //剧情简介
    private String synopsis;

    //头像
    private String movieHeadImage;
    //影片图片
    private List<String> imagePath;
    //导演
    private Director director;
    //演员
    private List<Actor> actors;
    //类型
    private List<Type> types;
    //编剧
    private List<SriptWriter> sriptWriters;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public ProduceCountry getProduceCountry() {
        return produceCountry;
    }

    public void setProduceCountry(ProduceCountry produceCountry) {
        this.produceCountry = produceCountry;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getMovieHeadImage() {
        return movieHeadImage;
    }

    public void setMovieHeadImage(String movieHeadImage) {
        this.movieHeadImage = movieHeadImage;
    }

    public List<String> getImagePath() {
        return imagePath;
    }

    public void setImagePath(List<String> imagePath) {
        this.imagePath = imagePath;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Type> getTypes() {
        return types;
    }

    public void setTypes(List<Type> types) {
        this.types = types;
    }

    public List<SriptWriter> getSriptWriters() {
        return sriptWriters;
    }

    public void setSriptWriters(List<SriptWriter> sriptWriters) {
        this.sriptWriters = sriptWriters;
    }


    public Movie() {
    }

    public Movie(String movieId, String movieName, ProduceCountry produceCountry, String language, Date releaseDate, String runtime, String synopsis, String movieHeadImage, List<String> imagePath, Director director, List<Actor> actors, List<Type> types, List<SriptWriter> sriptWriters) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.produceCountry = produceCountry;
        this.language = language;
        this.releaseDate = releaseDate;
        this.runtime = runtime;
        this.synopsis = synopsis;
        this.movieHeadImage = movieHeadImage;
        this.imagePath = imagePath;
        this.director = director;
        this.actors = actors;
        this.types = types;
        this.sriptWriters = sriptWriters;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
