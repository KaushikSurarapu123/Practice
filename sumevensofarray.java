public int sumEvens(int[] arrayToSum) {
    int sum = 0;
    for (int num : arrayToSum) {
        if (num % 2 == 0) {
            sum += num; 
        }
    }
    return sum;
}
