import 'dart:io';

void main() {
  String sc = stdin.readLineSync().toString();
  List<String> ss = sc.split(' ');
  int a = int.parse(ss[0]);
  int b = int.parse(ss[1]);
  int c = int.parse(ss[2]);
  print((a + b) % c);
  print(((a % c) + (b % c)) % c);
  print((a * b) % c);
  print(((a % c) * (b % c)) % c);
}
