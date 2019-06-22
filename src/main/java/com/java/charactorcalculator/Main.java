package com.java.charactorcalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("입력 ㄲ");

        //사용자 입력받음
        Scanner sc = new Scanner(System.in);
        String userInsert = sc.nextLine();
        System.out.println("입력 받은 값 : " + userInsert);

        //입력받은 값 space로 나눔
        String[] insertSplit = userInsert.split(" ");
        System.out.println("나눈 값 : " + insertSplit);

        //입력받은 값 형변환
        for(int i=0; i<insertSplit.length; i++) {

        }



        /*
        //입력받은 값 리스트에 저장
        ArrayList<String> insertList = new ArrayList<String>();
        for(int i=0; i<insertSplit.length; i++) {
            insertList.add(insertSplit[i]);
        }

        //입력받은 값 카운트 돌려서 형변환
        //홀수 -> 숫자
        //짝수 -> 문자
        for(int i=0; i<insertList.size(); i++) {

        }
        */


    }

}
