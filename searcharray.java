public int searchArray(int[] arrayToSearch, int intToFind) {
    for (int i = 0; i < arrayToSearch.length; i++) {
        if (arrayToSearch[i] == intToFind) {
            return i;
        }
    }
    return -1;
}
