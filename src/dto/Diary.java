package dto;

public class Diary {
    private int seqno;
    private String title;
    private String content;
    private String regDt;
    private String author;

    public Diary(int seqno, String title, String content, String regDt, String author) {
        this.seqno = seqno;
        this.title = title;
        this.content = content;
        this.regDt = regDt;
        this.author = author;
    }

    public int getSeqno() {
        return seqno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegDt() {
        return regDt;
    }

    public String getAuthor() {
        return author;
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
