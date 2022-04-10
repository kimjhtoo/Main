import java.io.*;
import java.util.StringTokenizer;

public class Buffer {
    public static void main(String[] args) throws IOException {//IOException 이라는 예외처리를 해야한다. (기본문법)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Scanner
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // Print

        int a = Integer.parseInt(br.readLine()); //문자열 인자를 파싱, 숫자로 바꾸는 변수함수 출력 = ParseInt

        StringTokenizer st;
        for ( int i =1; i<=a; i++) {
            st= new StringTokenizer(br.readLine(), " ");

            bw.write("Case"+" "+"#"+i+":"+" "+(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) ) + "\n");
        }
        br.close(); // Reader 닫아주고

        bw.flush(); // write에 있던 정보를 모두 꺼내고
        bw.close(); // 마지막으로 최종적으로 닫기
    }
}