/*
Team pomegranate -- Angela Tom, Tabassum Fabiha, Shayan Chowdhury, Nadine Jackson
APCS2 pd2
L01 -- What Does the Data Say?
2018-03-14
*/


/* Summary of timing mechanism



 */

public class QuickSortTester{
    static long startTime;
	static long endTime;
	static long time;

    public static void fillerWorst(int[] arr, int var)
    {
	for (int i = 0; i < arr.length; i++)
	    {
		arr[i] = var;
	    }
    }
    public static void fillerBest(int[] arr)
    {
	for (int i = 0; i < arr.length; i++)
	    {
		arr[i] = i;
	    }
    }
	public static void fillerNorm(int[] arr)
    {
	for (int i = 0; i < arr.length; i++)
	    {
		arr[i] = (int)(Math.random() * 1000);
	    }
    }

    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }
    
    public static void main(String[] args){
	for (int y = 1000; y <= 100000; y+= 1000) {
	    startTime = System.currentTimeMillis();
	    for (int i = 0; i < 1000; i++)
		{
			int[] arr = new int[y];
			//printArr(arr);
			fillerWorst(arr, 2);
			startTime = System.currentTimeMillis();
			QuickSort.qsort(arr);
			endTime = System.currentTimeMillis();
			time += endTime - startTime;

		}
		System.out.println(y + "," + (time/1000.));
		time = 0;
	}
    }
}
