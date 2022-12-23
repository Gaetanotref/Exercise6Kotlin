fun main() {
    fun getType(user: User): String {
        return when (user) {
            is User.Email -> "Id:${user.id}, Email: ${user.email}, Password: ${user.password}"
            is User.Google -> "Id:${user.id}, Email: ${user.email}, Password: ${user.password}"
            is User.Facebook -> "Id:${user.id}, Email: ${user.email}, Password: ${user.password}"
        }
    }

    val email = User.Email("IdEmail")
    val facebook = User.Facebook("IdFacebook", "EmailFacebook")
    val google = User.Google("IdGoogle", "EmailGoogle", "PasswordGoogle")
    val test1 = getType(email)
    val test2 = getType(facebook)
    val test3 = getType(google)
    println(test1)
    println(test2)
    println(test3)
}