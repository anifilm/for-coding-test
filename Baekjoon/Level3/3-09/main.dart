import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync().toString());

  for (int i = 0; i < n; i++) {
    String star = '';
    for (int j = 0; j <= i; j++) {
      star += '*';
    }
    print(star);
  }
}
