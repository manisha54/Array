public class ArrayTest {
    static int a[];
    static int size=0;
    ArrayTest(int length){
        a = new int[length];
        for(int i=0; i<a.length-1;i++){
            a[i]=100+1;
            size++;
        }
    }
    public void insertAtAnyPos(int pos, int data){
        for (int i=size;i>pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=data;
    }

    public static void main(String[] args) {
        ArrayTest test = new ArrayTest(5);
        System.out.println("print array before insert");
        for(int i=0; i<a.length;i++){
            System.out.println(a[i]);
        }
        test.insertAtAnyPos(2, 200);
        System.out.println("Print array before insert");

   }

}
