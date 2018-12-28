/*
Merge Sort - O(n log n)
*/

uArr=[20,13,0,9,2,5,3,6]


function mergeSort(arr){
    if(arr.length < 2){ //recursion base case - if the array is only composed of 1 element, return it.
        return arr
    }else{
        var mid = Math.floor(arr.length/2)  //splitting the array into left and right making two smaller sub arrays in no particular order
        var left = arr.slice(0, mid) //*Be mindful of variable scope when declaring variable
        var right = arr.slice(mid, arr.length)
        return merge(mergeSort(left), mergeSort(right)); //run the merge function, which do the actual sorting, the parameters are calling the function recursively to continue  splitting the array till the base case is met
    }
}

function merge(left, right){
    var result = [] //new array to be returned
    while(left.length && right.length){ //if the length is not 0, the loop will go on to perform the sort - looking at the first element between 2 arrays
        if (left[0] <= right[0]){
            result.push(left.shift()) //remove the first element and push it to the new array
        }else{
            result.push(right.shift())
        }
    }
    //these codes are here in case the array's length is an odd number resulting in one with more element than the other
    //for example when the left array has 0 element, but the right array still has one left or vice versa
    while(left.length){  
        result.push(left.shift())
    }
    while(right.length){
        result.push(right.shift())
    }
    return result
}

console.log(mergeSort(uArr))