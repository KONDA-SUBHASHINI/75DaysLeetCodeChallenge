class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length,c=matrix[0].length;
        int s=0,e=r*c-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(matrix[mid/c][mid%c]==target){
                return true;
            }else if(matrix[mid/r][mid%c]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return false;
    }
}