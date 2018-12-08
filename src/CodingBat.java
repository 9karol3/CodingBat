
import java.awt.event.WindowListener;

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
        if (str.length() == 0)
        {
            return "";
        }
        if (str.length() == 1)
        {
            if (str.charAt(0) == 'a')
            {
                return str;
            }
            else
            {
                return "";
            }
        }
        if (str.length() == 2)
        {
            if (str.charAt(0) == 'a' && str.charAt(1) == 'b')
            {
                return str;
            }
            else if (str.charAt(0) == 'a' && str.charAt(1) != 'b')
            {
                return str.substring(0, 1);
            }
            else if (str.charAt(0) != 'a' && str.charAt(1) == 'b')
            {
                return str.substring(1);
            }
            else
            {
                return "";
            }
        }
        else
        {
            if (str.charAt(0) == 'a' && str.charAt(1) == 'b')
            {
                return str;
            }
            else if (str.charAt(0) == 'a' && str.charAt(1) != 'b')
            {
                return str.substring(0, 1) + str.substring(2);
            }
            else if (str.charAt(0) != 'a' && str.charAt(1) == 'b')
            {
                return str.substring(1);
            }
            else
            {
                return str.substring(2);
            }
        }
    }

//Given a string, if a length 2 substring appears at both its beginning and end,
//        return a string without the substring at the beginning,
//                so "HelloHe" yields "lloHe". The substring may overlap with itself,
//                        so "Hi" yields "". Otherwise, return the original stringunchanged.
    public String without2(String str)
    {
        if (str.length() < 2)
        {
            return str;
        }
        else if (str.length() == 2)
        {
            if (str.equals("Hi"))
            {
                return "";
            }
            if (str.substring(0, 1).equals(str.substring(1)))
            {
                return "";
            }
            else
            {
                return str;
            }
        }
        else if (str.length() == 3)
        {
            if (str.substring(0, 1).equals(str.substring(str.length() - 1)))
            {
                return str.substring(1, 2);
            }
            else
            {
                return str;
            }
        }
        else
        {
            if (str.substring(0, 2).equals(str.substring(str.length() - 2)))
            {
                return str.substring(2);
            }
            else
            {
                return str;
            }
        }

    }

//Given a string, if the first or last chars are 'x', return the string
//        without those 'x' chars, and otherwise return the string unchanged.
    public String withoutX(String str)
    {
        if (str.length() == 0)
        {
            return str;
        }
        else if (str.length() == 1)
        {
            if (str.equals("x"))
            {
                return "";
            }
            else
            {
                return str;
            }
        }
        else if (str.length() == 2)
        {
            if (str.substring(0, 1).equals(str.substring(1)) && str.substring(0, 1).equals("x"))
            {
                return "";
            }
            else if (str.substring(0, 1).equals("x"))
            {
                return str.substring(1);
            }
            else if (str.substring(1).equals("x"))
            {
                return str.substring(0, 1);
            }
            else
            {
                return str;
            }
        }
        else
        {
            if (str.substring(0, 1).equals(str.substring(str.length() - 1)) && str.substring(0, 1).equals("x"))
            {
                return str.substring(1, str.length() - 1);
            }
            else if (str.substring(0, 1).equals("x"))
            {
                return str.substring(1);
            }
            else if (str.substring(str.length() - 1).equals("x"))
            {
                return str.substring(0, str.length() - 1);
            }
            else
            {
                return str;
            }
        }
    }

//    Given a string and a second "word" string, we'll say that the word matches
//    the string if it appears at the front of the string, except its first char
//    does not need to match exactly. On a match, return the front of the string, or
//    otherwise return the empty string. So, so with the string "hippo" the word
//    "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
    public String startWord(String str, String word)
    {
        if (word.length() == 0 || str.length() == 0)
        {
            return "";
        }
        else
        {
            if (str.substring(1).contains(word.substring(1)))
            {
                return str.substring(0, word.length());
            }
            else
            {
                return "";
            }
        }

    }

//Given two strings, append them together (known as "concatenation") and return the result.
//        However, if the strings are different lengths, omit chars from the longer string so
//        it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi".
//        The strings may be any length.
    public String minCat(String a, String b)
    {
        if (a.length() == 0 || b.length() == 0)
        {
            return "";
        }
        else
        {
            if (a.length() == b.length())
            {
                return a + b;
            }
            if (a.length() > b.length())
            {
                return a.substring(a.length() - b.length()) + b;
            }
            else
            {
                return a + b.substring(b.length() - a.length());
            }
        }
    }

