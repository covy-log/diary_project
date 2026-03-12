import dto.Diary;
import dto.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int type = 0;

        while (type == 2) {
            Scanner sc = new Scanner(System.in);
            System.out.print("ID: ");
            String id = sc.next();
            System.out.printf("PWD: ");
            String pwd = sc.next();
            System.out.printf("name: ");
            String name = sc.next();
            Member member = new Member(id, pwd, name);
            System.out.println("회원가입 완료: " + member.toString());
            System.out.println("1. 글쓰기, 2. 종료");
            type = sc.nextInt();

            int seqno = 0;
            ArrayList<Diary> list = new ArrayList<>();

            if (type == 1) {
                seqno ++;
                System.out.printf("title: ");
                String title = sc.next();
                System.out.printf("content: ");
                String content = sc.next();
                System.out.printf("regDt: ");
                String regDt = sc.next();

                Diary diary = new Diary(seqno, title, content, regDt);
                list.add(diary);
                System.out.println("글쓰기 완료: " + diary.toString());
            }
        }
        System.out.println("종료");
    }
}