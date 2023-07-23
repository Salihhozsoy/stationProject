package sealed

import kotlin.collections.List
import User
import java.lang.Exception

sealed class UIState {                                         //Sealed classlar enum classların genişletilmiş halidir.
    object Idle : UIState()                                    //Enum classlar tek bir değişken tipine sahipken sealed classlar her bir durum için farklı değişken tiplerine sahip olabilir.
    object Loading : UIState()                                 //Sealed classlar soyut oldukları için bu sınıflardan nesne üretemeyiz
    data class Result(val users:List<User>): UIState()
    data class Error(val exception: Exception): UIState()
}