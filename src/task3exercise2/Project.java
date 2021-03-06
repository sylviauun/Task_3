package task3exercise2;


public class Project {

    // 1. Declare your private attributes here:
    // NIM : Sylvia Dwi Anggraini
    // NAMA : 1301154469 
    
    //
    // Constructor initialize project name, 
    // instantiate array member with size of [5],
    // and set release status = false
    //
    //------------------- your code here-----------------------
    
    private String Project_name;
    private Member[] teamMember;
    private int nTeam = 0;
    private boolean releaseStatus;
         
    
    //---------------------------------------------------------
    
    // 2. Declare your Constructor here:
    // NIM : Sylvia Dwi Anggraini
    // NAMA : 1301154469 
    //
    //------------------- your code here-----------------------
        public Project(String Project_name){
        this.Project_name = Project_name;
        this.teamMember = new Member[5];
        this.releaseStatus = false;
    }
    
    //---------------------------------------------------------
    
    
    // 3. Declare your Setter and Getter method here:
    // NIM : Sylvia Dwi Anggraini
    // NAMA : 1301154469 
    //
    //------------------- your code here-----------------------
        public boolean isReleaseStatus(){
            return releaseStatus;
        }                 
    //---------------------------------------------------------
    
    
    // 4. Declare method addMember( m : Member ) here:
    // NIM : Sylvia Dwi Anggraini
    // NAMA : 1301154469 
    //
    // add an object Member m into array team member, then
    // increment integer nTeam+1
    //
    //------------------- your code here-----------------------
        public void addMember(Member m){
            this.teamMember[nTeam] = m;
            nTeam++;
            m.setProjectWorked(m.getProjectWorked()+1);       
        }
    
        
    //---------------------------------------------------------
    
    
    // 5. Declare method releaseApp() here:
    // NIM : Sylvia Dwi Anggraini
    // NAMA : 1301154469 
    //
    // set release status = true
    //
    //------------------- your code here-----------------------
        public void releaseApp(){
            this.releaseStatus = true;
        }
    
    //---------------------------------------------------------
    
    
    // 6. Create method toString() : String here:
    // NIM : Sylvia Dwi Anggraini
    // NAMA : 1301154469  
    //
    // returns String that contains Project name, number of team member, 
    // and release status 
    // 
    // example : "Project Exodus, status not releaser, with team member of 4"
    //
    public String toString() {
    //------------------- your code here-----------------------
        String stat;
        boolean releaseStatus = false;
        if (releaseStatus==false){
            stat = "Tidak Diketahui";
        }
        else {
            stat = "Dalam Proses";
        }
        String a = "Project"+Project_name+"Status is"+stat+"with team Member of"+nTeam;
        return a;
    
    //---------------------------------------------------------
    }
}