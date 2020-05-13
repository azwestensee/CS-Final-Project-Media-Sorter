/**
 *  Program 5
 *  The Media class provides the framework for the rating systems between different forms of media
 *  All types of media will fall under the same scale so they can be compared to each other.
 *  CS108-4
 *  5/9/20
 *  Alexander Westensee
 */

public abstract class Media {

    int rating;
    String name;
    int type;

    public int getRating(){
        return rating;
    }

    public String getName(){
        return name;
    }

    public void setRating(int rating){
        this.rating = rating;
    }

    public void setName(String name){
        this.name = name;
    }

}
