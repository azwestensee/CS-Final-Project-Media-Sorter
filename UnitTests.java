public class UnitTests {
    public static void main (String[] args){
        computeAlbumTest();
        computeMovieTest();
        computeTVShowTest();

    }

    public static void computeAlbumTest(){
        Album album = new Album("Test Album");
        album.production = 5;
        album.vocals = 0;
        album.meaning = 10;
        album.cohesiveness = 8;
        album.computeRating();
        if ( album.rating == 23 ){
            System.out.println("SUCCESS: computeRating");
        }else {
            System.out.println("FAILED: computeRating");
        }
    }

    public static void computeMovieTest(){
        Movie movie = new Movie("Test Movie");
        movie.plot = 0;
        movie.acting = 10;
        movie.meaning = 5;
        movie.visuals = 8;
        movie.computeRating();
        if ( movie.rating == 23 ){
            System.out.println("SUCCESS: computeRating");
        }else {
            System.out.println("FAILED: computeRating");
        }
    }

    public static void computeTVShowTest(){
        TVShow tvShow = new TVShow("Test Album");
        tvShow.meaning = 5;
        tvShow.rewatchable = 0;
        tvShow.meaning = 10;
        tvShow.acting = 8;
        tvShow.computeRating();
        if ( tvShow.rating == 23 ){
            System.out.println("SUCCESS: computeRating");
        }else {
            System.out.println("FAILED: computeRating");
        }
    }


}
