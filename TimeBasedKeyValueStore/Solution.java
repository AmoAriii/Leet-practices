package TimeBasedKeyValueStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Kole mateghe dastan ine k object misazim ba key va list k shamele value o time mishe.
//badesh bry gashtan ba BinarySearch migardim va nazdik tarin value ii k user khaste ro peyda mikinim ba gereftan key va time;

public class Solution {
  class TimeMap {
    class Obj {
      String value;
      int Timestamp;

      Obj(String value, int timestamp) {
        this.value = value;
        this.Timestamp = timestamp;
      }
    }

    HashMap<String, List<Obj>> map;

    public TimeMap() {
      map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }

      map.get(key).add(new Obj(value, timestamp));
    }

    public String get(String key,int timestamp){
      if(!map.containsKey(key)){
        return "";
      }

      List<Obj> list=map.get(key);
      String res="";
      int left=0;
      int right=list.size()-1;

      while(left<=right){
        int mid=left+(right-left)/2;

        if(list.get(mid).Timestamp<=timestamp){
          res=list.get(mid).value;

          left=mid+1;
        }else{
          right=mid-1;
        }
      }

      return res;
    }

  }

}
