package accessmodifier

open class Car {
    fun drive(){}
    private fun stop() {}
    protected fun crash() {}
}

class Audi : Car() {

  init {
      drive()
      crash()
  }
    fun method(){
        crash()
    }

}

