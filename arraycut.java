/*
정수 n, left, right가 주어집니다. 다음 과정을 거쳐서 1차원 배열을 만들고자 합니다.

n행 n열 크기의 비어있는 2차원 배열을 만듭니다.
i = 1, 2, 3, ..., n에 대해서, 다음 과정을 반복합니다.
1행 1열부터 i행 i열까지의 영역 내의 모든 빈 칸을 숫자 i로 채웁니다.
1행, 2행, ..., n행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듭니다.
새로운 1차원 배열을 arr이라 할 때, arr[left], arr[left+1], ..., arr[right]만 남기고 나머지는 지웁니다.
정수 n, left, right가 매개변수로 주어집니다. 주어진 과정대로 만들어진 1차원 배열을 return 하도록 solution 함수를 완성해주세요.
*/

/////////풀이/////////
/*
n*n배열이 있어야 한다고 생각했다. 하지만 문제에서 요구하는 값을 직접 계산할 수 있어 필요없다.
-> 각 인덱스에 대해 해당 위치의 값을 구하는 규칙을 이용하면 메모리와 시간을 절약할 수 있다.
*/
class Solution {
    public int[] solution(int n, long left, long right) {
		// left와 right 사이의 출력될 범위를 알아낸다.
        int size = (int)(right - left + 1);
		// answer배열의 크기를 범위만큼으로 제한한다.
        int[] answer = new int[size];
        
        for (int i = 0; i < size; i++) {
			// 인덱스는 left부터 i만큼 증가한다.
            long index = left + i;
            int row = (int)(index / n);
            int col = (int)(index % n);
			// 해당 위치의 값을 준다.
            answer[i] = Math.max(row, col) + 1;
        }
        
        return answer;
    }
}
