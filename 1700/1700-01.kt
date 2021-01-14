class Solution {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        val dqStudent = ArrayDeque<Int>(students.toMutableList())
        val dqSandwich = ArrayDeque<Int>(sandwiches.toMutableList())
        
        if (countIt(dqStudent, 1) == countIt(dqSandwich, 1)) return 0
        
        while (dqSandwich.count() > 0) {
            if (countIt(dqStudent, dqSandwich.peek()) == 0) break
            
            val student = dqStudent.pop()
            if (dqSandwich.peek() == student) {
                dqSandwich.removeFirst()
            } else {
                dqStudent.add(student)
            }
        }
        return dqStudent.count()
    }
    
    fun countIt(arr: Deque<Int>, target: Int): Int {
        var count = 0
        for (a in arr) {
            if (a == target) count++
        }
        return count
    }
}