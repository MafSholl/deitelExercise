package DSAs.leetCode;
public class AddTwoNumbers {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


    public static ListNode addTwoNumbers() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        StringBuilder l1Str = new StringBuilder();
        StringBuilder l2Str = new StringBuilder();
        ListNode l1Temp = l1;
        ListNode l2Temp = l2;
        while(l1Temp.next != null) {
            l1Str.append(l1Temp.val);
            l2Str.append(l2Temp.val);
            l1Temp = l1Temp.next;
            l2Temp = l2Temp.next;
        }
        l1Str.append(l1Temp.val);
        l2Str.append(l2Temp.val);

        String sumStr = String.valueOf(Integer.parseInt(l1Str.toString()) + Integer.parseInt(l2Str.toString()));
        ListNode solution = new ListNode(Integer.parseInt(String.valueOf(sumStr.charAt(2))));
        ListNode tempNode = solution;

        for (int i = sumStr.length()-2; i >= 0; i--) {
            ListNode newNode = new ListNode(Integer.parseInt(String.valueOf(sumStr.charAt(i))));
            tempNode.next = newNode;
            tempNode = tempNode.next;
        }

        System.out.println(l1Str);
        System.out.println(l2Str);
        System.out.println(sumStr);
        System.out.println(solution.val);
        System.out.println(solution.next.val);
        System.out.println(solution.next.next.val);

        return solution;
    }

    public static void main(String[] args) {
        addTwoNumbers();
    }
}
