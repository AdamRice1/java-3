//Bonus:  refactor Animals.java into javascript

let animals = ["Peacock","Rabbit","Chiwawa","Orangutan","Viper","Cobra","Panda","Buffalo","Deer","Mallard"];

function main () {
   console.log(capsFirst(animals, false))
   console.log(addAnimal("Cat"))
   console.log(animals)
   console.log(lowerFirst(animals, false))

}


const capsFirst = (arr, bool) => {
   if ( bool ) {
      let newArr = arr.slice();
      return newArr.map(val => val.slice(0, 1).toUpperCase() + val.slice(1).toLowerCase())
   }
   else {
      return arr.map(val => val.slice(0, 1).toUpperCase() + val.slice(1).toLowerCase());
   }
}

const addAnimal = animalName => {
   animals.push(animalName);
   return animalName;
}

const lowerFirst = ( arr, mutate ) => {
   if (mutate) {
      return arr.map(v => v.slice(0, 1).toLowerCase() + v.slice(1).toUpperCase());
   }
   let newArr = arr.slice();
   return newArr.map(v => v.slice(0, 1).toLowerCase() + v.slice(1).toUpperCase());
}