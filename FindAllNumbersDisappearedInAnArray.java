class Solution {
    public List<Integer> findDisappearedNumbers(int[] num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(num);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : num)
            map.put(i, i);
        for (int i = 1; i <= num.length; i ++)
            if (!map.containsKey(i))
                list.add(i);
        return list;
    }
}