# for문을 사용하여 ArrayList의 요소를 찾아 삭제하면 List의 사이즈가 줄어들면서 다른 요소들의 index도 바뀌기 때문에 원하는 결과를 얻을 수 없다.
# 요소 검색을 뒤에서 부터 하거나 다음과 같이 Iterator를 사용해야 한다.

ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
Iterator<String> iter = list.iterator();
while (iter.hasNext()) {
    String s = iter.next();

    if (s.equals("a")) {
        iter.remove();
    }
}
