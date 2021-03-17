package movies;

public class Movie {

    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = "horror";
    }



    public Object getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
