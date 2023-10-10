//2727. Is Object Empty
//https://leetcode.com/problems/is-object-empty/description/?envType=study-plan-v2&envId=30-days-of-javascript
var isEmpty = function(obj) {
    return obj===null || Object.keys(obj).length===0 ? true : false;
};