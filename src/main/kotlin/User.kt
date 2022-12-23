sealed class User {
    data class Email(val id: String, var email: String? = null, var password: String? = null) : User()
    data class Google(val id: String, var email: String? = null, var password: String? = null) : User()
    data class Facebook(val id: String, var email: String? = null, var password: String? = null) : User()
}
