class Solution {
    public int bestClosingTime(String customers) {
        int totalY=0;
        for(char c : customers.toCharArray()){
            if(c=='Y') totalY++;
        }
        
        int []panalty = new int[customers.length()+1];
        panalty[0]=totalY;
        

        for(int i=1; i<=customers.length(); i++){
            if(customers.charAt(i-1)=='Y') totalY -=1;
            if(customers.charAt(i-1)=='N') totalY +=1;
            panalty[i]=totalY;
 
        }
        int min=panalty[0];
        int minIndx=0;
        for(int i=0; i<=customers.length(); i++){
            if(panalty[i]<min){
                min=panalty[i];
                minIndx=i;
            }
        }
        return minIndx;

    }
}