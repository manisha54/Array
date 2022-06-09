public class MergeSortExample {
    public int[] mergesort(int r[], int start, int end){
        if (start <end) {

            int mid = (start + end) / 2;
            mergesort(r, start, end);
            mergesort(r, mid + 1, end);
            merge(r,start, mid, end);
        }

        return r;
    }
    void merge(int [] r, int start, int mid, int end){
        int a[] = new int[mid-start+1];
        for(int index=0; index<a.length; index++){
            a[index] =r[start+index];
        }
        int b[] = new int[end-mid];
        for(int index=0; index<a.length; index++){
            b[index] =r[mid+1+index];
        }

        int i=0;
        int j=0;
        int k= start;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j]){
                r[k] = a[i];
                i++; k++;
            }
            else {
                r[k]=b[j];
                j++;
                k++;
            }
        }
        while (i<a.length){
            r[k] = a[i];
            i++;
            k++;
        }
        while (j<b.length){
            r[k] = b[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) {
        MergeSortExample obj = new MergeSortExample();


    }
}
