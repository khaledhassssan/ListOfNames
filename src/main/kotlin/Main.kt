
fun main(args: Array<String>) {
    println("Write a list of names: (leave empty to quit)")
    val names: ArrayList<String> = ArrayList()
    val names2: ArrayList<String> = ArrayList()

    //Take names from user
    while (true) {
        val enteredString = readLine()
        if (enteredString == "") break
        names.add(enteredString.toString())
    }

    //Filter names
    for (element in names ) {
        if(element.contains("A", ignoreCase = true))
           names2.add(element.toString())
        if(element.contains("a", ignoreCase = true))
            names2.add(element.toString())
        if(element.contains("M", ignoreCase = true))
            names2.add(element.toString())
        if(element.contains("m", ignoreCase = true))
            names2.add(element.toString())
    }

    //Make names UPPERCASE
    for (element in names2 ) {
        println(element.uppercase())
    }
}
