package junwoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * name : X보다_작은_수
 * @author junnukim1007gmail.com
 * @date 25. 12. 24.
 */
public class 백준_10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            int a = Integer.parseInt(st.nextToken());

            if (a < X) {
                System.out.print(a + " ");
            }
        }
    }
}
