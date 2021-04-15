import 'dart:io';

String solution(List<int> numbers) {
  String answer = '';
  int count = 1;
  int maxCount = 1;
  int max = numbers[0];
  for (var n in numbers) {
    if (max < n) {
      max = n;
      maxCount = count;
    }
    count++;
  }
  answer += '$max\n$maxCount';
  return answer;
}

void main() {
  var numbers = <int>[];
  for (int i = 0; i < 9; i++) {
    numbers.add(int.parse(stdin.readLineSync()!));
  }
  print(solution(numbers));
}
