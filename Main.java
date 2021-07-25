public class Main {
    public static void main(String args[])
    {
        System.out.println("--------------------");
        System.out.println("Selection Sort");
        System.out.println("--------------------");
        SelectionSort oj = new SelectionSort();
        int arr_selection[] = {64,25,12,22,11};
        System.out.println("Given array: ");
        oj.printArray(arr_selection);
        oj.sort(arr_selection);
        System.out.println();
        System.out.println("Sorted array: ");
        oj.printArray(arr_selection);
        System.out.println();   
    }
}