package prep4interview.chapter2;

/**
 * Created by opiskun on 1/13/16.
 */


/**
 * Created by opiskun on 1/12/16.
 */
public class Chapter2 {

    public static class List{
        private static class Node{
            public Integer data;
            public Node next;
        }
        private Node head;

        public void add(Integer d){
            Node n = new Node();
            n.data = d;
            n.next = head;
            head = n;
        }

        public void remove(Integer Kth){
            head = _remove(head, Kth);
        }

        private Node _remove(Node node, Integer pos){

            if (node == null){
                return  null;
            } else
            if (pos > 0){
                node.next = _remove(node.next,pos-1);
                return node;
            } else {
                return  node.next;
            }

        }
        public void reverse(){
            head = _reverse(head);
        }

        private Node _reverse(Node node){
            if (node.next == null){
                return node;
            }  else {
                Node n = _reverse(node.next);
                node.next.next = node;
                node.next = null;
                return n;
            }
        }

        public void print(){
            Node n = head;
            while (n != null){
                System.out.print("("+n.data+")->");
                n = n.next;
            }
            System.out.println("null");
        }
    }


    public static void main(String[] args){
        Chapter2.List list = new List();
        for(int i=0;i<10;i++){
            list.add(i);
            list.print();
        }
        list.reverse();
        list.print();
    }
}
