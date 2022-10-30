import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class MaximumIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ip = br.readLine().trim().split("\\s+");
            int max = Integer.MIN_VALUE;
            int i = 0, j = 1, m = 0;
            for (; i < n;) {
                int a = Integer.parseInt(ip[i]);

                if (a <= Integer.parseInt(ip[j])) {
                    m = j;
                }

                if (j - i > max)
                    max = j - i;

                if (j >= n)
                    i++;
            }
            System.out.println(max);
        }
    }
}
