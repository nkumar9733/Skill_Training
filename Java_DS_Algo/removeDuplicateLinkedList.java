import java.util.Scanner;

import javax.management.relation.RelationSupport;

class SingleLinkedList {
    public int data;
    public SingleLinkedList next;

    public SingleLinkedList(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SingleLinkedList [data=" + data + "]";
    }

    public static SingleLinkedList removeDuplicate(SingleLinkedList list){

        SingleLinkedList result = list;
        while(list != null && list.next != null){
            if(list.data == list.next.data){
                list.next = list.next.next;
            }
            else
                list = list.next;
        }

        return result;
    }
}

class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int t = Integer.parseInt(sc.nextLine());
        SingleLinkedList llist = new SingleLinkedList(t);
        SingleLinkedList head = llist;
        llist.next=null;

        for (int i = 1; i < n; i++) {
            int temp = Integer.parseInt(sc.nextLine());
            llist.next = new SingleLinkedList(temp);
            llist = llist.next;
        }

        SingleLinkedList result = SingleLinkedList.removeDuplicate(head);

        while(result != null) {
            System.out.println(result.data);
            result = result.next;
        }
    }
}

