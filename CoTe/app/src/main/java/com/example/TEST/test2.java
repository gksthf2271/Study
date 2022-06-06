package com.example.TEST;

class test2 {
    void main() {
        int[] input = {-1,1,-2,2};
        solution(input);
    }

    int solution(int[] A) {
        int ans = 0;
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}
