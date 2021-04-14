import 'dart:io';

void main() {
  int a = int.parse(stdin.readLineSync().toString());
  int b = int.parse(stdin.readLineSync().toString());

  if (0 < a && 0 < b)
    print(1);
  else if (a < 0 && 0 < b)
    print(2);
  else if (a < 0 && b < 0)
    print(3);
  else
    print(4);
}
