package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tests.BaseTest;
import tests.WatchlistPage;

import java.net.MalformedURLException;

public class CreateNewWatchlist extends BaseTest {
    WatchlistPage watchlistPage;

    @Given("^Click Watchlist tab$")
    public void clickWatchlistTab() throws MalformedURLException {
        Android_setUp_noReset();
        watchlistPage = new WatchlistPage(driver);
        watchlistPage.clickWatchlistTab();
    }

    @Given("^Click Create a Watchlist$")
    public void clickCreateAWatchlist() {
        watchlistPage.clickCreateAWatchlist();
    }

    @Given("^Enter Watchlist Name$")
    public void enterWatchlistName() {
        watchlistPage.enterWatchlistName("BestStocks");
    }

    @Given("^Click Add a Watchlist$")
    public void clickAddAWatchlist() {
        watchlistPage.clickSaveWatchlist();
    }
    @Then("^Watchlist is created successfully$")
    public void watchlistIsCreatedSuccessfully() {
        watchlistPage.checkWatchlistIsAdded("BestStocks");
    }
}
