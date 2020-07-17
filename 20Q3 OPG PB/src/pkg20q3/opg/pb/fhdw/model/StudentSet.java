/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20q3.opg.pb.fhdw.model;

/**
 *
 * @author Florian
 */
public class StudentSet {
     private Student[] studentArray;
    
    public StudentSet(){
        studentArray = new Student[Student.LAST_ID];
    }
    
    public void add(Student student){
        studentArray[student.getId()] = student;
    }
    
    public Student getStudent(int id){
        return isPresent(id) ? studentArray[id] : null;
    }
    
    public void remove(int id){
        if (isPresent(id)){
            studentArray[id] = null;
        }
    }
    
    public int getNo(){
        // Achtung remove!!!!
        int count = 0;
        for (Student student: studentArray){
            if (student != null){
                count++;
            }
        }
        return count;
    }
    
    public Student[] getAll(){
       Student[] result = new Student[this.getNo()];
        int index = 0;
        for (Student student: studentArray){
            if (student != null) {
                result[index++] = student;
            }
        }
        return result;
    }
    
    private boolean isPresent(int id){
        if (id>=Student.FIRST_ID && id <= (Student.FIRST_ID + Student.getNoOfAssignedIds())){
            return true;
        }else{
            return false;
        }
        
    }
}
