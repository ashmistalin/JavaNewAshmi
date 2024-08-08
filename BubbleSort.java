public class BubbleSort {
    static void Sort(int arr[]) //Sorts the array by using the outer loop decresing with each iteration and then the inner loop for each it compares a number and a number nect to it and swaps them, this continues until the outer loop matches inner loop .
    {
        for(int i=arr.length-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        /*int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    arr[i]=arr[j];
                }
            }
        }
        for (int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }*/
    }

    public static void main(String[] args) {
        int[] arr1={23,7,9,0,16};
        Sort(arr1);
    }
}
