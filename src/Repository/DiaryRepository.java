package Repository;

import common.SystemMessage;
import dto.Diary;
import dto.Member;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DiaryRepository {

    private int seqno;
    private ArrayList<Diary> list = new ArrayList<>();

    public Diary writeDiary(String title, String content, Member member) {
        this.seqno ++;

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String regDt = now.format(formatter);

        Diary diary = new Diary(this.seqno, title, content, regDt, member.getId());
        list.add(diary);

        return diary;
    }

    public String selectDiaryList(Member member) {

        String str = "";

        for (Diary diary : list) {
            if (diary.getAuthor().equals(member.getId())) {
                str += "제목: " + diary.getSeqno() + "." + diary.getTitle() + "\n";
                str += "작성자: " + diary.getAuthor() + ", 날짜: " + diary.getRegDt() +"\n";
                str += "내용: " + diary.getContent() + "\n\n";
            }
        }

        if (str.length() == 0){
            return SystemMessage.DIARY_NO_EXIST;
        } else {
            return str;
        }
    }
}
