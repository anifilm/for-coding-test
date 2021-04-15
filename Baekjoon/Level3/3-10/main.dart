import 'dart:io';

void main() {
  int n = int.parse(stdin.readLineSync()!);

  for (int i = 0; i < n; i++) {
    String star = '';
    for (int j = n - 1; j > i; j--) {
      star += ' ';
    }
    for (int k = 0; k <= i; k++) {
      star += '*';
    }
    print(star);
  }
}
