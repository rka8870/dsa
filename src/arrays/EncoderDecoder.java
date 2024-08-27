package arrays;

import java.util.ArrayList;
import java.util.List;

public class EncoderDecoder {

    public String encode (List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0,j=0;
        List<String> list = new ArrayList<>();
        while(i<str.length()){
            j=i;
            while(str.charAt(j)!='#') j++;
            int len = Integer.valueOf(str.substring(i,j));
            i = j + 1 + len;
            list.add(str.substring(j+1,i));
        }
        return list;
    }

}
