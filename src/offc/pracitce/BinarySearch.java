package offc.pracitce;

public class BinarySearch {
    public static int binarySearch(int[] a, int search){
        int left=0; int right=a.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(a[mid]==search){
                return mid;
            }
            if (a[mid]<search) {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7};
        int search=7;
        System.out.println(binarySearch(a,search));
    }
}
