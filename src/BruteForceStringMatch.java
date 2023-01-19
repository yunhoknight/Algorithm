public class BruteForceStringMatch {
    public static void main(String[] args) {

        boolean input = bruteForceStringMatch(new String[]{"1", "2", "3", "4"}, new String[]{"1", "3"});

        System.out.println(input);
    }

    public static boolean bruteForceStringMatch(String[] arr, String[] patternArr) {
        // Brute Force 문자열 매칭을 구합니다.
        // 입력 : n개의 문자 텍스트를 나타내는 배열 T, m개의 문자 패턴을 나타내는 배열 P
        // 출력 : 일치하는 문자열이 있으면 첫번쨰 인덱스를 반환합니다. 검색에 실패한 경우 -1을 반홥합니다.

        int n = arr.length;
        int m = patternArr.length;

        for (int i = 0; i < n-m; i++){
            // 전체 요소개수에서 패턴 개수를 뺀 만큼만 반복합니다. 그 수가 마지막 비교요소이기 떄문입니다.
            // i 반복문은 패턴과 비교의 위치를 잡는 반복문입니다.

            int j = 0;
            // j는 전체와 패턴의 요소 하나하나를 비교하는 반복문입니다.
            while (j<m && patternArr[j].equals(arr[i+j])) {
                // j가 패턴의 개수보다 커지면 안되기때문에 개수만큼만 반복합니다.
                // 패턴에서는 j인덱스와 전체에서는 i+j 인덱스의 값이 같은지 판단합니다.
                // 같을때 j에 +1 합니다.
                j = j + 1;
            }
            if (j == m) {
                // j와 패턴 수가 같다는 것은 패턴의 문자열과 완전히 같은 부분이 존재한다는 의미입니다.
                // 이 떄의 비교 했던 위치를 반환합니다.
                return true;
            }
        }
        return false;
    }
}
