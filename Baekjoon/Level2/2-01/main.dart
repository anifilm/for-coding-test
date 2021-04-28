import 'dart:io';

String solution(int a, int b) {
  String answer = '';
  if (a < b) {
    answer = '<';
  } else if (a > b) {
    answer = '>';
  } else {
    answer = '==';
  }
  return answer;
}

void main() {
  List<String> sc = stdin.readLineSync()!.split(' ');
  int a = int.parse(sc[0]);
  int b = int.parse(sc[1]);

  print(solution(a, b));
}
