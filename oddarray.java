public boolean oddArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] % 2 == 0) {
            return false;
        }
    }
    return true;
}
