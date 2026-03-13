package dto;

public class Diary {
    public int seqno;
    public String title;
    public String content;
    public String regDt;
    public String author;

    public Diary(int seqno, String title, String content, String regDt, String author) {
        this.seqno = seqno;
        this.title = title;
        this.content = content;
        this.regDt = regDt;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Diary{" +
                "seqno=" + seqno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", regDt='" + regDt + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
