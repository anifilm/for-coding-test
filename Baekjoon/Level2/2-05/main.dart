import 'dart:io';

void main() {
  List<String> sc = stdin.readLineSync().toString().split(' ');
  int hour = int.parse(sc[0]);
  int min = int.parse(sc[1]);

  if (min < 45) {
    if (hour == 0) {
      hour += 24 - 1;
      min += 60 - 45;
    } else {
      hour -= 1;
      min += 60 - 45;
    }
  } else {
    min -= 45;
  }
  print('$hour $min');
}
