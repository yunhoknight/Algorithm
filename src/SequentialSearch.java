public class SequentialSearch {
    public static void main(String[] args) {
        System.out.println(sequentialSearch(new int[]{1,2,3,4,5}, 3));
    }

    public static boolean sequentialSearch(int[] arr, int K) {
        // 검색 키 K를 사용하여 순차 검색을 구현
        // 입력 : n개의 요소를 갖는 배열 A와 검색 K
        // 결과를 저장할 boolean result선언, 초기값은 false
        // 출력 : k값과 같은 요소 인덱스 또는 요소가 없을 때 false

        int n = arr.length;
        boolean result = false;
        for (int i = 0; i < n; i++) {
            if(arr[i] == K) {
                result = true;
            }
        }
        return result;
    }
}
