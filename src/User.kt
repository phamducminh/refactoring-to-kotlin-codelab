data class User(var firstName: String?, var lastName: String? = null)

// usage
val jane = User("Jane") // same as User("Jane", null)
val joe = User("Joe", "Doe")
val john = User(firstName = "John", lastName = "Doe")
