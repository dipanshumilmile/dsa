class Solution {
    public String largestGoodInteger(String num) {
        char maxChar = ' ';
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) == num.charAt(i - 1) && num.charAt(i - 1) == num.charAt(i - 2)) {
                maxChar = (maxChar == ' ') ? num.charAt(i) : (char)Math.max(num.charAt(i), maxChar);
            }
        }
        if (maxChar == ' ') {
            return "";
        }
        return "" + maxChar + maxChar + maxChar; // return the triplet as string
    }
}
