import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync().toString());

  for (int i = 1; i <= 9; i++) {
    print('$n * $i = ${n * i}');
  }
}
