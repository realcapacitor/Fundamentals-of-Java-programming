public class SelectionsSort {
    public static void main(String[] args) {
        //SelectionsSort
        int a[] = {5, 6, 8, 1, 2, 3, 7};
        int n = a.length;
        int iter = 0;
        for(int i =0; i<n-1 ; i++){
            int minInd = i;
            for(int j = i; j<n; j++){
                if(a[j] < a[minInd]){
                    minInd = j;
                }
            }
            int temp = a[i];
            a[i] = a[minInd];
            a[minInd] = temp;
            iter++;
        }
        for(int e : a){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("Number of swaps "+iter);
    }
}
