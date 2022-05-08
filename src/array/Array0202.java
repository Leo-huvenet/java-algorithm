package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Array0202 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        List<Integer> list = new ArrayList<>();

        int temp = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int number = Integer.parseInt(st.nextToken());
            if(temp < number){
                temp = number;
                list.add(number);
            }
        }
        System.out.println(list.size());
    }
}
