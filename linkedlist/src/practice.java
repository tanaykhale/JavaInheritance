// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class practice {
	static class ListNode{
		private int val;
		private ListNode next;
		ListNode(int val){
			this.val=val;
			this.next=null;
		}
		ListNode(int val,ListNode next){
			this.val=val;
			this.next=next;
		}
	}
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Display the original list
        System.out.println("Original List:");
        display(head);
        int count=getCount(head);
        ListNode cur=head;
        ListNode prev=null;
        for(int i=1;i<=(count/2);i++) {
        	prev=cur;
        	cur=cur.next;
        }
        prev.next=cur.next;
        int a=prev.next.val;
        System.out.println(a);
        display(head);

        
    }
    public static int getCount(ListNode head) {
    	int count=0;
    	ListNode temp=head;
    	while(temp!=null) {
    		count++;
    		temp=temp.next;
    	}
    	return count;
    }
    // Helper method to display the linked list
    public static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

