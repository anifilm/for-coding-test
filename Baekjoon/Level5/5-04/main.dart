import 'dart:io';

int solution(List<int> numbers) {
  int answer = 0;
  Set<int> remainder = Set();
  for (var n in numbers) {
    remainder.add(n % 42);
  }
  answer = remainder.length;
  return answer;
}

void main() {
  var numbers = <int>[];
  for (int i = 0; i < 10; i++) {
    numbers.add(int.parse(stdin.readLineSync()!));
  }

  print(solution(numbers));
}
