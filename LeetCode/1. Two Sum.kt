class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var r = intArrayOf()
        loop@ for(i in 0 until nums.size -1){
            for(j in i+1..nums.size-1){
                val s = nums[i] + nums[j]
                if(s == target){
                    r = intArrayOf(i, j)
                    break@loop
                }
            }
        }
        return r
    }
}