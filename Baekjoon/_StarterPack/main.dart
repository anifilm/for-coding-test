import 'dart:io';

String solution(int n, List<int> numbers) {
  String answer = '';

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
