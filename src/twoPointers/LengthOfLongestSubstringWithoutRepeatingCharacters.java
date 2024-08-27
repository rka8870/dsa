package twoPointers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstringWithoutRepeatingCharacters {


        public int lengthOfLongestSubstring(String s) {
            int i=0,j=0;
            int maxlen = 0, len=0;
            Map<Character,Integer> map = new HashMap<>();
            while(i<s.length() && j<s.length()){
                char ch = s.charAt(j);
                if(map.get(ch)==null || map.get(ch)<i){
                    map.put(ch,j);
                    len = j-i+1;
                } else {
                    i = map.get(ch);
                    map.put(ch,j);
                    len = j-i;
                }
                maxlen = Math.max(maxlen,len);
                j++;

            }
            return maxlen;
        }


}
