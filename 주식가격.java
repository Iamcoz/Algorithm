package Algorithm;

class Solution {
    public int[] solution(int[] prices) {

        // 0으로 초기화
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++; // 0에서 ++

                if (prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return answer;
    }
}