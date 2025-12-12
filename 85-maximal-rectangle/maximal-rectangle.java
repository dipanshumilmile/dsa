class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n =matrix.length;
        int m = matrix[0].length;
        int[][]mat = new int[matrix.length][matrix[0].length];

        for(int j=0; j<m; j++){
            int sum=0;
            for(int i=0; i<n; i++){
                if(matrix[i][j]=='0')  sum =0;
                else sum += 1;

                mat[i][j] = sum;

            }
        }
        int maxRectangle=0;
        int rectangle=0;
        for(int i=0; i<n; i++){
            int arr[]= new int[mat[0].length];
            for(int j=0; j<m; j++){
               arr[j]=mat[i][j];
                
            }
            rectangle=largestRectangleArea(arr);
            maxRectangle=Math.max(rectangle, maxRectangle);

        }
        return maxRectangle;

    }
    public int largestRectangleArea(int[] height) {
        int n = height.length;
        Stack<Integer> s = new Stack<>();

        //next smaller left
        int[] nsl = new int [n];
        // next smaller right
        int[] nsr = new int [n]; 


        // next smaller right location for each bar  
        for(int i=n-1; i>=0; i--){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
   s.clear();
         // next smaller left location for each bar 
         for(int i=0; i<n; i++){
            while(!s.isEmpty() && height[s.peek()] >= height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        int maxArea =0;
        for(int i=0; i<n; i++){
            maxArea =Math.max(maxArea, height[i]*(nsr[i]-nsl[i]-1)); 
        }
        return maxArea;
    }
}