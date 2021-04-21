import 'dart:io';

String solution(String str) {
  String answer = '';
  var check = 'abcdefghijklmnopqrstuvwxyz';
  for (var s in str.split('')) {
    if (check.contains(s)) {
      answer += s.toUpperCase();
    } else {
      answer += s.toLowerCase();
    }
  }
  return answer;
}

void main() {
  String input = stdin.readLineSync()!; // 문자열 입력

  print(solution(input));
}
