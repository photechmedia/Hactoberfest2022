import java.util.Scanner;

public class CountSort {

    static void countSort(int a[],int n,int max)
    {
        int c[] = new int[max];
        int b[] = new int[n];
        for(int i=0;i<max;i++)
        {
            c[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            c[a[i]-1]++;
        }
        for(int i=1;i<max;i++)
        {
            c[i]=c[i]+c[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
            b[c[a[i]-1]-1] = a[i];
            c[a[i]-1]--;
        }
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of elements in the array: ");
        int n=sc.nextInt();
        int a[] = new int[n];
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            max=Math.max(max,a[i]);
        }
        countSort(a,n,max);
    }
}
