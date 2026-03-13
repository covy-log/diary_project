import Repository.DiaryRepository;
import Repository.MemberRepository;
import dto.Diary;
import dto.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MemberRepository memberRepository = new MemberRepository();
        DiaryRepository diaryRepository = new DiaryRepository();
        Scanner sc = new Scanner(System.in);

        int startType = 0;
        while(startType != 3){

            System.out.println("1. 로그인, 2. 회원가입, 3. 종료");
            startType = sc.nextInt();
            sc.nextLine();

            String id = "";
            String pwd = "";
            String name = "";

            switch (startType) {
                case 1:
                    System.out.println("[로그인]");
                    System.out.print("ID: ");
                    id = sc.next();
                    System.out.printf("PWD: ");
                    pwd = sc.next();

                    Member member = memberRepository.login(id, pwd);
                    if (member == null) {
                        System.out.println("[아이디 및 비밀번호가 틀립니다.]\n");
                        break;
                    } else {
                        System.out.println("[로그인 되었습니다.]\n");
                    }

                    int mainType = 0;
                    while (mainType != 3) {

                        System.out.println("1. 일기 쓰기, 2. 모든 일기 조회, 3. 로그아웃");
                        mainType = sc.nextInt();
                        sc.nextLine();

                        switch (mainType) {
                            case 1:
                                System.out.println("[일기 쓰기]");
                                System.out.printf("title: ");
                                String title = sc.nextLine();
                                System.out.printf("content: ");
                                String content = sc.nextLine();

                                diaryRepository.writeDiary(title, content, member);
                                System.out.println("[저장 완료]\n");
                                break;
                            case 2:
                                System.out.println(diaryRepository.selectDiaryList(member));
                                break;
                            case 3:
                                System.out.println("[로그아웃]\n");
                        }
                    }
                    break;
                case 2:
                    System.out.println("[회원가입]");
                    System.out.print("ID: ");
                    id = sc.next();
                    System.out.printf("PWD: ");
                    pwd = sc.next();
                    System.out.printf("name: ");
                    name = sc.next();
                    memberRepository.signUp(id, pwd, name);
                    System.out.println("[회원가입 완료]\n");
                    break;
                case 3:
                    System.out.println("[프로그램을 종료합니다]");
            }
        }


    }
}