class Solution {
    public void rotate(int[][] matrix) {
        
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            } 
        }
        
        for(int[] row:matrix){
            rotate(row);
        }
    }
    
    void rotate(int[] ar){
        for(int i=0;i<ar.length/2;i++){
            int temp=ar[i];
            ar[i]=ar[ar.length-1-i];
            ar[ar.length-1-i]=temp;
        }
    }
}