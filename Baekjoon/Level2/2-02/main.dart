import 'dart:io';

void main() {
  int score = int.parse(stdin.readLineSync().toString());

  if (90 <= score && score <= 100) {
    print('A');
  } else if (80 <= score) {
    print('B');
  } else if (70 <= score) {
    print('C');
  } else if (60 <= score) {
    print('D');
  } else {
    print('F');
  }
}
