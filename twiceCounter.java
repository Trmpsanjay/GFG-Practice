

//User function Template for Java

class Solution
{
    public int countWords(String list[], int n)
    {
        int count = 0;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<list.length;i++){
          if(map.containsKey(list[i])){
              map.put(list[i],map.get(list[i])+1);
          }else{
              map.put(list[i],1);
          }; 
        }
        
        for(String id : map.keySet()){
            //System.out.println(id);
                if(map.get(id)==2)
                    count++;
        }
        return count;
    }
}
