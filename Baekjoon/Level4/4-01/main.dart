import 'dart:io';

void main() {
  while (true) {
    List<String> sc = stdin.readLineSync().toString().split(' ');
    int a = int.parse(sc[0]);
    int b = int.parse(sc[1]);
    if (a == 0 && b == 0) break;
    print(a + b);
  }
}
