```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { String item, int index ->
    println "Item at index $index: $item"
    if (item == "someValue") {
      return // This will exit the eachWithIndex loop prematurely
    }
  }
}

myMethod(["one", "two", "someValue", "three"])
```