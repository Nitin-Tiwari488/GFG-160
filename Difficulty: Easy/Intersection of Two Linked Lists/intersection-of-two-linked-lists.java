/* structure of list Node:

class Node
{
    int data;
    Node next;

    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution {
    
    // Function to find the intersection of two linked lists
    public Node findIntersection(Node head1, Node head2) {
        // add your code here
        
        HashSet<Integer> set = new HashSet<>();
        
        Node curr1 = head1;
        Node curr = head2;
        
        while(curr!=null){
            set.add(curr.data);
            curr = curr.next;
        }
        
        Node head3 = new Node(-1);
          Node tail = head3;
          
        while(curr1!=null){
            if(set.contains(curr1.data)){
                tail.next = new Node(curr1.data);
                tail = tail.next;
            }  
            curr1 = curr1.next;   
        }
         return head3.next;
    }
}