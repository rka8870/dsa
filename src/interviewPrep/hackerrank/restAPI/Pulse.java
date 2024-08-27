package interviewPrep.hackerrank.restAPI;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.util.List;

public class Pulse {


    public static void main(String[] args) throws IOException {
        invoke();
    }


    public class Response{
        int page;
        int per_page;
        int total;
        int total_pages;
        List<Data> data;

    }

    public class Data{
        String id;
        Vitals vitals;
    }

    public class Vitals{
        int pulse;
    }




    public static void invoke() throws IOException {


        String  url = "https://jsonmock.hackerrank.com/api/medical_records?page=1";
        HttpsURLConnection connection = (HttpsURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");
        InputStreamReader inputStreamReader  = new InputStreamReader(connection.getInputStream());
        BufferedReader in =  new BufferedReader(inputStreamReader);
        String response = null;
        StringBuilder sb = new StringBuilder();
        while((response=in.readLine())!=null){
            sb.append(response);
        }
        System.out.println(sb.toString());

    }


}
