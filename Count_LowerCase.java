/* Find number of lower case in a string
 * AriJIt = 3
 */
/*import java.util.*;
public class countLowerUpperCase {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int lowercount=0;
	int uppercount=0;
	String str=sc.nextLine();
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>='a' && str.charAt(i)<='z')
			lowercount++;
		else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			uppercount++;
	}
	System.out.println(lowercount);
	System.out.println(uppercount);
	
}
}
*/

import java.util.*;
public class Count_LowerCase {
    public static void main(String[]args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) 
        {
            if(Character.isLowerCase(s.charAt(i)))
            {
                count++;
            }
        }
        /* Alternative Method using array creation
        -----------------------------------------------------
        char[] arr;
        arr = s.toCharArray();
        //   Other process to create character array
        | ******************************************
        |  for(int i=0; i<s.length(); i++)
        |  {
        |      arr[i] = s.charAt(i);
        |  }
        // 
        for(int i=0; i<arr.length;i++)
        {
            if(Character.isLowerCase(arr[i]))
            {
                count++;
            }
        }
        */
        System.out.println(count);
    }
}
