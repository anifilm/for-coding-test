import 'dart:io';

void main() {
  List<String> sc = stdin.readLineSync()!.split(' ');
  int a = int.parse(sc[0]);
  int b = int.parse(sc[1]);

  if (a < b) {
    print('<');
  } else if (a > b) {
    print('>');
  } else {
    print('==');
  }
}