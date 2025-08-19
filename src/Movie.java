public class Movie {
    private String movie_id;
    private String movie_name;
    private String movie_duration;

    Movie(String movie_id, String movie_name, String movie_duration){
        this.movie_duration=movie_duration;
        this.movie_id=movie_id;
        this.movie_name=movie_name;
    }

    public String getMovie_name(){
        return movie_name;
    }

    public String getMovie_id(){
        return movie_id;
    }

    public String getMovie_duration(){
        return movie_duration;
    }

    public void setMovie_id(String movie_id){
        this.movie_id=movie_id;
    }

    public void setMovie_name(String movie_name){
        this.movie_name=movie_name;
    }

    public void setMovie_duration(String movie_duration){
        this.movie_duration=movie_duration;
    }
}
