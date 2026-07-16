class Main {

    static int findMin(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[start] <= arr[end]) {
                if (arr[start] < ans) {
                    ans = arr[start];
                }
                break;
            }

            if (arr[start] <= arr[mid]) {

                if (arr[start] < ans) {
                    ans = arr[start];
                }

                start = mid + 1;
            } else {

                if (arr[mid] < ans) {
                    ans = arr[mid];
                }

                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(findMin(arr));
    }
}