import java.util.*;
import javax.swing.*;
public class Lab606 {

	public static void main(String[] args) {
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		int ArrayofIndex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while(!checkIndex(nums,ArrayofIndex)) {
			ArrayofIndex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array,again:"));
		}
		JOptionPane.showMessageDialog(null, 
				"Current data, nums["+ ArrayofIndex +"] is "+ currentData(nums,ArrayofIndex)
				+(prevData(nums,ArrayofIndex)==-1?  "\nNo previous data":"\nPrevious data,nums["+ (ArrayofIndex-1) +"] is "+ prevData(nums,ArrayofIndex)) 
				+(nextData(nums,ArrayofIndex)==7?  "\nNo next data":"\nNext data,nums["+ (ArrayofIndex+1) +"] is "+ nextData(nums,ArrayofIndex)));
		
		
	}// end of main()
	public static boolean checkIndex(int[] nums,int index) {
		return (index>= 0 && index <=6);
	}//end of checkIndex()
	
	public static int currentData(int[] nums,int index) {
		return nums[index];
	}//end of currentData()
	
	public static int prevData(int[] nums,int index) {
		return (index>0? nums[index-1]:-1);
	}//end of prevData()
	
	public static int nextData(int[] nums,int index) {
		return (index<6? nums[index+1]:7);
	}//end of nextData()
}