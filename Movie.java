/**
 *  Program 5
 *  This class provides the rating system for movies. It prompts the user to rate the movie based on its acting,
 *  visuals, plot, and its meaning.
 *  CS108-4
 *  5/9/20
 *  Alexander Westensee
 */

import java.util.Scanner;
public class Movie extends Media implements Computer {

    int acting;
    int visuals;
    int plot;
    int meaning;

    Scanner scanner = new Scanner(System.in);

    public Movie(String name){
        type = 1;
        this.name = name;
        requestActing();
        requestVisuals();
        requestPlot();
        requestMeaning();
        rating = computeRating();
    }

    public void requestActing(){
        System.out.println("What would you rate the acting in this movie out of ten?");

        boolean proceed = false;

        while (!proceed){
            int temp = scanner.nextInt();

            if ( temp >= 0 && temp <= 10 ){
                acting = temp;
                proceed = true;
            }else {
                System.out.println("Please enter a number between zero and ten");
                requestActing();
            }

        }

    }

    public void requestVisuals(){
        System.out.println("What would you rate the visuals in this movie out of ten?");

        boolean proceed = false;

        while (!proceed){
            int temp = scanner.nextInt();

            if ( temp >= 0 && temp <= 10 ){
                visuals = temp;
                proceed = true;
            }else {
                System.out.println("Please enter a number between zero and ten");
                requestVisuals();
            }

        }

    }

    public void requestPlot(){
        System.out.println("What would you rate the plot in this movie out of ten?");

        boolean proceed = false;

        while (!proceed){
            int temp = scanner.nextInt();

            if ( temp >= 0 && temp <= 10 ){
                plot = temp;
                proceed = true;
            }else {
                System.out.println("Please enter a number between zero and ten");
                requestPlot();
            }

        }

    }

    public void requestMeaning(){
        System.out.println("What would you rate the meaning/theme in this movie out of ten?");

        boolean proceed = false;

        while (!proceed){
            int temp = scanner.nextInt();

            if ( temp >= 0 && temp <= 10 ){
                meaning = temp;
                proceed = true;
            }else {
                System.out.println("Please enter a number between zero and ten");
                requestMeaning();
            }

        }

    }

    @Override
    public int computeRating() {
        return acting + visuals + plot + meaning;
    }
}
