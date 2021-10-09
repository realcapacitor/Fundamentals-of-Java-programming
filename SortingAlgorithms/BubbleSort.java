public class BubbleSort {
    public static void main(String[] args) {
        //BubbleSort : Most iunifficient algorithm.
        int a[] = {5,6,8,1,2,3,7};
        int iter = 0;
        int n = a.length;
        for(int i = 0; i<n-1; i++){
            for(int j =0; j<n-1-i; j++){
                if(a[j+1] < a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    iter++;
                    
                } 
            }
        }
       for(int item: a){
           System.out.print(item + " ");
       }
       System.err.println();
       System.out.println("Number of swaps "+iter);
    }
}
