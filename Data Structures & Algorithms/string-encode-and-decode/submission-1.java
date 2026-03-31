class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length());
            sb.append('#');
            sb.append(strs.get(i));
        }
        return sb.toString();
    }


    public List<String> decode(String str) {
        ArrayList<String> s= new ArrayList<>();
        int i=0;
        int j=0;
        while(i<str.length()){
            // j=i;
            while(j < str.length() && (str.charAt(j) != '#')){
                j++;
            }
            int x=Integer.parseInt(str.substring(i, j));
            i=j+1+x;
            int k=j+1;
            char ch[]=new char[x];
            int y=0;
            while(k<str.length() && k<=j+x){
                ch[y]=str.charAt(k);
                y++;
                k++;
            }
            j=k;
            s.add(new String(ch));

        }
        return s;
    }
}
