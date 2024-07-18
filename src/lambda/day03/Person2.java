package lambda.day03;

public class Person2 {

    public Member getMember1(CreateIdMember creatable){
        String id = "ssg-member";
        Member member = creatable.create(id);
        return member;
    }
    public Member getMember2(CreateIdNameMember createable){
        String id = "ssg-member";
        String name = "이어진";
        Member member = createable.create(id, name);
        return member;
    }
}
