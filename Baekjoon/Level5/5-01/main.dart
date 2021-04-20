import 'dart:io';

String solution(int n, List<int> numbers) {
  String answer = '';
  int min = numbers[0];
  int max = numbers[0];
  for (var n in numbers) {
    if (min > n) min = n;
    if (max < n) max = n;
  }
  answer += '$min $max';
  return answer;
}

void main() {
  int n = int.parse(stdin.readLineSync()!);
  List<String> sc = stdin.readLineSync()!.split(' ');
  var numbers = <int>[];
  for (int i = 0; i < n; i++) {
    numbers.add(int.parse(sc[i]));
  }

  print(solution(n, numbers));
}
