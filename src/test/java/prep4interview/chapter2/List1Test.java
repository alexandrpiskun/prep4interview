package prep4interview.chapter2;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by opiskun on 1/13/16.
 */

public class List1Test {

    @Test
    public void testRemoveDuplicatesWithExtraMemoryRecursive(){
        List1<Integer>  list = new List1<Integer>();
        for(int i=0;i<10;i++){
            list.add(i);
            if(i%2==0){
                list.add(i);
            }
        }
        list.print();
        //list.removeDuplicatesWithExtraMemory_recursion();
        //list.print();
        Set<Integer>  values = new HashSet<Integer>(10);
        List<Integer>.Iterator<Integer> it;
            it = list.getIterator();
        while (it.hasNext()){
            if(!values.add(it.getData())){
                 Assert.fail();
            }
        }

    }

}
