import 'dart:io';

void main() {
  int year = int.parse(stdin.readLineSync().toString());

  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
    print(1);
  } else {
    print(0);
  }
}
