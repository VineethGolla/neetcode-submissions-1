class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length());
            sb.append('#');
            for(int j=0;j<strs.get(i).length();j++){
                sb.append(strs.get(i).charAt(j));
            }
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        ArrayList<String> s=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<str.length()){
            int size=0;
            StringBuilder sb = new StringBuilder();
            while(j<str.length() && str.charAt(j) != '#'){
                size=size*10 + (str.charAt(j)-'0');
                j++;
            }
            sb.append(str,j+1,j+1+size);
            j=j+size+1;
            i=j;
            s.add(sb.toString());
        }
        return s;
    }
}