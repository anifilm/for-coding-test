# 배열의 요소를 직접 확인하면 중복 제거

String[] dataList = {"apple", "banana", "orange", "apple", "grape", "banana"};
ArrayList<String> arrayList = new ArrayList<>();

for (String data : dataList) {
    if (!arrayList.contains(data))
        arrayList.add(data);
}

System.out.println(arrayList);  // result = [apple, banana, orange, grape]


# Set을 이용하여 중복 제거 (HashSet, LinkedHashSet, TreeSet)
HashSet<String> hashSet = new HashSet<>();

LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

TreeSet<String> treeSet = new TreeSet<>();

for (String data : dataList) {
    hashSet.add(data);
    linkedHashSet.add(data);
    treeSet.add(data);
}

System.out.println(hashSet);       // result = [banana, orange, apple, grape]
System.out.println(linkedHashSet); // result = [apple, banana, orange, grape]
System.out.println(hashSet);       // result = [banana, orange, apple, grape]
