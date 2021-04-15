import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync()!);

  for (int i = 0; i < n; i++) {
    List<String> sc = stdin.readLineSync().toString().split(' ');
    int a = int.parse(sc[0]);
    int b = int.parse(sc[1]);
    print(a + b);
  }
}
