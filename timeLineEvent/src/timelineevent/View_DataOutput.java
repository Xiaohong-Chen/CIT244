package timelineevent;



public class View_DataOutput {
    
    public void displayAll(Controller c,Model m) throws Exception{
        
        String[][] s =c.readDataFromModel(m);
        for(int i=0;i<s.length-2;i++){
            System.out.println(s[i][0]+s[i][1]+s[i][2]+s[i][3]+s[i][4]+s[i][5]+s[i][6]+s[i][7]+s[i][8]);    
        }
        
        
    }
    
}
