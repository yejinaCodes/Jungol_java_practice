package PersonalDiagnosis_hyungsungpyong;
import java.io.*;
import java.util.*;

public class nu_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>(4);

        while ((st != null)) {
            int height = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.add(height);
            list.add(weight);
        }
        Boolean compare = (list.get(0) > list.get(2) && list.get(1) > list.get(3));
        bw.write(compare + "");
        bw.flush();
        bw.close();

    }
}
