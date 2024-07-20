package n2_자가진단_연산자.PersonalDiagnosis_hyungsungpyong;
import java.io.*;
import java.util.*;

public class nu_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st;
        //st = new StringTokenizer(br.readLine());
        //Integer Line = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>(4);

        for(int i=0; i<2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            list.add(h);
            list.add(w);
        }
        Boolean compare = (list.get(0) > list.get(2) && list.get(1) > list.get(3));
        System.out.println(compare);

        //System.out.println(list);

        /*
        int a_height = Integer.parseInt(st.nextToken());
        int a_weight = Integer.parseInt(st.nextToken());
        st2 = new StringTokenizer(br.readLine());
        int b_height = Integer.parseInt(st.nextToken());
        int b_weight = Integer.parseInt(st.nextToken());

        Boolean compare = (a_height > b_height && a_weight > b_weight);
        bw.write(compare + "");
*/
        /*
        while ((st != null)) {
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.add(height);
            list.add(weight);
        }
        Boolean compare = (list.get(0) > list.get(2) && list.get(1) > list.get(3));
        bw.write(compare + "");
         */
        bw.flush();
        bw.close();

    }
}
