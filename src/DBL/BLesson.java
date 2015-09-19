/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBL;

/**
 * Manages DB operations related to Basic Lessons of the ITI
 * @author hp
 */
public class BLesson extends Lesson { //this implies the word Basic Lesson, it is named as BLesson in order to get rid of the 
                                       //ambiguity of class names
    
    String point_1;            // important points of the description for the user
    String point_2;
    String point_3;
    String regularLessonsInvolved;  // where these stuffs are included in regular lessons

    public String getPoint_1() {
        return point_1;
    }

    public void setPoint_1(String point_1) {
        this.point_1 = point_1;
    }

    public String getPoint_2() {
        return point_2;
    }

    public void setPoint_2(String point_2) {
        this.point_2 = point_2;
    }

    public String getPoint_3() {
        return point_3;
    }

    public void setPoint_3(String point_3) {
        this.point_3 = point_3;
    }
    

    public String getRegularLessonsInvolved() {
        return regularLessonsInvolved;
    }

    public void setRegularLessonsInvolved(String regularLessonsInvolved) {
        this.regularLessonsInvolved = regularLessonsInvolved;
    }
    
    
    
}
