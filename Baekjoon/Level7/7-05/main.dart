import 'dart:io';

String solution(String input) {
  String answer = '';
  List<int> alphabet = List.filled(26, 0);
  input = input.toUpperCase();
  for (var s in input.split('')) {
    // 문자를 아스키 코드로 변환후 인덱스화
    int index = s.codeUnitAt(0) - 'A'.codeUnitAt(0);
    alphabet[index]++;
  }
  int max = 0;
  for (int i = 0; i < alphabet.length; i++) {
    if (alphabet[i] == 0) continue;
    if (max == alphabet[i]) {
      answer = '?';
    }
    if (max < alphabet[i]) {
      max = alphabet[i];
      answer = String.fromCharCode(i + 'A'.codeUnitAt(0)); // 아스키 코드를 문자로 변경
    }
  }
  return answer;
}

void main() {
  String input = stdin.readLineSync()!;

  print(solution(input));
}
