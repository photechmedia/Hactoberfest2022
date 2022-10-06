class Solution {
    public void setZeroes(int[][] arr) {
        HashMap<Integer,Boolean> rhm = new HashMap<>();
        HashMap<Integer,Boolean> chm = new HashMap<>();
        int n = arr.length; 
        int m = arr[0].length; 
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(arr[i][j] == 0){
                    rhm.put(i,true);
                    chm.put(j,true);
                    
                }
            }
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(rhm.get(i)!=null){
                    arr[i][j] = 0;
                }
                if(chm.get(j)!=null){
                    arr[i][j] = 0;
                }
            }
        }
       
    }
}