//    // Given a string, return true if the first 2 chars in the string
//    also appear at the end of the string, such as with "edited".
    public boolean frontAgain(String str)
    {
        if (str.length() < 2)
        {
            return false;
        }
        else if (str.length() == 2)
        {
            return true;
        }
        else
        {
            return str.substring(0, 2).equals(str.substring(str.length() - 2));
        }
    }

//    Given a string and an index, return a string length 2 starting at the given
//            index. If the index is too big or too small to define
//                    a string length 2, use the first 2 chars.
//                            The string length will be at least 2.
    public String twoChar(String str, int index)
    {
        // DO ZROBIENIA
        if (str.length() + 2 > index)
        {
            return str.substring(0, 2);
        }
        else
        {
            return "";
        }
    }

//    Given an array of ints, return true if it contains a 2, 7, 1 pattern:
//    a value, followed by the value plus 5, followed by the value minus 1.
//    Additionally the 271 counts even if the "1" differs by 2 or less from the
//    correct value.
    public boolean has271(int[] nums)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 2 && nums.length > i + 1)
            {
                if (nums[i + 1] == 7)
                {
                    if (nums[i + 2] == 1 || nums[i + 2] + 1 == 1 || nums[i + 2] + 2 == 1 || nums[i + 2] - 2 == 1 || nums[i + 2] + 1 == 1)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
    public int start1(int[] a, int[] b)
    {
        int sum = 0;
        if (a.length > 0)
        {
            if (a[0] == 1)
            {
                sum++;
            }
        }
        if (b.length > 0)
        {
            if (b[0] == 1)
            {
                sum++;
            }
        }
        return sum;
    }

//    Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive
//            -- then that value counts as 0, except 15 and 16 do not count as a teens.
//                    Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed
//                            for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
//                                    Define the helper below and at the same indent level as the main noTeenSum().
    public int fixTeen(int n)
    {
        if (n == 15)
        {
            return 15;
        }
        else if (n == 16)
        {
            return 16;
        }
        else if (n > 12 && n < 20)
        {
            return 0;
        }
        else
        {
            return n;
        }
    }

    public int noTeenSum(int a, int b, int c)
    {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);

    }

    // Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
    public int blackjack(int a, int b)
    {
        int roznicaA = a - 21;
        roznicaA = Math.abs(roznicaA);
        int roznicaB = b - 21;
        roznicaB = Math.abs(roznicaB);

        if (a > 21 && b > 21)
        {
            return 0;
        }
        else
        {
            if (a == 21 || b == 21)
            {
                return 21;
            }
            else
            {
                if (a < 21 && b < 21)
                {
                    if (roznicaA > roznicaB)
                    {
                        return b;
                    }
                    else
                    {
                        return a;
                    }
                }
                else
                {
                    if (roznicaA > roznicaB)
                    {
                        return a;
                    }
                    else
                    {
                        return b;
                    }
                }
            }
        }
    }

    // Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
    public int loneSum(int a, int b, int c)
    {
        if (a == b)
        {
            if (b == c)
            {
                return 0;
            }
            else
            {
                return c;
            }
        }
        else
        {
            if (a == c)
            {
                if (c == b)
                {
                    return 0;
                }
                else
                {
                    return b;
                }
            }
            else
            {
                if (b == c)
                {
                    if (b == a)
                    {
                        return 0;
                    }
                    else
                    {
                        return a;
                    }
                }
                else
                {
                    return a + b + c;
                }
            }
        }
    }

    // For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20.
//    Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c,
//            return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times.
//                    Write the helper entirely below and at the same indent level as roundSum().
    public int round10(int num)
    {
        String number = Integer.toString(num); // konwersja Int to String
        if (number.length() == 1) // dla jednocyfrowej
        {
            if (num % 10 > 4)
            {
                return 10;
            }
            else
            {
                return 0;
            }
        }
        else // dla liczb wielocyfrowych
        {
            String firstChar = Integer.toString(num).substring(0, 1);
            int a = Integer.parseInt(firstChar) * 10;
            if (num % 10 > 4)
            {
                return 10 + a;
            }
            else
            {
                return a;
            }

        }
    }

    public int roundSum(int a, int b, int c)
    {
        int sum = 0;
        sum += round10(a);
        sum += round10(b);
        sum += round10(c);
        return sum;
    }

    public static void main(String[] args)
    {
        String strA = "Karol";
        String strB = "Wera";
        System.out.println(strA.substring(strA.length() - strB.length()));
    }
}
