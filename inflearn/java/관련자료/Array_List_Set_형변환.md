# List to Array
ArrayList<String> arrayList = new ArrayList<>();
// Add datas
String[] array = arrayList.toArray(new String[0]);

# Array to List
String[] array = new String[10];
// Add datas
ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));


# List to Set
ArrayList<String> arrayList = new ArrayList<>();
// Add datas
Set<String> set = new Set<>(arrayList);

ArrayList<String> arrayList = new ArrayList<>();
// Add datas
Set<String> set = new Set<>();
set.addAll(arrayList);

# Set to List
Set<String> set = new Set<>();
// Add datas
ArrayList<String> arrayList = new ArrayList<>(set);

Set<String> set = new Set<>();
// Add datas
ArrayList<String> arrayList = new ArrayList<>();
arrayList.addAll(set);
