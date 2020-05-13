/**
 *  Program 5
 *  This program allows you to rate your favorite albums, movies, and tv shows based on certain factors specific to
 *  each type of media. You can then sort these ratings.
 *  CS108-4
 *  5/9/20
 *  Alexander Westensee
 */

import java.util.*;

public class RankMedia {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        ArrayList<Media> mediaList = new ArrayList<>();

        while ( !exit ) {

            System.out.println("What would you like to do?");
            System.out.println("1. Add new album");
            System.out.println("2. Add new movie");
            System.out.println("3. Add new TV show");
            System.out.println("4. Sort");
            System.out.println("5. Exit");

            int answer = scanner.nextInt();

            if ( answer == 1 ){
                System.out.println("What is the name of the album?");
                Album album = new Album(scanner.next());
                mediaList.add(album);

            }else if ( answer == 2 ){
                System.out.println("What is the name of the movie?");
                Movie movie = new Movie(scanner.next());
                mediaList.add(movie);

            }else if ( answer == 3 ){
                System.out.println("What is the name of the TV Show?");
                TVShow tvShow = new TVShow(scanner.next());
                mediaList.add(tvShow);

            }else if ( answer == 4 ){
                System.out.println("How would you like to sort your media?");
                System.out.println("1. Albums (worst to best)");
                System.out.println("2. Albums (best to worst)");
                System.out.println("3. Movies (worst to best)");
                System.out.println("4. Movies (best to worst)");
                System.out.println("5. TV Shows (worst to best)");
                System.out.println("6. TV Shows (best to worst)");
                System.out.println("7. All (worst to best)");
                System.out.println("8. All (best to worst)");

                Media[] mediaArray = new Media[mediaList.size()];

                for (int ind = 0 ; ind < mediaArray.length ; ind++ ){
                    mediaArray[ind] = mediaList.get(ind);
                }

                int i = 0;
                int j = 0;
                int indexSmallest = 0;

                for ( i = 0 ; i < mediaArray.length - 1 ; i++ ){

                    indexSmallest = i;

                    for ( j = i + 1 ; j < mediaList.size() ; j++ ){
                        if ( mediaArray[j].rating < mediaArray[indexSmallest].rating){
                            indexSmallest = j;
                        }
                    }

                    Media tempMedia = mediaArray[i];
                    mediaArray[i] = mediaArray[indexSmallest];
                    mediaArray[indexSmallest] = tempMedia;

                }

                int sortAnswer = scanner.nextInt();

                if (sortAnswer == 1) {

                    int rank = 1;

                    for (int ind = 0; ind < mediaArray.length; ind++) {

                        if (mediaArray[ind].type == 0) {
                            System.out.println(rank + ". " + mediaArray[ind].name);
                            rank++;
                        }

                    }

                } else if (sortAnswer == 2) {

                    int rank = 1;

                    for (int ind = mediaArray.length - 1; ind >= 0; ind--) {

                        if (mediaArray[ind].type == 0) {
                            System.out.println(rank + ". " + mediaArray[ind].name);
                            rank++;
                        }

                    }

                } else if (sortAnswer == 3) {

                    int rank = 1;

                    for (int ind = 0; ind < mediaArray.length; ind++) {

                        if (mediaArray[ind].type == 1) {
                            System.out.println(rank + ". " + mediaArray[ind].name);
                            rank++;
                        }

                    }

                } else if (sortAnswer == 4) {

                    int rank = 1;

                    for (int ind = mediaArray.length - 1; ind >= 0; ind--) {

                        if (mediaArray[ind].type == 1) {
                            System.out.println(rank + ". " + mediaArray[ind].name);
                            rank++;
                        }

                    }

                } else if (sortAnswer == 5) {

                    int rank = 1;

                    for (int ind = 0; ind < mediaArray.length; ind++) {

                        if (mediaArray[ind].type == 2) {
                            System.out.println(rank + ". " + mediaArray[ind].name);
                            rank++;
                        }

                    }

                } else if (sortAnswer == 6) {

                    int rank = 1;

                    for (int ind = mediaArray.length - 1; ind >= 0; ind--) {

                        if (mediaArray[ind].type == 2) {
                            System.out.println(rank + ". " + mediaArray[ind].name);
                            rank++;
                        }

                    }

                } else if (sortAnswer == 7) {
                    int rank = 1;

                    for (int ind = 0; ind < mediaArray.length; ind++) {

                        System.out.println(rank + ". " + mediaArray[ind].name);
                        rank++;

                    }

                } else if (sortAnswer == 8) {

                    int rank = 1;

                    for (int ind = mediaArray.length - 1; ind >= 0; ind--) {

                        System.out.println(rank + ". " + mediaArray[ind].name);
                        rank++;

                    }

                }

            }else if ( answer == 5 ){
                exit = true;
                break;

            } else {
                continue;

            }

        }

    }

}
