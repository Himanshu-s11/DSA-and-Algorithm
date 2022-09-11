package TwoD.binarySearch;

public class SearchInSortedMatrix {
	//search int the row provided between col provided
	static int[] binarySearch(int[][] matrix, int row, int colstart, int colend, int target) {
		while(colstart<= colend) {
			int mid=colstart+(colend-colstart)/2;
			if(matrix[row][mid]== target) {
				return new int[] {row,mid};
			}if(matrix[row][mid]< target) {
				colstart=mid+1;
			}else {
				colend=mid-1;
			}
		}
		return new int[] {-1,-1};
	}
	
	static int[] search(int[][] matrix, int target) {
    	int r=matrix.length;
    	int c=matrix[0].length;//be cousious metrix may be emplty
    	if(r==1) {
    		return binarySearch(matrix, r, r, c, target);
    	}
    	int rowstart=0;
    	int rowend=r-1;
    	int midc=c/2;
    	while(rowstart<rowend-1) {
    		int mid= rowstart+(rowend-rowstart)/2;
    		if(matrix[mid][midc]==target) {
    			return new int[]{mid,midc};
    		}
    		if(matrix[mid][midc]<target) {
    			rowstart=mid;
    		}else {
    			rowend=mid;
    		}
    	}
    	return new int[]{-1,-1};
    }
}
