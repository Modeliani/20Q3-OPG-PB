
package pkg20q3.opg.pb.fhdw.model;


public enum Role {
    NO_ROLE("No Role"),
    PROFESSOR_ONLY("Professor only"),
    FAQCULTY_DIRECTOR("Faculty Director"),
    PRESIDENT("President"),
    VISITING_LECTURER("Visiting Lecturer");
    
    String string;
    
    private Role(String string){
        this.string = string;
    }
    
        public static String[] strings(){
        Role[] roles = Role.values();
        String[] result = new String[roles.length];
        for(Role role: roles){
            result[role.ordinal()] = role.toString();
        }
        return result;
    }
    
    public static Role parse(String string){
        for(Role role: Role.values()){
            if(role.toString().equals(string)){
                return role;
            }
        }
        return NO_ROLE;
    }
}
