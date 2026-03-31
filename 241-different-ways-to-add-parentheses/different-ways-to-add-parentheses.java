class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If operator found
            if (ch == '+' || ch == '-' || ch == '*') {
                
                // Divide
                String leftPart = expression.substring(0, i);
                String rightPart = expression.substring(i + 1);

                List<Integer> left = diffWaysToCompute(leftPart);
                List<Integer> right = diffWaysToCompute(rightPart);

                // Conquer (combine)
                for (int l : left) {
                    for (int r : right) {
                        if (ch == '+') res.add(l + r);
                        else if (ch == '-') res.add(l - r);
                        else res.add(l * r);
                    }
                }
            }
        }

        // Base case: no operator → number
        if (res.size() == 0) {
            res.add(Integer.parseInt(expression));
        }

        return res;
    }
}