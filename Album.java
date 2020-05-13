/**
 *  Program 5
 *  This class provides the rating system for Albums, prompting the user to rate the production, vocals, meaning, and
 *  its cohesiveness.
 *  CS108-4
 *  5/9/20
 *  Alexander Westensee
 */

import java.util.Scanner;
public class Album extends Media implements Computer {

    int production;
    int vocals;
    int meaning;
    int cohesiveness;

    Scanner scanner = new Scanner(System.in);

    public Album(String name){
        type = 0;
        this.name = name;
        requestProduction();
        requestVocals();
        requestMeaning();
        requestCohesiveness();
        rating = computeRating();
    }

    public void requestProduction(){

        System.out.println("What would you rate the production on this album out of ten?");

        boolean proceed = false;

        while (!proceed){
            int temp = scanner.nextInt();

            if ( temp >= 0 && temp <= 10 ){
                production = temp;
                proceed = true;
            }else {
                System.out.println("Please enter a number between zero and ten");
                requestProduction();
            }

        }

    }

    public void requestVocals(){
        System.out.println("What would you rate the vocals on this album out of ten?");

        boolean proceed = false;

        while (!proceed){
            int temp = scanner.nextInt();

            if ( temp >= 0 && temp <= 10 ){
                vocals = temp;
                proceed = true;
            }else {
                System.out.println("Please enter a number between zero and ten");
                requestVocals();
            }

        }
    }

    public void requestMeaning(){
        System.out.println("What would you rate the meaning/theme on this album out of ten?");

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

    public void requestCohesiveness(){
        System.out.println("What would you rate the cohesiveness on this album out of ten?");

        boolean proceed = false;

        while (!proceed){
            int temp = scanner.nextInt();

            if ( temp >= 0 && temp <= 10 ){
                cohesiveness = temp;
                proceed = true;
            }else {
                System.out.println("Please enter a number between zero and ten");
                requestCohesiveness();
            }

        }
    }

    @Override
    public int computeRating() {
        return production + vocals + meaning + cohesiveness;
    }

}
