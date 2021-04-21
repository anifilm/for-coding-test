import 'dart:io';

int solution(List numbers) {
  int answer = 0;
  int a = numbers[0], b = numbers[1], c = numbers[2];
  if (b >= c)
    answer = -1;
  else
    answer = a ~/ (c - b) + 1;
  return answer;
}

void main() {
  List<String> sc = stdin.readLineSync()!.split(' ');
  var numbers = <int>[];
  for (int i = 0; i < sc.length; i++) {
    numbers.add(int.parse(sc[i]));
  }

  print(solution(numbers));
}
