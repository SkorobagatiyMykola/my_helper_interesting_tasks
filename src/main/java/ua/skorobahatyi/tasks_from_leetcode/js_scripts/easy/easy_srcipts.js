//2727. Is Object Empty
//https://leetcode.com/problems/is-object-empty/description/?envType=study-plan-v2&envId=30-days-of-javascript
var isEmpty = function(obj) {
    return obj===null || Object.keys(obj).length===0 ? true : false;
};
//2629. Function Composition
//https://leetcode.com/problems/function-composition/description/?envType=study-plan-v2&envId=30-days-of-javascript
/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {

	return function(x) {
        return functions.reduceRight((y,fn)=>  fn(y),x)
    }
};