//2665. Counter II
//https://leetcode.com/problems/counter-ii/description/?envType=study-plan-v2&envId=30-days-of-javascript
/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let t = {
        val: init,
        increment: ()=>++t.val,
        decrement: ()=>--t.val,
        reset: ()=>{
            t.val=init
            return t.val
        }
    }
    return t
};

/**


 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */