import 'dart:io';
import 'dart:math';

double solution(int n, List<int> numbers) {
  double answer = 0.0;
  double total = 0.0;
  int numMax = numbers.reduce(max);
  for (int i = 0; i < n; i++) {
    total += numbers[i] / numMax * 100;
  }
  answer = total / n;
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
