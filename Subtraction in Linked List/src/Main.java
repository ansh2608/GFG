public class Main {
    public static class Node {
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    public static Node removeLeadingZeroes(Node a){
        if (a!=null && a.data==0) a=a.next;
        return a;
    }
    public static int length(Node head){
        int len=0;
        while (head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    public static Node findLarger(Node head1,int len1,Node head2,int len2){
        Node temp1=head1,temp2=head2;
        if (len1>len2){
            temp1=head1;
            temp2=head2;
        }
        else if (len1<len2){
            temp1=head2;
            temp2=head1;
        }
        else {
            while (temp1!=null && temp2!=null){
                if (temp1.data>temp2.data){
                    temp1=head1;
                    temp2=head2;
                    break;
                }
                else if (temp1.data< temp2.data){
                    temp1=head2;
                    temp2=head1;
                    break;
                }
                temp1=temp1.next;
                temp2=temp2.next;
            }
            if (temp1==null && temp2==null) return new Node(0);
        }
        return subtract(temp1,temp2);
    }
    public static Node reverse(Node head){
        Node prev=null,curr=head,ptr=null;
        while (curr!=null){
            ptr=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ptr;
        }
        return prev;
    }
    public static Node subtract(Node n1, Node n2){
        Node l1 = n1,l2 = n2;
        l1 = reverse(l1);
        l2 = reverse(l2);
        Node res = new Node(-1),temp = res;
        int borrow = 0,diff = 0;
        while(l1 != null){
            diff = borrow + l1.data - ((l2 != null)?l2.data:0);
            if(diff < 0){
                borrow = -1;
                diff = 10 + diff;
            }
            else borrow = 0;
            temp.next = new Node(diff);
            temp = temp.next;
            if(l1 != null){
                l1=l1.next;
            }
            if(l2 != null) l2=l2.next;
        }
        res = reverse(res.next);
        res = removeLeadingZeroes(res);
        return res;
    }
    public static Node subLinkedList(Node head1, Node head2) {
        head1=removeLeadingZeroes(head1);
        head2=removeLeadingZeroes(head2);
        int len1=length(head1),len2=length(head2);
        if (len1==1 && head1.data==0) return head2;
        if (len2==1 && head2.data==0) return head1;
        return findLarger(head1,len1,head2,len2);
    }
    public static void main(String[] args) {
        Node head1=new Node(1);
        Node a1=new Node(0);
        Node b1=new Node(0);
        head1.next=a1;
        a1.next=b1;
        Node head2=new Node(1);
        Node a2=new Node(2);
        head2.next=a2;
        Node ans=subLinkedList(head1,head2);
        while (ans!=null){
            System.out.print(ans.data);
            ans=ans.next;
        }
    }
}