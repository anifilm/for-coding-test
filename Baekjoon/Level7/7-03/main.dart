import 'dart:io';

String solution(String input) {
  List<int> answer = List.filled(26, -1);
  for (var s in input.split('')) {
    // 문자를 아스키 코드로 변환후 인덱스화
    int index = s.codeUnitAt(0) - 'a'.codeUnitAt(0);
    ;
    int position = input.indexOf(s);
    answer[index] = position;
  }
  return answer.join(' '); // 리스트를 공백으로 구분하는 문자열로 변경
}

void main() {
  String input = stdin.readLineSync()!;

  print(solution(input));
}
