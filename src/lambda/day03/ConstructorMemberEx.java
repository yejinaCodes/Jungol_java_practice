package lambda.day03;

import org.w3c.dom.ls.LSOutput;

public class ConstructorMemberEx {
    public static void main(String[] args) {
        Person2 user = new Person2();

        Member m1 = user.getMember1(Member :: new);
        System.out.println(m1.getId());
        System.out.println(m1);
        Member m2 = user.getMember2(Member :: new);

    }


}
