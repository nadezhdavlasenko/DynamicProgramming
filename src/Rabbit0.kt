import java.lang.Integer.min

fun numberOfWays(maxStep: Int, numberOfColumns: Int): Int {
    val arr = IntArray(numberOfColumns)
    if (numberOfColumns < 2) return numberOfColumns
    arr[0] = 1
    arr[1] = 1
    for (i in 2 until  numberOfColumns) {
        for (j in 1..min(maxStep, i))
            arr[i] += arr[i-j]
    }
    arr.forEach { print("$it ")  }
    println()

    return arr[numberOfColumns-1]
}

fun main() {
    print(numberOfWays(6, 3))
}
