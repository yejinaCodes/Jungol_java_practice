package json.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectToJson {
    //객체 생성 도구
    private static Gson gson1 = new GsonBuilder()
            .disableHtmlEscaping()
            .setPrettyPrinting()
            .serializeNulls()
            .create();

    private static Student getData(){
        Student student = new Student();
        student.setId(1);
        student.setName("yejin");

        return student;
    }

    public static void main(String[] args) {
        //1-1
        System.out.println(gson1.toJson(getData()));
        System.out.println();

        //1-2
        String jsonStudent = gson1.toJson(getData());
        Student toStudent = gson1.fromJson(jsonStudent, Student.class); //매개변수에서는 .class를 사용해야 함.

        System.out.println("ID: " + toStudent.getId());
        System.out.println("이름: " + toStudent.getName());
    }
}
