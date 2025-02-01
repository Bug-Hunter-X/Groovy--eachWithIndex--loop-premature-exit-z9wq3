```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    println "Item at index $index: $item"
    if (item == "someValue") {
      // To skip the rest of current iteration use 'continue'
      return
    }
  }
}

myMethod(["one", "two", "someValue", "three"])

//Alternatively, use a more controlled loop:

def myMethod2(List<String> list) {
  for (int i = 0; i < list.size(); i++) {
    String item = list[i]
    println "Item at index $i: $item"
    if (item == "someValue") {
      break //Properly exits the loop when 'someValue' is found
    }
  }
}

myMethod2(["one", "two", "someValue", "three"])
```