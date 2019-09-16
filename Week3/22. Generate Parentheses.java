class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        solve(list,"(",1,0,n);
        return list;
    }
    public void solve(List<String> list,String s, int open,int close,int n){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(open<n){
            solve(list,s+"(",open+1,close,n);
        }
        if(close<open){
            solve(list,s+")",open,close+1,n);
        }     
        
    }
}