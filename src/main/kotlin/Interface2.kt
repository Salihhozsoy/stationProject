import javax.xml.crypto.Data

interface IDatabase {
    fun insert(name: String, surname: String, email: String, password: String)
    fun deleted(id: Int)
    fun updated(user: User)
    fun getAll(): List<User>
}

fun main() {
    val mySqlDatabase = MySqlDatabase()
//  val firebaseDatabase = FirebaseDatabase()
    saveUser("osman", "grpnr", "osman@gmail", "asd", mySqlDatabase)

    val updatedUser =User(2,"akın","krts","akın@gmail","asdf")
   // updateUser(updatedUser,mySqlDatabase)

    //deleteUser("2", mySqlDataBase)

}


class MySqlDatabase : IDatabase {

    override fun insert(name: String, surname: String, email: String, password: String) {
        val lastUser = Database.users.lastOrNull()
        var user: User =  User(1,name,surname,email, password)

        lastUser?.let { user = User(lastUser.id+1,name,surname,email, password) }
        val result = Database.users.add(user)

        if (result) println("eklenen kullanici ${user.name} adli ${user.id} idli kullanici eklendi")
        else println("kullanici kayit islemi basarisiz")

        getAll().forEach {
            it.print()
        }
    }

    override fun deleted(id: Int) {
        val user =Database.users.find { it.id == id }

        user?.let {
            if(Database.users.remove(it)) println("kullanıcı silindi")
            else println("kullanıcı silinemedi")
        }?:run {
            println("kullanıcı bulunamadı")
        }
        getAll().forEach{
            it.print()
        }
    }

    override fun updated(user: User) {
        Database.users.find { it.id == user.id }?.let {
            it.name = user.name
            it.surname = user.surname
            it.email = user.email
            it.password = user.password
        } ?: run {
            println("kullanıcı bulunamadı")
        }
        Database.users.forEach { it.print() }
    }

    override fun getAll(): List<User> {
        return Database.users
    }

}

class FirebaseDatabase : IDatabase {
    override fun insert(name: String, surname: String, email: String, password: String) {
        println("$name kullanıcısı firebase veritabanına kayıt oldu")
    }

    override fun deleted(id: Int) {
        TODO("Not yet implemented")
    }

    override fun updated(user: User) {
        TODO("Not yet implemented")
    }

    override fun getAll(): List<User> {
        TODO("Not yet implemented")
    }

}

fun saveUser(name: String, surname: String, email: String, password: String, database: IDatabase) {
    database.insert(name, surname, email, password)
}
fun updateUser(user: User,database: IDatabase){
    database.updated(user)
}
fun deleteUser(id: Int,database: IDatabase){
    database.deleted(id)
}