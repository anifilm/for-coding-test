import 'dart:io';

int solution(int year) {
  int answer = 0;
  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
    answer = 1;
  }
  return answer;
}

void main() {
  int year = int.parse(stdin.readLineSync()!);

  print(solution(year));
}
