fun main() {

    var MyPerson=Person(4976342,"Jared",400.98)
    println()
    MyPerson.acountname
    MyPerson.balance
    MyPerson.acountnum
    MyPerson.deposit(300.00)
    MyPerson.withdraw(200.00)
    MyPerson.details("Jared",497642,400.00)


}
// 1.Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

fun randomstring(str:String){
    var name="Naomi"
    println(name.first())
    println(name.last())
    println(name.length)
    println(name.contains("a"))


}
//2
fun password(pass:Pair<Int,String>){
    var passwords= "awino203"
    var length= 16
    for (i in passwords){        if (i >= 8){
            println("correct password")
        }
        if(i>8 && i<=16)
    }
    }
//3 Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)

fun multiples(num1:Int,num2: Int):Int{
    var multiply=multiples(8,6)
    var numbers=

    if(v % 6==0){
        println("Bingo")
    }
       if (v%8==0) {
           println("Bingo")
       }
    else{
        println("values")
    }

}
// No.4
// Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)


data class Person(var acountnum:Int,var acountname: String,var balance:Double ){
 fun deposit(amount:Double){
     var increase=+1
     println(balance)
 }
    fun withdraw(amount: Double){
        var decrease= -1
        println(balance)
    }
    fun details(acountname:String,acountnum:Int,balance: Double){
        println("Account number $acountnum with balance $balance is operated by $acountname")

    }

}

//NO.5
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)


data class Persons(var acountnum:Int,var acountname: String,var balance:Double ){
    fun deposit(amount:Double){
        var increase=+1
        println(balance)
    }
    fun withdraw(amount: Int){
        var decrease= -1
        println(balance)
    }
    fun details(acountname:String,acountnum:Int,balance: Double){
        println("Account number $acountnum with balance $balance is operated by $acountname")

    }

}





