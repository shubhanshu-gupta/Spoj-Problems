class palindrome {
	public static void main(String args[])
	{	
	String s = "333";
	int palindrome = Integer.parseInt(s);
	boolean fl = isPalindrome(palindrome);
	System.out.println(fl);
	}

 public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }



        }

