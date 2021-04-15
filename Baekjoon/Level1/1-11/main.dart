import 'dart:io';

void main() {
  int a = int.parse(stdin.readLineSync()!);
  int b = int.parse(stdin.readLineSync()!);

  int n, b1, b2, b3;
  n = b;
  b1 = n % 10; // 일의 자리수
  n ~/= 10;
  b2 = n % 10; // 십의 자리수
  n ~/= 10;
  b3 = n % 10; // 백의 자리수

  print(a * b1);
  print(a * b2);
  print(a * b3);
  print(a * b);
}
