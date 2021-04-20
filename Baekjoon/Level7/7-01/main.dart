import 'dart:io';

void main() {
  String input = stdin.readLineSync()![0];

  print(input.codeUnits[0]); // 문자를 아스키 코드로 변환
}
