package online;

public class SetMatrixZeros {

	public void setZeroes(int[][] matrix) {
/*
		int row = matrix.length;
		int col = matrix[0].length;
		
		if (row == 0)
			return;
		if (col == 0)
			return;
		
		boolean rowZero = false, colZero = false;
		
		for (int ci = 0; ci < col; ci++) {
			if (matrix[0][ci] == 0) {
				rowZero = true;
				break;
			}
		}
		for (int ri = 0; ri < row; ri++) {
			if (matrix[ri][0] == 0) {
				colZero = true;
				break;
			}
		}

				for (int ri = 1; ri < row; ri++) {
					for (int ci = 1; ci < col; ci++) {
				if (matrix[ri][ci] == 0) {	
					matrix[ri][0] = 0;
					matrix[0][ci] = 0;
				}
			}
		}

			for (int ri = 1; ri < row; ri++) {
				for (int ci = 1; ci < col; ci++) {
				if (matrix[ri][0] == 0 || matrix[0][ci] == 0) {
					matrix[ri][ci] = 0;
				}
			}
		}
		if (rowZero) {
			for (int ci = 0; ci < col; ci++) {
				matrix[0][ci] = 0;
			}
		}
		 if (colZero) {
			for (int ri = 0; ri < row; ri++) {
				matrix[ri][0] = 0;
			}
		}
	*/
	int row []= new int[matrix.length];
	int col[] = new int[ matrix[0].length ];
	for(int i=0;i<matrix.length;i++){
		for(int j= 0;j<matrix[0].length;j++){
			if(matrix[i][j]==0){
				row[i]=1;
				col[j]=1;
			}
		}
	}
	for (int i=0;i<matrix.length;i++){
		for(int j=0;j<matrix[0].length;j++){
			if(row[i]==1||col[j]==1){
				matrix[i][j]=0;
			}
		}
	}
	
	
	
	
		 
		 
/*  boolean firstRowZero = false;
boolean firstColumnZero = false;

//set first row and column zero or not
for(int i=0; i<matrix.length; i++){
    if(matrix[i][0] == 0){
        firstColumnZero = true;
        break;
    }
}

for(int i=0; i<matrix[0].length; i++){
    if(matrix[0][i] == 0){
        firstRowZero = true;
        break;
    }
}

//mark zeros on first row and column
for(int i=1; i<matrix.length; i++){
    for(int j=1; j<matrix[0].length; j++){
        if(matrix[i][j] == 0){
           matrix[i][0] = 0;
           matrix[0][j] = 0;
        }
    }
}

//use mark to set elements
for(int i=1; i<matrix.length; i++){
    for(int j=1; j<matrix[0].length; j++){
        if(matrix[i][0] == 0 || matrix[0][j] == 0){
           matrix[i][j] = 0;
        }
    }
}

//set first column and row
if(firstColumnZero){
    for(int i=0; i<matrix.length; i++)
        matrix[i][0] = 0;
}

if(firstRowZero){
    for(int i=0; i<matrix[0].length; i++)
        matrix[0][i] = 0;
}
*/
}

	public static void main(String args[]){
		int[][] matrix = {{1,0,3}};
		new SetMatrixZeros().setZeroes(matrix);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
		}
				
	}
}
