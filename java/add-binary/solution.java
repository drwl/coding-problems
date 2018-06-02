class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int ptrA = a.length() - 1;
        int ptrB = b.length() - 1;
        int valA, valB, sum, remainder = 0;
        while (ptrA >= 0 || ptrB >= 0) {
        // the two lines below could be written differently for easier readility
            valA = (ptrA < 0) ? 0 : a.charAt(ptrA--) - '0';
            valB = (ptrB < 0) ? 0 : b.charAt(ptrB--) - '0';
            sum = valA + valB + remainder;
            remainder = sum / 2;
            sum %= 2;
            res.append(sum);
        }
        if (remainder != 0) res.append(remainder);
        res.reverse();
        return res.toString();
    }
    // Analysis: let N be max(length(a), length(b))
    // Time: O(N)
    // Space: O(N)

    // public String addBinary(String a, String b) {
    //     int aVal = Integer.parseInt(a, 2);
    //     int bVal = Integer.parseInt(b, 2);
    //     int sum = aVal + bVal;
    //     return Integer.toBinaryString(sum);
    // }
    // Can use standard functions if inputs are binary strings with 32 bits
}
