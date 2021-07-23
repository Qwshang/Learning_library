package day6;
public class TestArraySort{
	public static void main(String[] args){
		int[] a = {8,5,4,3,7,2};
		
		//冒泡排序法 相邻的元素比较 每次找出最大的数
		/*
		      0 1 2 3 4 5     n=6
			  8 5 4 3 7 2
		
		0-1   5 8 4 3 7 2
		1-2   5 4 8 3 7 2
        2-3   5 4 3 8 7 2     i=0
        3-4   5 4 3 7 8 2     j=0;j<5;j++
        4-5   5 4 3 7 2 8

		0-1   4 5 3 7 2 8
		1-2   4 3 5 7 2 8     i=1
		2-3   4 3 5 7 2 8     j=0;j<4;j++
        3-4   4 3 5 2 7 8 

		0-1   3 4 5 2 7 8     i=2
		1-2   3 4 5 2 7 8     j=0;j<3;j++
		2-3   3 4 2 5 7 8 
        		
		0-1   3 4 2 5 7 8     i=3
		1-2   3 2 4 5 7 8     j=0;j<2;j++
		
		0-1   2 3 4 5 7 8     i=4    j=0;j<1;j++
		*/
		for(int i = 0 ; i < a.length-1; i++){
			for(int j = 0 ; j < a.length-1-i; j++){
				//比较a[j] 和 a[j+1]
				if (a[j] > a[j+1]){
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		for(int i= 0 ; i < a.length;i++){
			System.out.print(a[i]+"\t");
		}
	}
}