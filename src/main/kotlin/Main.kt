import javax.swing.tree.FixedHeightLayoutCache

fun main() {
    var  numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    arrayWok(numbers)
    person()
    name("Mercy","Lucy","Milker")

}
//}
//1. Create one function that is given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order. (1 point)//
 fun arrayWok(number: Array<Int>){
        var sum = number[1] + number[4]
        println("Sum of second and fifth elements: $sum")
        var index = number.indexOf(158)
        println(" print out index of 158: $index")
        var sortedNumbers = number.sorted()
        println(" print the  numbers in ascending order: $sortedNumbers")
    }



//Given a list of Person objects, each with the attributes, name, age,
// height, and weight. Sort the list in order of descending age (2 points)
data class Person ( var name:String, var  age:Int, var height:Int, var weight:Int)
fun person() {
    var person1 = Person("Ann Anyango", 20, 43, 50)
    var person2 = Person("Nicholas Ouma", 50, 9, 60)
    var person3 = Person("Betty Apio", 15, 8, 20)
    var Person = listOf(person1, person2, person3)
    var people = Person.sortedByDescending { Person -> Person.age }
    println(people)
}


// Create a function that takes in 3 names and returns a string array
// containing all 3 names. (2 points)
fun name(name1:String,name2:String,name3:String):Array<String>{
    var cotains= listOf(name1,name2,name3)
  return cotains

}


/// Write a function that takes in a list of Car objects each with
// a registration and mileage attribute and returns
// the average mileage of all the vehicles in the list. (3 points)
data class Car(var registration: String,var miliage:Double )
fun carIdentificatin(car: List<Car>):Double{
    var miliage=0.0
    for (car in car){
        miliage+=car.miliage
    }
    return miliage/car.size
}