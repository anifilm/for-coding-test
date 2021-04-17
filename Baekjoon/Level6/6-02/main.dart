int selfNum(int n) {
  int sum = n;
  while (true) {
    if (n == 0) break;
    sum += n % 10;
    n = n ~/ 10;
  }
  return sum;
}

void main() {
  const N = 10001;
  var arr = List.filled(N, 0);
  for (int i = 1; i < N; i++) {
    int idx = selfNum(i);
    if (idx < N) {
      arr[idx] = 1;
    }
  }
  for (int i = 1; i < N; i++) {
    if (arr[i] == 0)
      print(i);
  }
}
