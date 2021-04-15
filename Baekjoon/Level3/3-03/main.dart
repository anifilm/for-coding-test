import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync().toString());

  int answer = 0;
  for (int i = 1; i <= n; i++) {
    answer += i;
  }
  print(answer);
}
