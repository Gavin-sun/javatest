package com.company.demo_IO;

import java.io.*;
import java.util.HashMap;

/**
 * @author Gavin
 * @version 1.0
 * @date 2020 11 2020/11/18 18:59
 */
public class Demo_sortKV {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Gavin\\Desktop\\a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Gavin\\Desktop\\out.txt"));
        String line;
        while((line = br.readLine())!=null){
            String[] arr = line.split("\\.");//用.来分割
            map.put(arr[0],arr[1]);
        }
        for(String key : map.keySet()){
            String value = map.get(key);
            line = key+"."+value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
