class Solution {
    List<Integer> res = new ArrayList<>();

    private void solve(int currNum, int n){
        if(currNum > n) return;
        res.add(currNum);

        for(int i=0; i<=9; i++){
            int newNum = (currNum*10)+i;
            if(newNum > n) return;
            solve(newNum, n);
         }

    }
    public List<Integer> lexicalOrder(int n) {
        for(int i=1;i<=9; i++){
            solve(i, n);


        }
        return res;
    }
}