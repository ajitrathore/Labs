package training.tdd;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Ajit on 2/5/17.
 */
public class TimelineTest {
    private Timeline timeline;

    private ItemProviderStub itemProvider;


    // Initialize the SUT
    @Before
    public void setUp() throws Exception {
        itemProvider=new ItemProviderStub();
        timeline=new Timeline(itemProvider);
    }

    @Test
    public void getItemsIsNotNull() throws Exception {
        assertNotNull(timeline.getItems());
    }

    @Test
    public void getItemProviderShouldNotBeNull() throws Exception {

        assertNotNull(timeline.getItemProvider());
    }


    @Test
    public void initializeTimeline() throws Exception {

        //When we have a new timeline
        //then fetch count is set to be a positive number
        assertTrue(timeline.getFetchCount()>0);
    }

    @Test
    public void setFetchCount() throws Exception {
        //Given we have a new Fectch count

        final int NEW_FETCH_COUNT =15;

        //when we set the timeline fetchCount to New_Fetch_Count

        timeline.setFetchCount(NEW_FETCH_COUNT);

        //Then the New_Fetch_Count is equal to timeline.getFetchCount()
        assertTrue(timeline.getFetchCount()==NEW_FETCH_COUNT);

    }

    @Test
    public void setFetchCountExceedUpperBound() throws Exception {

        final int originalFetchCount=timeline.getFetchCount();

        timeline.setFetchCount(timeline.FETCH_COUNT_UPPER_BOUND+1);

        assertTrue(timeline.getFetchCount()==originalFetchCount);

    }

    @Test
    public void setFetchCountLowerBound() throws Exception {

        //given we know the originalFetchCount for timeline
        final int originalFetchCount=timeline.getFetchCount();

        //when fetch count is set to a value lower then FETCH_COUNT_LOWER_BOUND of timeline
        timeline.setFetchCount(timeline.FETCH_COUNT_LOWER_BOUND-1);

        //then timeline's new fetchcount is same as originalFetchCount
        assertTrue(timeline.getFetchCount()==originalFetchCount);

    }
}
