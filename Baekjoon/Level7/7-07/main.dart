import 'dart:io';

int solution(String input) {
  int answer = 0;
  var arr = input.split(' ');
  // 문자열을 뒤집은 후 정수 형변환
  int a = int.parse(arr[0].split('').reversed.join());
  int b = int.parse(arr[1].split('').reversed.join());
  if (a > b)
    answer = a;
  else
    answer = b;
  return answer;
}

void main() {
  String input = stdin.readLineSync()!;

  print(solution(input));
}
