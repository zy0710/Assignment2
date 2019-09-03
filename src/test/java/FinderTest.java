import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinderTest {

    @Test
    void findMax() {
        int array[]={10,90,80,55,39,20};
        int max=Finder.findMax(array);
        assertEquals(90, max);
    }

    @Test
    void findMin() {
        int array[] = {10,90,80,55,39,20};
        int min=Finder.findMin(array);
        assertEquals(10, min);
    }


    @Test
    void testnullfindMax(){
        int[] array = null;
        Integer max=Finder.findMax(array);
        assertEquals((Integer) null,max);
    }

    @Test
    void testnullfindMin(){
        int[] array = null;
        Integer min=Finder.findMin(array);
        assertEquals((Integer) null,min);
    }

    @Test
    void testemptyfindMax(){
        int[] array = {};
        Integer max=Finder.findMax(array);
        assertEquals((Integer) null,max);
    }

    @Test
    void testemptyfindMin(){
        int[] array = {};
        Integer min=Finder.findMin(array);
        assertEquals((Integer) null,min);
    }

}