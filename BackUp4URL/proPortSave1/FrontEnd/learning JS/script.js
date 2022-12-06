// this file will cover all the fundamentals of JS

//Variables and values


// through the let key word we establish a variable then we set the name for the variable and using the = operator we set the value which in this case is a string, then finally we close the variable with the ; (in java Script this is optional but its good practice.)
let firstName = "Ernesto";


//through the console.log function we print the variables
console.log(firstName);

//Data Types

let isIsland = false;
let homeCountry = 'Puerto Rico';

if (homeCountry == 'Puerto Rico') isIsland = true;




//lecture let const var



// basic operators



//strings and template literals



//if else statements



// type conversion and coersion


// equality operators


//logical operators


//switch statements

//the conditional ternary operator




//--------------------------------------------------------------
let skillStorm = "review";

// call back functions
//are any functions we dont want to execute immediatelly they will be executed after some period of time or after some acction has happened.

/**
 * setInterval -- executes certain code every x number of milliseconds
 * setTimeout --executes code once after x number of milliseconds
 * 
 * any async functon returns a promise
 */

setTimeout(()=>{
    console.log('this is my timeout.')}, 500)

function sayHi(){
    console.log('hi!');

    setTimeout(sayHi, 1000);

    setInterval(()=>{
        console.log('My Interval')}, 1000);
// if we want to be able to stop an interval we need to sotore it in a variable  then we use clearInterval to stop it.

}





// constructor functions

// allow us to create a type of object and then use that type to create instances 

function Parrot(name, age, crackerPreference){
    this.name = name;
    this.age = age;
    this.crackerPreference = crackerPreference;
}


/**
 * creates something that looks like and is considered an instance of parrot
 * 
 * {
 * name:'',
 * age:xx,
 * crackerPreferance = "XX"
 * }
 * 
 */


const polly = new Parrot('Dicky', 10, 'tilapia')
console.log(polly)
polly.color =  'green';
delete polly.color;

//this was an example of object manipulation

