class Solution {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        var count = 0
        seats.sort()
        students.sort()
        
        for (i in 0..seats.size - 1) {
            count += Math.abs(seats[i] - students[i])
        }
        
        return count
    }
}
