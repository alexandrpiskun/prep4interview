package prep4interview.chapter2;

import java.util.Set;
import java.util.HashSet;

/**
 * Created by opiskun on 1/13/16.
 */
public class List1<T> extends List<T> {

    /**
     * Remove duplicate elements from array using extra memory in roder to achieve O(N)
     * This is mutable operation which change state of object.
     * */

    public void removeDuplicatesWithExtraMemory_recursion(){
        Set<T> values = new HashSet<T>();
        this.head = _removeduplicates_recurion(head, values);
    }

    private Node<T> _removeduplicates_recurion(Node<T> node, Set<T> set){
        if(node==null) return null;
        if(set.add(node.data)){
            node.next = _removeduplicates_recurion(node.next,set);
            return node;
        }else{
            return  _removeduplicates_recurion(node.next,set);
        }
    }
}
