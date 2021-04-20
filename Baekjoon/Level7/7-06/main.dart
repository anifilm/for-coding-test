import 'dart:io';

int solution(String input) {
  int answer = 0;
  if (input.trim().length == 0) return 0; // 공백 하나 입력된 경우 0을 반환
  var arr = input.trim().split(' ');
  answer = arr.length;
  return answer;
}

void main() {
  String input = stdin.readLineSync()!;

  print(solution(input));
}
