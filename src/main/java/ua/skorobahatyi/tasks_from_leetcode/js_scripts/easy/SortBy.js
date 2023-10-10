/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
//https://leetcode.com/problems/sort-by/description/?envType=study-plan-v2&envId=30-days-of-javascript
//2724. Sort By


var sortBy = function(arr, fn) {
     arr.sort((a,b)=>fn(a)-fn(b));
     return arr;
};
