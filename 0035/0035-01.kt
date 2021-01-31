```tsx
function searchInsert(nums: number[], target: number): number {
    const size = nums.length;
    if (target > nums[size - 1]) return size;
    let res = 0;
    for (let i = 0; i < size; i++) {
        if (nums[i] >= target) {
            res = i;
            break;
        }
    }
    return res;
};
```