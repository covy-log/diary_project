package dto;

public class Diary {
    int seqno;
    String title;
    String content;
    String regDt;

    public Diary(int seqno, String title, String content, String regDt) {
        this.seqno = seqno;
        this.title = title;
        this.content = content;
        this.regDt = regDt;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "seqno=" + seqno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", regDt='" + regDt + '\'' +
                '}';
    }
}
