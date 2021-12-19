import java.time.LocalDate

class Solution {
    fun daysBetweenDates(date1: String, date2: String): Int {
        var d1 = LocalDate.parse(date1).toEpochDay()
        var d2 = LocalDate.parse(date2).toEpochDay()
        
        val diff = d2!! - d1!!
        if (diff > 0) return diff.toInt()
        return diff.toInt() * -1
    }
}
