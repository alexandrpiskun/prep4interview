package prep4interview.chapter2;

import com.sun.istack.internal.NotNull;

/**
 * Created by opiskun on 1/13/16.
 */
public class List<T> {
    protected static class Node<T>{
        public T data;
        public Node next;
        public Node(){};
        public Node(T data, Node<T> next){ this.data = data; this.next = next;}
    }

    protected Node head;

    public class Iterator<T>{

        private Node<T> it;

        public Iterator(Node<T> n){
            it = n;
        }
        public boolean hasNext(){
            return  it != null && it.next!=null;
        }
        public T getData(){
            return it.data;
        }
        public boolean next(){
            if (it!=null && it.next != null){
                it = it.next;
                return true;
            }
            return  false;
        }
    }

    public Iterator<T> getIterator(){
        return new Iterator(head);
    }

    /**
     *
     * @param data - data to add into list.
     */
    public void add(@NotNull T data){
        Node n = new Node(data,head);
        head = n;
    }

    public void print(){
        Node n = head;
        while(n!=null){
            System.out.print(String.format("(%s)->",n.data.toString()));
        }
        System.out.println(String.format("null",n.data.toString()));
    }


}

/*

* */