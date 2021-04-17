int sum(List<int> a) {
  int answer = 0;
  for (var i in a) {
    answer += i;
  }
  return answer;
}

void main() {
  List<int> arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

  print(sum(arr));
}
