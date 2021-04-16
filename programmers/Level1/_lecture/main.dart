import 'dart:io';

String solution(List<int> numbers) {
  String answer = '';
  return answer;
}

void main() {
  var numbers = <int>[];
  for (int i = 0; i < 9; i++) {
    numbers.add(int.parse(stdin.readLineSync()!));
  }
  print(solution(numbers));
}
