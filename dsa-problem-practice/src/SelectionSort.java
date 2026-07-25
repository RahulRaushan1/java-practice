public class SelectionSort {
    public static void main(String[] args) {
        int [] arr= {5,1,9,3,6};
        selectionSorting(arr);
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
    public static void selectionSorting(int[] arr){
        for(int i=0;i<arr.length-1;i++){

            int MinValue = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]< arr[MinValue]){
                    MinValue=j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[MinValue];
            arr[MinValue]=temp;

        }
    }
}
