import 'dart:io';

String solution(List<int> numbers) {
  String answer = '';
  String str = (numbers[0] * numbers[1] * numbers[2]).toString();
  var check = List.filled(10, 0);
  for (int i = 0; i < str.length; i++) {
    check[int.parse(str[i])]++;
  }
  answer = check.join('\n');
  return answer;
}

void main() {
  var numbers = <int>[];
  for (int i = 0; i < 3; i++) {
    numbers.add(int.parse(stdin.readLineSync()!));
  }
  print(solution(numbers));
}
