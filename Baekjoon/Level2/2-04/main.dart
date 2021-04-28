import 'dart:io';

int solution(int a, int b) {
  int answer = 0;
  if (0 < a && 0 < b)
    answer = 1;
  else if (a < 0 && 0 < b)
    answer = 2;
  else if (a < 0 && b < 0)
    answer = 3;
  else
    answer = 4;
  return answer;
}

void main() {
  int a = int.parse(stdin.readLineSync()!);
  int b = int.parse(stdin.readLineSync()!);

  print(solution(a, b));
}
