package com.example.rockpaperscissors

fun main(){
    var computerChoice = ""
    var personChoice = ""

    print("Enter Rock, Paper or Scissors: ")
    personChoice = readln()

    var randomNum = (1..3).random()

    if(randomNum == 1){
        computerChoice = "Rock"
    }
    else if(randomNum == 2){
        computerChoice = "Paper"
    }
    else{
        computerChoice = "Scissors"
    }
    println("Computer Choice: " + computerChoice)

    if(computerChoice == personChoice){
        println("Tie!")
    }
    else if(computerChoice == "Rock"){
        if(personChoice == "Paper"){
            println("Person Wins!")
        }
        else{
            println("Computer Wins!")
        }
    }
    else if(computerChoice == "Paper"){
        if(personChoice == "Scissors"){
            println("Person Wins!")
        }
        else{
            println("Computer Wins!")
        }
    }
    else if(computerChoice == "Scissors"){
        if(personChoice == "Rock"){
            println("Person Wins!")
        }
        else{
            println("Computer Wins!")
        }
    }
}