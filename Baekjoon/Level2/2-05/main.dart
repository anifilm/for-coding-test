import 'dart:io';

void main() {
  String sc = stdin.readLineSync().toString();
  List<String> ss = sc.split(' ');
  int hour = int.parse(ss[0]);
  int min = int.parse(ss[1]);

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
