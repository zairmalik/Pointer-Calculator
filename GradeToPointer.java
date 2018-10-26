package com.learn.uzair.pointercalculator;

/**
 * Created by user on 9/29/2017.
 */

class GradeToPointer {

    double GradeToMaxPointer(String grade){
        double maxPointer = 0d;

        switch(grade){
            case "A+":
                maxPointer = 4.0d;
                break;
            case "A":
                maxPointer = 4.0d;
                break;
            case "A-":
                maxPointer = 3.94d;
                break;
            case "B+":
                maxPointer = 3.62d;
                break;
            case "B":
                maxPointer = 3.24d;
                break;
            case "B-":
                maxPointer = 2.94d;
                break;
            case "C+":
                maxPointer = 2.62d;
                break;
            case "C":
                maxPointer = 2.24d;
                break;
            case "C-":
                maxPointer = 1.9d;
                break;
            case "D":
                maxPointer = 1.4d;
                break;
            case "E":
                maxPointer = 0d;
                break;
        }

        return maxPointer;
    }

    double GradeToMinPointer(String grade){
        double minPointer = 0d;

        switch(grade){
            case "A+":
                minPointer = 4.0d;
                break;
            case "A":
                minPointer = 4.0d;
                break;
            case "A-":
                minPointer = 3.7d;
                break;
            case "B+":
                minPointer = 3.3d;
                break;
            case "B":
                minPointer = 3.0d;
                break;
            case "B-":
                minPointer = 2.7d;
                break;
            case "C+":
                minPointer = 2.3d;
                break;
            case "C":
                minPointer = 2.0d;
                break;
            case "C-":
                minPointer = 1.5d;
                break;
            case "D":
                minPointer = 1.0d;
                break;
            case "E":
                minPointer = 0d;
                break;
        }

        return minPointer;
    }
}
