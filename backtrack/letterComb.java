class Solution{
public static final String [] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	public List<String> letterCombinations(String digits){
		List<String> list = new ArrayList<>();
		if(digits == null || digits.length() == 0) return list;
		helper(digits, "", 0, list);
		return list;
	}
	
	private void helper(String digits, String cur, int pos, List<String> list){
		if(pos == digits.length()){
			list.add(cur);
			return;
		}
		String key = KEYS[digits.charAt(pos) - '0'];
		for(int i = 0; i < key.length(); i++){
			helper(digits, cur + key.charAt(i), pos + 1, list);
		}
	}
}
