/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBL;

import java.util.Date;

/**
 *
 * @author hp
 */
public class Student extends Admin {

    String PriorExpereince;
    int NumberOfLessonsCovered;
    int CurrentLesson;
    String DateRegistred;

    public String getDateRegistred() {
        return DateRegistred;
    }

    public void setDateRegistred(String DateRegistred) {
        this.DateRegistred = DateRegistred;
    }
    
    public String getPriorExpereince() {
        return PriorExpereince;
    }

    public void setPriorExpereince(String PriorExpereince) {
        this.PriorExpereince = PriorExpereince;
    }
    

    public int getNumberOfLessonsCovered() {
        return NumberOfLessonsCovered;
    }

    public void setNumberOfLessonsCovered(int NumberOfLessonsCovered) {
        this.NumberOfLessonsCovered = NumberOfLessonsCovered;
    }

    public int getCurrentLesson() {
        return CurrentLesson;
    }

    public void setCurrentLesson(int CurrentLesson) {
        this.CurrentLesson = CurrentLesson;
    }

}
