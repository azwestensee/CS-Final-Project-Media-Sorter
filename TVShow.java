/**
 *  Program 5
 *  This class provides the rating system for TV shows. It prompts the user to rate the show based on its acting,
 *  plot, meaning, and its rewatchability.
 *  CS108-4
 *  5/9/20
 *  Alexander Westensee
 */

import java.util.Scanner;
public class TVShow extends Media implements Computer{

    int acting;
    int plot;
    int meaning;
    int rewatchable;

    Scanner scanner = new Scanner(System.in);

    public TVShow(String name){
        type = 2;
        this.name = name;
        requestActing();
        requestPlot();
        requestMeaning();
        requestRewatchable();
        rating = computeRating();
    }

    public void requestActing(){
        System.out.println("What would you rate the acting on this TV show out of ten?");

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

    public void requestPlot(){
        System.out.println("What would you rate the plot on this TV show out of ten?");

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
        System.out.println("What would you rate the meaning/theme on this TV show out of ten?");

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

    public void requestRewatchable(){
        System.out.println("What would you rate the rewatchability of this TV show out of ten?");

        boolean proceed = false;

        while (!proceed){
            int temp = scanner.nextInt();

            if ( temp >= 0 && temp <= 10 ){
                rewatchable = temp;
                proceed = true;
            }else {
                System.out.println("Please enter a number between zero and ten");
                requestRewatchable();
            }

        }
    }

    @Override
    public int computeRating() {
        return acting + plot + meaning + rewatchable;
    }
}
