public class BoardGame {
    public static void main(String[] args) {

        int[][] board1 = new int[][]{
                {0, 0, 0, 1},
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };

        String operation1 = "RRDLLD";

        int output = boardGame(board1, operation1);

        System.out.println(output);

    }
    public static Integer boardGame(int[][] board, String operation) {
        // TODO:
        // 시작위치 0, 0에서 동작에 따라 위치 변경
        // 위치가 보드판을 벗어나면 바로 Null 반환
        // 최종 보드판의 합계 리턴

        // 1. 위치 정보를 담을 x와 y 변수 선언
        int x = 0;
        int y = 0;

        // 2. 최종 점수를 입력 받을 변수 선언
        int result = 0;

        // 3. 문자열을 char 배열로 변환
        char[] direction = new char[]{};
        for (int i = 0; i < operation.length(); i++) {
            direction[i] = operation.charAt(i);
        }
        // 조작 횟수를 만큼  direction을 순회하면서 x, y의 위치 변경
        int count = direction.length;
        while (count > 0) {
            // x 또는 y가 범위를 벗어나면 null 반환
            if(x > board.length || y > board[0].length) return null;
            else if(board[x][y] == 1) result = result+1;
            for (int j = 0; j < direction.length; j++) {
                switch (direction[j]) {
                    case 'U' :
                        x = x+1;
                        count--;
                        break;
                    case 'D' :
                        x = x-1;
                        count--;
                        break;
                    case 'R' :
                        x = y+1;
                        count--;
                        break;
                    case 'L' :
                        x = y-1;
                        count--;
                        break;
                }
            }
        }
        return result;
    }
}
