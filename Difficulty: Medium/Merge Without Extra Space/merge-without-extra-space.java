class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int left=a.length-1;
        int right=0;
        while(left>=0 && right<b.length)
        {
            if(a[left]>b[right])
            {
                swap(left,right,a,b);
                left--;
                right++;
            }
            else
            {
                left--;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
    static void swap(int left, int right,int[] a,int[] b)
    {
        int temp=a[left];
        a[left]=b[right];
        b[right]=temp;
    }
}
