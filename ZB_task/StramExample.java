import java.io.*;

public class StramExample {
    public static void main(String[] args) {
        // 1. fileInputstream으로 try-catch문 사용
        try (FileInputStream fis = new FileInputStream("text.txt")){
            int data;
            // 한 바이트씩 읽기
            while((data = fis.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        };

        // 2. FileOutputStream으로 byte사용
        try(FileOutputStream fos = new FileOutputStream("output.txt")){
            String text = "Hello, java";
            byte[] bytes = text.getBytes();
            fos.write(bytes);
        } catch (IOException e){
            e.printStackTrace();
        }

        // 3. FileReader로 한 문자씩 읽기
        try(FileReader fr = new FileReader("text.txt")){
            int r_data;
            // 한 문자씩 읽기
            System.out.print("\n== FileReader ==\n");
            while ((r_data = fr.read()) != -1){
                System.out.print((char) r_data);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        // 4. FileWriter로 문자 쓰기
        try(FileWriter fw = new FileWriter("output.txt")){
            fw.write("안녕하세요\n");
            fw.write("자바 스트림 수업 시간입니다");
        } catch (IOException e){
            e.printStackTrace();
        }

        // 5. BufferedReader로 한 줄씩 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))){
            String line;
            System.out.print("\n== BufferedReader ==\n");
            // 한 줄씩 읽기
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        // 6. BufferedWriter로 쓰기
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))){
            bw.write("첫 번째 줄");
            bw.newLine();
            bw.write("두 번쨰 줄");
            bw.newLine();
            bw.write("세 번쨰 줄");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
