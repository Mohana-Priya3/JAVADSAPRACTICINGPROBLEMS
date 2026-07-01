package Day7;

public class Pairsum {
    public static void main(String[]args) {
        int a[] = {2, 3, 4, 5, 6};
        int target = 6;
        int left = 0;
        int right = a.length - 1;
        boolean found = false;
        while (left < right) {
            if (a[left] + a[right] < target) {
                left++;
            } else if (a[left] + a[right] > target) {
                right--;
            } else {
                System.out.println("Target found at by adding " + a[left] + " and " + a[right]);
                found = true;
                break;
            }}
            if (!found) {
                System.out.println("Element not found");
            }

    }
}
