package lab;

public class Actor {


    private String name;
    private String ID;
    private Float rating;

    public Actor() {
        name = null;
        ID= null;
        rating = 0.0f;
    }

    public Actor(String name, String ID, Float rating) {
        this.name = name;
        this.ID = ID;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public void prints()
    {
        System.out.println("Name " + "(" + rating + ")");
    }
}
