import Repository.DiaryRepository;
import Repository.MemberRepository;
import common.SystemMessage;
import dto.Member;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MemberRepository memberRepository = new MemberRepository();
        DiaryRepository diaryRepository = new DiaryRepository();
        Scanner sc = new Scanner(System.in);
        System.out.print(SystemMessage.PROGRAM_START);
        int startType = 0;
        while (startType != 3) {

            System.out.print(SystemMessage.START_MENU);
            startType = sc.nextInt();
            sc.nextLine();

            String id = "";
            String pwd = "";
            String name = "";

            switch (startType) {
                case 1:
                    System.out.print(SystemMessage.LOGIN_MENU);
                    System.out.print(SystemMessage.ID_INPUT_MSG);
                    id = sc.next();
                    System.out.print(SystemMessage.PWD_INPUT_MSG);
                    pwd = sc.next();

                    Member member = memberRepository.login(id, pwd);
                    if (member == null) {
                        System.out.print(SystemMessage.LOGIN_FAIL);
                        break;
                    } else {
                        System.out.print(SystemMessage.LOGIN_SUCCESS);
                    }

                    int mainType = 0;
                    while (mainType != 3) {

                        System.out.print(SystemMessage.MAIN_MENU);
                        mainType = sc.nextInt();
                        sc.nextLine();

                        switch (mainType) {
                            case 1:
                                System.out.print(SystemMessage.DIARY_WRITE);
                                System.out.print(SystemMessage.TITLE_INPUT_MSG);
                                String title = sc.nextLine();
                                System.out.print(SystemMessage.CONTENT_INPUT_MSG);
                                String content = sc.nextLine();

                                diaryRepository.writeDiary(title, content, member);
                                System.out.print(SystemMessage.SAVE_SUCCESS);
                                break;
                            case 2:
                                System.out.print(diaryRepository.selectDiaryList(member));
                                break;
                            case 3:
                                System.out.print(SystemMessage.LOGOUT_SUCCESS);
                        }
                    }
                    break;
                case 2:
                    System.out.print(SystemMessage.SIGNUP_MENU);
                    System.out.print(SystemMessage.ID_INPUT_MSG);
                    id = sc.next();
                    System.out.print(SystemMessage.PWD_INPUT_MSG);
                    pwd = sc.next();
                    System.out.print(SystemMessage.NAME_INPUT_MSG);
                    name = sc.next();
                    memberRepository.signUp(id, pwd, name);
                    System.out.print(SystemMessage.SIGNUP_SUCCESS);
                    break;
                case 3:
                    System.out.print(SystemMessage.PROGRAM_EXIT);
            }
        }
    }
}