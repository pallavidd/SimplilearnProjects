package Quetion;

public class Arraymul {
		public static void main(String args[]){  

//creating two matrices    
int a[][]={{1,3,4},{3,4,5}};    
int b[][]={{1,3,4},{1,2,1}};    
int c[][]={{1,1,0},{3,3,5}};    
int d[][]={{1,2,4},{1,9,4}};    
    
//creating another matrix to store the sum of two matrices    
int c1[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
c1[i][j]=b[i][j]+b[i][j];    //use - for subtraction  
c1[i][j]=d[i][j]+b[i][j];    //use - for subtraction  

System.out.print(c1[i][j]+" ");    
}    
System.out.println();//new line    
}
}
}
