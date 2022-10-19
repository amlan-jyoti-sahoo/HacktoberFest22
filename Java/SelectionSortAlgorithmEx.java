public class SelectionSortAlgorithmEx {
    public static void main(String[] args){
        System.out.println("Selection sort algorithm");
        System.out.println("------------------------");
        int[] array = {5,12,4,6,9,8,3,7};
        System.out.println("Elements of the array : ");
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(array);

        System.out.println("After the Selection Sort : ");
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNo = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNo;
        }
    }
}