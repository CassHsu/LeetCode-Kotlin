class Solution {
    fun numUniqueEmails(emails: Array<String>): Int {
        val m = mutableMapOf<String, Int>()
        
        for (email in emails) {
            val names = email.split("@")
            var local = names[0].split("+")[0]
            local = local.replace(".", "")
            
            val k = local + "@" + names[1]
            if (m[k] == null) {
                m[k] = 1
            }
        }
        
        return m.size
    }
}
