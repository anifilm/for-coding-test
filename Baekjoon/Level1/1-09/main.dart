import 'dart:io';

void main() {
  List<String> sc = stdin.readLineSync().toString().split(' ');
  int a = int.parse(sc[0]);
  int b = int.parse(sc[1]);
  print(a + b);
  print(a - b);
  print(a * b);
  print(a ~/ b);
  print(a % b);
}
