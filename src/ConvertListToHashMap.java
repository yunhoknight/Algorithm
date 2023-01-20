import java.util.HashMap;

public class ConvertListToHashMap {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };

        HashMap<String, String> output = convertListToHashMap(arr1);

        System.out.println(output);


    }
    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:
        // 2차원 배열 -> 해시맵으로 변환
        // arr[i].length == 0 또는 2 -> 빈 배열이거나 2개의 배열을 가진다.
        // 중복되는 키 -> 초기값 사용
        // 빈 배열을 입력받은 경우 빈 HashMap을 리턴
        // arr[i]의 길이가 0인 경우 무시시

        // 1. 결과를 담을 해시맵 생성
        HashMap<String, String> map = new HashMap<>();

        // 2. 빈 배열을 입력받은 경우 빈 HashMap을 리턴
        if( arr.length == 0 ) return map;

        // 3. map에 key에는 arr[i]의 첫 요소, value에 arr[i]의 두번째 요소 입력
        for (int i = 0; i < arr.length; i++) {
            // arr[i]의 길이가 0인 경우 무시
            if(arr[i].length != 0) {
                // 중복되는 키 -> 초기값 사용
                if(!map.containsKey(arr[i][0])) {
                    map.put(arr[i][0], arr[i][1]);
                }
            }
        }
        return map;
    }
}
