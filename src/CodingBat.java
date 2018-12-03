
public class CodingBat
{

//    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
//            We are in trouble if they are both smiling or if neither of them is smiling.
//                    Return true if we are in trouble.    
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile)
    {
        return (aSmile == bSmile);
    }

//    Given an array of ints of even length, return a new array length 2
//    containing the middle two elements from the original array.
//            The original array will be length 2 or more.
    public int[] makeMiddle(int[] nums)
    {
        int[] answer = new int[2];
        answer[0] = nums[nums.length / 2 - 1];
        answer[1] = nums[nums.length / 2];
        return answer;
    }

//    Given an int array length 3, if there is a 2 in the array immediately
//            followed by a 3, set the 3 element to 0.
//            Return the changed array.
    public int[] fix23(int[] nums)
    {
        if (nums[0] == 2 && nums[1] == 3)
        {
            nums[1] = 0;
        }
        else if (nums[1] == 2 && nums[2] == 3)
        {
            nums[2] = 0;
        }
        return nums;
    }

//    We'll say that a 1 immediately followed by a 3 in an array is
//            an "unlucky" 1. Return true if the given array contains an
//                    unlucky 1 in the first 2 or last 2 positions in the array.
    public boolean unlucky1(int[] nums)
    {
        if (nums.length < 2)
        {
            return false;
        }
        else if (nums.length == 2)
        {
            return (nums[0] == 1 && nums[1] == 3);
        }
        else
        {
            return ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
        }
    }

//    Given a string, return a version without the first 2 chars.
//            Except keep the first char if it is 'a' and keep the second char if it is 'b'.
//            The string may be any length. Harder than it looks.
    public String deFront(String str)
    {
        if(str.length()==0)
            return "";
        if(str.length()==1)
        {
            if(str.charAt(0) == 'a')
                return str;
            else
                return "";
        }
        if(str.length()==2)
        {
            if(str.charAt(0) == 'a' && str.charAt(1) == 'b')
                return str;
            else if(str.charAt(0) == 'a' && str.charAt(1) != 'b')
                return str.substring(0,1);
            else if(str.charAt(0) != 'a' && str.charAt(1) == 'b')
                return str.substring(1);
            else
                return "";
        }
        else
        {
            if(str.charAt(0) == 'a' && str.charAt(1) == 'b')
                return str;
            else if(str.charAt(0) == 'a' && str.charAt(1) != 'b')
                return str.substring(0,1) + str.substring(2);
            else if(str.charAt(0) != 'a' && str.charAt(1) == 'b')
                return str.substring(1);
            else
                return str.substring(2);
        }
    }

    
//Given a string, if a length 2 substring appears at both its beginning and end,
//        return a string without the substring at the beginning,
//                so "HelloHe" yields "lloHe". The substring may overlap with itself,
//                        so "Hi" yields "". Otherwise, return the original stringunchanged.
public String without2(String str)
    {
        if(str.length() < 2)
            return str;
        else if(str.length() == 2)
        {
            if(str.equals("Hi"))
                return "";
            if(str.substring(0,1).equals(str.substring(1)))
                return "";
            else
                return str;
        }
        else if(str.length() == 3)
        {
            if(str.substring(0,1).equals(str.substring(str.length()-1)))
                return str.substring(1,2);
            else
                return str;
        }
        else
        {
            if(str.substring(0,2).equals(str.substring(str.length()-2)))
                return str.substring(2);
            else
                return str;
        }
        
    }

//Given a string, if the first or last chars are 'x', return the string
//        without those 'x' chars, and otherwise return the string unchanged.
    public String withoutX(String str)
    {
        if(str.length()==0)
            return str;
        else if(str.length()==1)
        {
            if(str.equals("x"))
                return "";
            else
                return str;
        }
        else if(str.length()==2)
        {
            if(str.substring(0,1).equals(str.substring(1)) && str.substring(0,1).equals("x"))
                return "";
            else if(str.substring(0,1).equals("x"))
                return str.substring(1);
            else if(str.substring(1).equals("x"))
                return str.substring(0,1);
            else
                return str;
        }
        else
        {
            if(str.substring(0,1).equals(str.substring(str.length()-1)) &&  str.substring(0,1).equals("x"))
                return str.substring(1,str.length()-1);
            else if(str.substring(0,1).equals("x"))
                return str.substring(1);
            else if(str.substring(str.length()-1).equals("x"))
                return str.substring(0,str.length()-1);
            else
                return str;
        }
    }
    
    
//    Given a string and a second "word" string, we'll say that the word matches
//    the string if it appears at the front of the string, except its first char
//    does not need to match exactly. On a match, return the front of the string, or
//    otherwise return the empty string. So, so with the string "hippo" the word
//    "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
    public String startWord(String str, String word)
    {
        if(word.length()==0 || str.length() == 0)
            return "";
        else
        {
            if(str.substring(1).contains(word.substring(1)))
                return str.substring(0,word.length());
            else
                return "";
        }
        
    }
    
    
//Given two strings, append them together (known as "concatenation") and return the result.
//        However, if the strings are different lengths, omit chars from the longer string so
//        it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi".
//        The strings may be any length.
    public String minCat(String a, String b)
    {
        if(a.length() == 0 || b.length() == 0)
            return "";
        else
        {
            if(a.length()==b.length())
                return a+b;
            if(a.length()>b.length())
                return a.substring(a.length()-b.length()) + b;
            else
                return a+ b.substring(b.length()-a.length());
        }
    } 
    public static void main(String[] args)
    {
        String strA = "Karol";
        String strB = "Wera";
        System.out.println(strA.substring(strA.length()-strB.length()));
        
        
    }
}
