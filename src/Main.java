import dto.Diary;
import dto.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        String id = sc.next();
        System.out.printf("PWD: ");
        String pwd = sc.next();
        System.out.printf("name: ");
        String name = sc.next();
        Member member = new Member(id, pwd, name);
        System.out.println("회원가입 완료: " + member.toString());

        int seqno = 0;
        int type = 0;
        ArrayList<Diary> list = new ArrayList<>();

        while (type != 3) {

            System.out.println("1. 글쓰기, 2. 글 목록 조회, 3. 종료");
            type = sc.nextInt();
            sc.nextLine();

            switch (type) {
                case 1:
                    seqno ++;
                    System.out.printf("title: ");
                    String title = sc.nextLine();
                    System.out.printf("content: ");
                    String content = sc.nextLine();
                    System.out.printf("regDt: ");
                    String regDt = sc.nextLine();

                    Diary diary = new Diary(seqno, title, content, regDt, member.name);
                    list.add(diary);
                    System.out.println("글쓰기 완료: " + diary.toString());
                    break;
                case 2:
                    for (Diary diaryHistory : list) {
                        System.out.println(diaryHistory.toString());
                    }
                    break;
                case 3:
                    System.out.println("종료합니다.");
            }
        }
    }
}