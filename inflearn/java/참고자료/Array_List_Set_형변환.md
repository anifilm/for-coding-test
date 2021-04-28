# List to Array
List<String> arrayList = new ArrayList<>();
// Add datas
String[] array = arrayList.toArray(new String[0]);

# Array to List
String[] array = new String[10];
// Add datas
List<String> arrayList = new ArrayList<>(Arrays.asList(array));


# List to Set
List<String> arrayList = new ArrayList<>();
// Add datas
Set<String> set = new Set<>(arrayList);

List<String> arrayList = new ArrayList<>();
// Add datas
Set<String> set = new Set<>();
set.addAll(arrayList);

# Set to List
Set<String> set = new Set<>();
// Add datas
List<String> arrayList = new ArrayList<>(set);

Set<String> set = new Set<>();
// Add datas
List<String> arrayList = new ArrayList<>();
arrayList.addAll(set);
