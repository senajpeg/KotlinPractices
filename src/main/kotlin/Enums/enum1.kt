package Enums

fun main(){
Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(result = Repository.getCurrentState())
    Repository.error()
    getResult(result = Repository.getCurrentState())
}


fun getResult(result: Result){
return when(result){
    Result.SUCCESS -> println("succesfull")
    Result.FAILURE -> println("failure")
    Result.ERROR -> println("error")
   Result.IDLE-> println("idle")
    Result.LOADING-> println("loading")
}
}

object Repository{
    private var loadState:Result=Result.IDLE
    private var dataFetched:String?=null
    fun startFetch(){
        loadState=Result.LOADING
        dataFetched="data"
    }
    fun finishedFetch(){
        loadState=Result.SUCCESS
        dataFetched=null
    }
    fun error(){
        loadState=Result.ERROR
    }
    fun getCurrentState():Result{
return loadState
    }
}


enum class Result{
    SUCCESS,
    FAILURE,
    ERROR,
    IDLE,
    LOADING
}