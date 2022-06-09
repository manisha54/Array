//package Liknked_List;
//
//public class Detect_and_Remove {
//    int dat;
//    Detect_and_Remove next;
//}
//    // driver function
//    void detectAndRemoveLoop(Detect_and_Remove head)
//    {
//        // If list is empty or has only one node without loop
//        if (head == NULL or head.next == NULL)
//        return
//                Detect_and_Remove slow = head, fast = head
//        slow = slow.next
//        fast = fast.next.next
//        // Check if loop exists
//        while (fast and fast.next) {
//        if (slow == fast)
//            break
//            slow = slow.next
//                fast = fast.next.next
//    }
//        if(slow == fast) {
//            int length_of_loop = 1
//            while(fast.next != slow){
//                fast = fast.next
//                length_of_loop = length_of_loop + 1
//            }
//            removeLoop(head, length_of_loop)
//        }
//    }
//    // utility function
//    void removeLoop(Detect_and_Remove head, int D) {
//        Detect_and_Remove ptr1 = head
//        Detect_and_Removee ptr2 = head
//        while(D > 0){
//            ptr2 = ptr2.next
//            D = D - 1
//        }
//        while(ptr1.next != ptr2.next) {
//            ptr1 = ptr1.next
//            ptr2 = ptr2.next
//        }
//        // Remove loop
//        ptr2.next = NULL
//        return
//    }