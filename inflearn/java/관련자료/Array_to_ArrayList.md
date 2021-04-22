Array (배열) -> ArrayList

# Arrays.asList() 메서드 사용

String[] array = new String[3];
array[0] = "Test1";
array[1] = "Test2";
array[2] = "Test3";

List<String> arrayList = new ArrayList<>(Arrays.asList(array));


# Collection.addAll() 사용, Arrays.asList() 메서드에 비해 성능면에서 이점 있음
String[] array = {"john", "emma", "rick", "tim"};

List<String> arrayList = new ArrayList<String>();
Collections.addAll(arrayList, array);


# for문 사용

String[] array = new String[3];
array[0] = "Test1";
array[1] = "Test2";
array[2] = "Test3";

List<String> arrayList = new ArrayList<>();
for (String temp : array) {
    arrayList.add(temp);
}



ArrayList -> Array (배열)

# toArray() 메서드 사용

ArrayList<String> arrayList = new ArrayList<>();
arrayList.add("Test1");
arrayList.add("Test2");
arrayList.add("Test3");

String[] array = arrayList.toArray(new String[arrayList.size()]);


# for문 사용

ArrayList<String> arrayList = new ArrayList<>();
arrayList.add("Test1");
arrayList.add("Test2");
arrayList.add("Test3");

String[] array = new String[arrayList.size()];
int size = 0;
for (String temp : arrayList) {
    array[size++] = temp;
}

