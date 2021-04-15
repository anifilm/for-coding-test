import 'dart:io';

void main() {
  List<String> sc = stdin.readLineSync().toString().split(' ');
  int a = int.parse(sc[0]);
  int b = int.parse(sc[1]);
  int c = int.parse(sc[2]);
  print((a + b) % c);
  print(((a % c) + (b % c)) % c);
  print((a * b) % c);
  print(((a % c) * (b % c)) % c);
}
