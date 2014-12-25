/*
 * (자기고백문제) 자기 자신의 코드를 출력하는 프로그램을 작성하시오.
 * 이 때 별도의 입력(사용자로부터의 입력이나, 파일 시스템 접근 등)은 사용할 수 없습니다.
 */
package test;

import java.io.*;
import java.util.StringTokenizer;

public class SelfConfessedProblem {
    public static void main(String[] args) throws IOException {
        new SelfConfessedProblem().getSourceCode();
    }   

    void getSourceCode() throws IOException {
        String filePath = System.getProperty("user.dir") + "\\src";
        StringTokenizer st = new StringTokenizer(this.getClass().getCanonicalName(), "."); 

        while (st.hasMoreElements()) {
            filePath += '\\' + st.nextElement().toString();   
        }   

        filePath += ".java";

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append("\n");
            line = br.readLine();
        }

        String code = sb.toString();
        br.close();

        System.out.println(code);
    }
}