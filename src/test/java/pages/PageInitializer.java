package pages;


import utilities.Driver;

public class PageInitializer extends Driver {

    public static AmazonHomePage amazonHomePage;
    public static PrimeVideoPage primeVideoPage;
    public static SearchResultsPage searchResultsPage;


    public static void initialize() {
        amazonHomePage = new AmazonHomePage();
        primeVideoPage = new PrimeVideoPage();
        searchResultsPage = new SearchResultsPage();
    }

}
