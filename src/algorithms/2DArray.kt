package algorithms

// Complete the hourglassSum function below.
fun hourglassSum(arr: Array<Array<Int>>): Int {
    val list = mutableListOf<Int>()
    for (i in 0..3) {
        for (j in 0..3) {
            var count = 0
            for (k in i..(i+2)) {
                for (l in j..(j+2)) {
                    if ((l == j + 2 || l == j) && k == i + 1) {
                        continue
                    }

                    count += arr[k][l]
                }
            }
            list.add(count)
        }
    }

    return list.max()!!
}