public int maxIndex(int[] arr) {
    if (arr == null || arr.length == 0) {
        return -1;
    }
    
    int maxIdx = 0;
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > arr[maxIdx]) {
            maxIdx = i;
        }
    }
    
    return maxIdx;
}
