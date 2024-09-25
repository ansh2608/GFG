public class Main {
    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node reverse(Node head){
        if(head==null || head.next==null)return head;
        Node rest=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return rest;
    }

    Node findMid(Node head){
        if(head==null)return null;
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    boolean isPalindrome(Node head) {
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }

        if(cnt==1 || cnt==0)return true;
        if(cnt==2){
            if(head.data==head.next.data)return true;
            else return false;
        }

        if(cnt%2==0){
            Node mid=findMid(head);
            Node s2=reverse(mid);
            Node s1=head;
            while(s1!=null && s2!=null){
                if(s1.data==s2.data){
                    s1=s1.next;
                    s2=s2.next;
                }else {
                    return false;
                }
            }
        }else {
            Node mid=findMid(head);
            Node s2=reverse(mid.next);
            Node s1=head;

            while(s1!=null && s2!=null){
                if(s1.data==s2.data){
                    s1=s1.next;
                    s2=s2.next;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}