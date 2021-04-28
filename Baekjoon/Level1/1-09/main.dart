import 'dart:io';

String solution(int a, int b) {
  String answer = '';
  answer += (a + b).toString() + '\n';
  answer += (a - b).toString() + '\n';
  answer += (a * b).toString() + '\n';
  answer += (a ~/ b).toString() + '\n';
  answer += (a % b).toString() + '\n';
  return answer;
}

void main() {
  List<String> sc = stdin.readLineSync()!.split(' ');
  int a = int.parse(sc[0]);
  int b = int.parse(sc[1]);

  print(solution(a, b));
}
