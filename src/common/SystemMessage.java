package common;

public class SystemMessage {

    // 객체화를 방지하기 위한 기본 생성자 접근 제한
    private SystemMessage() {}

    // 메뉴 문구
    public static final String START_MENU = "1. 로그인\n2. 회원가입\n3. 종료\n";
    public static final String MAIN_MENU = "1. 일기 쓰기\n2. 모든 일기 조회\n3. 로그아웃\n";
    public static final String DIARY_WRITE = "[일기 쓰기]\n";
    public static final String LOGIN_MENU = "[로그인]\n";
    public static final String LOGOUT_MENU = "[로그아웃]\n";
    public static final String SIGNUP_MENU = "[회원가입]\n";

    // 안내 문구
    public static final String LOGIN_SUCCESS = "[로그인 되었습니다.]\n\n";
    public static final String LOGIN_FAIL = "[아이디 및 비밀번호가 틀립니다.]\n\n";
    public static final String SAVE_SUCCESS = "[저장이 완료되었습니다.]\n\n";
    public static final String LOGOUT_SUCCESS = "[로그아웃 되었습니다.]\n\n";
    public static final String SIGNUP_SUCCESS = "[회원가입이 완료되었습니다.]\n\n";
    public static final String PROGRAM_START = "[프로그램을 시작합니다.]\n\n";
    public static final String PROGRAM_EXIT = "[프로그램을 종료합니다.]\n\n";
    public static final String DIARY_NO_EXIST = "[작성된 일기가 없습니다.]\n\n";

    // 입력 문구
    public static final String ID_INPUT_MSG = "ID: ";
    public static final String PWD_INPUT_MSG = "PWD: ";
    public static final String NAME_INPUT_MSG = "NAME: ";
    public static final String TITLE_INPUT_MSG = "TITLE: ";
    public static final String CONTENT_INPUT_MSG = "CONTENT: ";
}
