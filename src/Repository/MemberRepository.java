package Repository;

import dto.Member;

import java.util.ArrayList;

public class MemberRepository {

    ArrayList<Member> list = new ArrayList<>();

    public Member signUp(String id, String pwd, String name) {
        Member member = new Member(id, pwd, name);
        list.add(member);
        return member;
    }

    public Member login(String id, String pwd) {

        for (Member member : list) {
            if (member.getId().equals(id)) {
                if (member.getPwd().equals(pwd)) {
                    return member;
                }
            }
        }

        return null;
    }
}
