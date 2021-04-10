Array (배열) -> HashSet

# Arrays.asList() 메서드 사용

String[] array = new String[3];
array[0] = "Test1";
array[1] = "Test2";
array[2] = "Test3";

Set<T> set = new HashSet<>(Arrays.asList(array));


# Collection.addAll() 사용, Arrays.asList() 메서드에 비해 성능면에서 이점 있음
String[] array = {"john", "emma", "rick", "tim"};

Set<T> set = new HashSet<T>();
Collecdtions.addAll(set, array);


# Java 9 이상
Set<T> set = Set.of(array);

# Java 10 이상
var set = Set.of(array);
