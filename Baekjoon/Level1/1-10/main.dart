import 'dart:io';

String solution(int a, int b, int c) {
  String answer = '';
  answer += ((a + b) % c).toString() + '\n';
  answer += (((a % c) + (b % c)) % c).toString() + '\n';
  answer += ((a * b) % c).toString() + '\n';
  answer += (((a % c) * (b % c)) % c).toString() + '\n';
  return answer;
}

void main() {
  List<String> sc = stdin.readLineSync()!.split(' ');
  int a = int.parse(sc[0]);
  int b = int.parse(sc[1]);
  int c = int.parse(sc[2]);

  print(solution(a, b, c));
}
