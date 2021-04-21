import 'dart:io';

int solution(int n) {
  int answer = 1;
  int range = 1, tmp = 1;
  while (true) {
    if (range >= n) break;
    tmp = 6 * (answer++);
    range += tmp;
  }
  return answer;
}

void main() {
  int n = int.parse(stdin.readLineSync()!);

  print(solution(n));
}
