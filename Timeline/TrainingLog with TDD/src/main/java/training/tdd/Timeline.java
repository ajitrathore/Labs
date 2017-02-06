package training.tdd;

import java.util.List;

/**
 * Created by Ajit on 2/5/17.
 */
public class Timeline {


    public static final int FETCH_COUNT_UPPER_BOUND = 20;
    public static final int FETCH_COUNT_LOWER_BOUND = 1;

    private final int DEFAULT_FETCH_COUNT=10;
    private int fetchCount;
    private ItemProviderStub itemProvider;
    private List<Item>  items;

    public Timeline(ItemProviderStub itemProvider) {
        this.itemProvider=itemProvider;
        this.fetchCount = DEFAULT_FETCH_COUNT;
    }
    // fetchCount is Currently holding the total number
    // of items fetched in timeline

    public void setFetchCount(int fetchCount) {
        if(fetchCount<FETCH_COUNT_UPPER_BOUND && fetchCount >FETCH_COUNT_LOWER_BOUND)
        this.fetchCount = fetchCount;
    }


    public int getFetchCount() {
        return fetchCount;
    }

    public ItemProviderStub getItemProvider() {
        return itemProvider;
    }

    public List<Item>  getItems() {
        return items;
    }
}
