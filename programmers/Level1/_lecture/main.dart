import 'dart:io';

String solution(List<int> numbers) {
  String answer = 'test';
  return answer;
}

void main() {
  var numbers = <int>[];
  for (int i = 0; i < 3; i++) {
    numbers.add(int.parse(stdin.readLineSync()!));
  }
  print(solution(numbers));
}
