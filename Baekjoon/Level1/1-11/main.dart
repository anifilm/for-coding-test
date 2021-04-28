import 'dart:io';

String solution(int a, int b) {
  String answer = '';

  int n, b1, b2, b3;
  n = b;
  b1 = n % 10; // 일의 자리수
  n ~/= 10;
  b2 = n % 10; // 십의 자리수
  n ~/= 10;
  b3 = n % 10; // 백의 자리수

  answer += (a * b1).toString() + '\n';
  answer += (a * b2).toString() + '\n';
  answer += (a * b3).toString() + '\n';
  answer += (a * b).toString() + '\n';
  return answer;
}

void main() {
  int a = int.parse(stdin.readLineSync()!);
  int b = int.parse(stdin.readLineSync()!);

  print(solution(a, b));
}
