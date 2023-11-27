package SlidingWindow;

public class NoOfSubstringContainsthreeChar {
    //Approch-1-BruteForce
    public int numberOfSubstringsApproch1(String s) {
        int l1 = -1;
        int l2 = -1;
        int l3 = -1;
        int result = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'a')
                l1 = i;
            else if (s.charAt(i) == 'b')
                l2 = i;
            else
                l3 = i;
            int minimum = Math.min(l1, Math.min(l2, l3));
            result += minimum + 1;
        }
        return result;
    }

    //Approach-2-SlidingWindow
    public static int numberOfSubstringsApproch2(String s) {
        int [] count = new int[]{0, 0, 0};
        int i = 0;
        int result = 0;
        for (int j=0; j<s.length(); j++) {
            count[s.charAt(j) - 'a'] += 1;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                count[s.charAt(i++) - 'a'] -= 1; 
            }
            result += i;
        }
        return result;
    }
}
