//2704. To Be Or Not To Be
//https://leetcode.com/problems/to-be-or-not-to-be/description/?envType=study-plan-v2&envId=30-days-of-javascript
/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {

    return {
        toBe: function(num){
            if (val===num)
                return true;
            else
                throw "Not Equal"
        },
        notToBe: function(num){
            if (val!==num)
                return true
            else
                throw "Equal";
        }
    }

};

/**
 * expect(5).toBe(5); // true
 * expe