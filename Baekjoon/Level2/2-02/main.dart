import 'dart:io';

String solution(int score) {
  String answer = '';
  if (90 <= score && score <= 100) {
    answer = 'A';
  } else if (80 <= score) {
    answer = 'B';
  } else if (70 <= score) {
    answer = 'C';
  } else if (60 <= score) {
    answer = 'D';
  } else {
    answer = 'F';
  }
  return answer;
}

void main() {
  int score = int.parse(stdin.readLineSync()!);

  print(solution(score));
}
