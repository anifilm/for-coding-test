import 'dart:io';

int solution(String str, String ch) {
  int answer = 0;
  str = str.toLowerCase();
  for (var s in str.split('')) {
    if (s == ch) {
      answer++;
    }
  }
  return answer;
}

void main() {
  String input1 = stdin.readLineSync()!; // 문자열 입력
  String input2 = stdin.readLineSync()![0]; // 문자 입력

  print(solution(input1, input2));
}
