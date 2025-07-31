package step2;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GeminiChat {
    // main
    // 입출력
    // 변수, 타입
    public static void main(String[] args) {
        // 입력: 질문을 받기
        Scanner sc = new Scanner(System.in); // 터미널을 통한 입력
        System.out.print("질문을 입력해 주세요!😍😍😍: ");
        String question = sc.nextLine();
        System.out.println("당신의 질문은 \'" + question + "\'입니다!");


        // Gemini와 통신하는 로직
        // API KEY : https://aistudio.google.com/apikey 에서 생성
        HttpClient client = HttpClient.newHttpClient(); // 요청을 보냄
        String GEMINI_API_KEY = "AIzaSy**************************";
        // 가이드 프롬포트
        String rule = "100자 이내의 간결한 답변으로 줘";


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent"))
                .headers("Content-Type", "application/json",
                        "X-goog-api-key", GEMINI_API_KEY).POST(HttpRequest.BodyPublishers.ofString("""
                {
                "contents": [
        {
            "parts": [
            {
                "text": "%s %s"
            }
        ]
        }
    ]
  }""" .formatted(question, rule))) // text에 입력받은 질문, rule을 넣음
                .build(); // 요청 자체


        String result = "";
        try {
            // 요청으로 받은 응답
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            result = response.body();
        } catch (Exception ex) {
          System.err.println(ex.getMessage());
        }

        // 출력: Gemini
        System.out.print("답변: ");
        result = result
                .split("\"text\": \"")[1] // result가 배열 상태이므로 지정해줌
                .split("}")[0]
                .replace("\\n\"", "") // \n"을 공백으로 바꿔줌
                .replace("**", "")
                .replace("\\n", "")
                .trim(); // 앞 뒤 공백 삭제
        System.out.println(result);

    }
}
