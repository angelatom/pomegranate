/*
Team pomegranate -- Angela Tom, Tabassum Fabiha, Shayan Chowdhury
APCS2 pd2
L01 -- What Does the Data Say?
2018-03-14
*/


/* Summary of timing mechanism



 */

public class QuickSortTester{
    static long startTime;
    static long endTime;

    public static void fillerWorst(int[] arr, int var)
    {
	for (int i = 0; i < arr.length; i++)
	    {
		arr[i] = var;
	    }
    }
    
    public static void main(String[] args){\
	/*
	for (int y = 100; y <= 1000; y+= 100) {
	    startTime = System.currentTimeMillis();
	    for (int i = 0; i < 10000; i++)
		{
		    int[] arr = new int[y];
		    fillerWorst(arr, 2);
		    QuickSort.qsort(arr);
		}
	    endTime = System.currentTimeMillis();
	    System.out.println(y + "," + ((endTime - startTime)/10000));
	}
	*/

	int[] arr = new int[y];
	fillerWorst(arr, 2);
	QuickSort.qsort(arr);
	
    }
}
