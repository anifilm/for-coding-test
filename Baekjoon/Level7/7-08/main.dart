import 'dart:io';

int solution(String input) {
  int answer = 0;
  int len = input.length;
  for (var item in input.split('')) {
    if ('ABC'.contains(item)) answer += 2;
    if ('DEF'.contains(item)) answer += 3;
    if ('GHI'.contains(item)) answer += 4;
    if ('JKL'.contains(item)) answer += 5;
    if ('MNO'.contains(item)) answer += 6;
    if ('PQRS'.contains(item)) answer += 7;
    if ('TUV'.contains(item)) answer += 8;
    if ('WXYZ'.contains(item)) answer += 9;
  }
  answer += len;
  return answer;
}

void main() {
  String input = stdin.readLineSync()!;

  print(solution(input));
}
