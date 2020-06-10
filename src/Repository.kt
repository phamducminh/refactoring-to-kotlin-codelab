import java.util.*

object Repository {
    private var users: MutableList<User>? = null

    fun getUsers(): List<User>? {
        return users
    }

    val formattedUserNames: List<String?>
        get() {
            val userNames: MutableList<String?> = ArrayList(users!!.size)
            for ((firstname, lastname) in users!!) {
                var name: String?

                name = if (lastname != null) {
                    if (firstname != null) {
                        "$firstname $lastname"
                    } else {
                        lastname
                    }
                } else if (firstname != null) {
                    firstname
                } else {
                    "Unknown"
                }
                userNames.add(name)
            }
            return userNames
        }

    // keeping the constructor private to enforce the usage of getInstance
    init {
        val user1 = User("Jane", "")
        val user2 = User("John", null)
        val user3 = User("Anne", "Doe")
        users = ArrayList()
        users!!.add(user1)
        users!!.add(user2)
        users!!.add(user3)
    }
}