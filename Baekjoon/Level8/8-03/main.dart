import 'dart:io';

String solution(int n) {
  String answer = '';
  int count = 0;
  while (n > 0) {
    count++;
    n -= count;
  }
  if (count % 2 == 0)
    answer = '${count + n}/${1 + (-n)}';
  else {
    answer = '${1 + (-n)}/${count + n}';
  }
  return answer;
}

void main() {
  int n = int.parse(stdin.readLineSync()!);

  print(solution(n));
}
