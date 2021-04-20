import 'dart:io';

int solution(int n, String input) {
  int answer = 0;
  for (int i = 0; i < n; i++) {
    answer += int.parse(input[i]);
  }
  return answer;
}

void main() {
  int n = int.parse(stdin.readLineSync()!);
  String input = stdin.readLineSync()!;

  print(solution(n, input));
}
