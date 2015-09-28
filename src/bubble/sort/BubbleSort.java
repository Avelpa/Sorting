/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble.sort;

/**
 *
 * @author kobed6328
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BubbleSort test = new BubbleSort();
        int[] testArr = new int[]{10,9,8,7,6,5,4,3,2,1,0,-1,-2,-3,-4};
        test.sort(testArr);
        for (Integer i: testArr)
        {
            System.out.print(i + ",");
        }
        System.out.println();
    }
    
    public void sort(int[] arr)
    {
        int limit = arr.length;
        while (limit > 1)
        {
            for (int i = 1; i < arr.length; i++)
            {
                if (arr[i-1] > arr[i])
                {
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
            limit --;
        }
    }
    
    
}
