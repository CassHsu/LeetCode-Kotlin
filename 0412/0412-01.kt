class Solution {
    fun fizzBuzz(n: Int): List<String> {
        var res: MutableList<String> = mutableListOf<String>()
        var im3: Float
        var im5: Float
        for (i in 1..n) {
            im3 = i % 3.0f
            im5 = i % 5.0f
            if (im3 == 0.0f && im5 == 0.0f) {
                res.add("FizzBuzz")
            } else if (im3 == 0.0f) {
                res.add("Fizz")
            } else if (im5 == 0.0f) {
                res.add("Buzz")
            } else {
                res.add(i.toString())
            }
        }
        return res.toList()
    }
}