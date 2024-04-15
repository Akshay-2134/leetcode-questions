class Solution {
    public int[] sumZero(int n) {
           int[] array = new int[n];
		for(int i=1;i<n;i+=2) {
			array[i-1]=i;
			array[i]=-i;
		}
        return array;

    }
}