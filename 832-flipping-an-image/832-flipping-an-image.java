class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len=image[0].length;
        for(int[] row:image){
            for(int i=0;i<(len+1)/2;i++){
                int temp=row[i] ^ 1;
                row[i]=row[row.length-1-i] ^ 1;
                row[row.length-1-i]=temp;
            }
        }
        return image;
    }
}