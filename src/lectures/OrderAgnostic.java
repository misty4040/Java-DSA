package lectures;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 12, 25, 36, 48};
        int target = 36;
        System.out.println(find(arr, target));


    }

    static int find(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target){
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
                else{
                    if (target > arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }

                }
            }
        return -1;

        }
    }

