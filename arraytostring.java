public static String intArrayToString(int[] array) {
    if (array == null) return "null";

    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < array.length; i++) {
        sb.append(array[i]);
        if (i < array.length - 1) {
            sb.append(", ");
        }
    }
    return sb.append("]").toString();
}
