//Bonus: refactor Numbers.java into javascript

let nums = [10,100,1000,5,50,500,3,30,300,7,70,700,1,10,100,25,250,2500];

const isOdd = number => number % 2 !== 0 ? true : false;
console.log(isOdd(5))

const isEven = number => number % 2 === 0 ? true : false;
console.log(isEven(5))


const isPrime = number => {
	if (number < 2) return false;
	for ( let i = 2; i < number; i++ ) {
		if ( number % i === 0 ) {
			return false;
		}
	}
	return true;
}
console.log(isPrime(5))



const added = () => nums.reduce((a, b) => a+b, 0);
console.log(added())

const subtracted = () => nums.reduce((a, b) => a-b, 0);
console.log(subtracted())


const multiplied = () => nums.reduce((a, b) => a*b, 1);
console.log(multiplied())


const divided = () => nums.reduce((a, b) => a/b, 555);
console.log(divided())


const findMax = () => Math.max(...nums);
console.log(findMax())


const findMin = () => Math.min(...nums);
console.log(findMin())


const compare = (i, j) => {
	if (nums[i] > nums[j]) return 1;
	else if (nums[i] < nums[j]) return -1;
	return 0;
}
console.log(compare(3, 80))


const append = number => {
	nums.push(number);
	return nums[nums.length-1];
}
console.log(append(44))