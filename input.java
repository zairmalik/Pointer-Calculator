package com.learn.uzair.pointercalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class input extends AppCompatActivity{

    EditText credit1, credit2, credit3, credit4, credit5, credit6, credit7, grade1, grade2, grade3, grade4, grade5, grade6, grade7, totalRecentCredit, totalRecentCPA;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        credit1 = findViewById(R.id.credit1);
        credit2 = findViewById(R.id.credit2);
        credit3 = findViewById(R.id.credit3);
        credit4 = findViewById(R.id.credit4);
        credit5 = findViewById(R.id.credit5);
        credit6 = findViewById(R.id.credit6);
        credit7 = findViewById(R.id.credit7);
        grade1 = findViewById(R.id.grade1);
        grade2 = findViewById(R.id.grade2);
        grade3 = findViewById(R.id.grade3);
        grade4 = findViewById(R.id.grade4);
        grade5 = findViewById(R.id.grade5);
        grade6 = findViewById(R.id.grade6);
        grade7 = findViewById(R.id.grade7);
        totalRecentCredit = findViewById(R.id.totalrecentcreditinput);
        totalRecentCPA = findViewById(R.id.totalrecentcpainput);

        Toast.makeText(getApplicationContext(),"The grey font is hint, just type something into it!",Toast.LENGTH_LONG).show();
    }

    public void calculate(View view){
        GradeToPointer gradeToPointer = new GradeToPointer();
        Intent intent = new Intent(getApplicationContext(),result.class);
        int totalCurrentCredit;
        double totalMaxPointer, totalMinPointer, maxGPA, minGPA;
        double totalRecentPointer, totalOverallPointerMax, totalOverallPointerMin, maxCPA, minCPA;

        String credit1String = credit1.getText().toString();
        String credit2String = credit2.getText().toString();
        String credit3String = credit3.getText().toString();
        String credit4String = credit4.getText().toString();
        String credit5String = credit5.getText().toString();
        String credit6String = credit6.getText().toString();
        String credit7String = credit7.getText().toString();
        String grade1String = grade1.getText().toString();
        String grade2String = grade2.getText().toString();
        String grade3String = grade3.getText().toString();
        String grade4String = grade4.getText().toString();
        String grade5String = grade5.getText().toString();
        String grade6String = grade6.getText().toString();
        String grade7String = grade7.getText().toString();
        String totalRecentCreditString = totalRecentCredit.getText().toString();
        String totalRecentCPAString = totalRecentCPA.getText().toString();

        grade1String = grade1String.toUpperCase();
        grade2String = grade2String.toUpperCase();
        grade3String = grade3String.toUpperCase();
        grade4String = grade4String.toUpperCase();
        grade5String = grade5String.toUpperCase();
        grade6String = grade6String.toUpperCase();
        grade7String = grade7String.toUpperCase();

        if (TextUtils.isEmpty(credit1String)){
            credit1.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit2String)){
            credit2.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit3String)){
            credit3.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit4String)){
            credit4.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit5String)){
            credit5.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit6String)){
            credit6.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(credit7String)){
            credit7.setError("Credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade1String)){
            grade1.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade2String)){
            grade2.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade3String)){
            grade3.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade4String)){
            grade4.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade5String)){
            grade5.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade6String)){
            grade6.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(grade7String)){
            grade7.setError("Grade cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(totalRecentCreditString)){
            totalRecentCredit.setError("Total recent credit cannot be empty.");
            return;
        }

        if (TextUtils.isEmpty(totalRecentCPAString)){
            totalRecentCPA.setError("Total recent CPA cannot be empty.");
            return;
        }

        if (isGradeLetter(grade1String)){
            Toast.makeText(this,"Grade for subject 1 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (isGradeLetter(grade2String)){
            Toast.makeText(this,"Grade for subject 2 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (isGradeLetter(grade3String)){
            Toast.makeText(this,"Grade for subject 3 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (isGradeLetter(grade4String)){
            Toast.makeText(this,"Grade for subject 4 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (isGradeLetter(grade5String)){
            Toast.makeText(this,"Grade for subject 5 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (isGradeLetter(grade6String)){
            Toast.makeText(this,"Grade for subject 6 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (isGradeLetter(grade7String)){
            Toast.makeText(this,"Grade for subject 7 is not a grade.",Toast.LENGTH_SHORT).show();
            return;
        }

        int credit1Integer = Integer.parseInt(credit1String);
        int credit2Integer = Integer.parseInt(credit2String);
        int credit3Integer = Integer.parseInt(credit3String);
        int credit4Integer = Integer.parseInt(credit4String);
        int credit5Integer = Integer.parseInt(credit5String);
        int credit6Integer = Integer.parseInt(credit6String);
        int credit7Integer = Integer.parseInt(credit7String);
        int totalRecentCreditInteger = Integer.parseInt(totalRecentCreditString);

        if (credit1Integer < 1 || credit1Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (credit2Integer < 1 || credit2Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (credit3Integer < 1 || credit3Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (credit4Integer < 1 || credit4Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (credit5Integer < 1 || credit5Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (credit6Integer < 1 || credit6Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (credit7Integer < 1 || credit7Integer > 4){
            Toast.makeText(this,"Invalid credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        if (totalRecentCreditInteger > 130){
            Toast.makeText(this,"Invalid total recent credit.",Toast.LENGTH_SHORT).show();
            return;
        }

        double grade1ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade1String);
        double grade2ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade2String);
        double grade3ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade3String);
        double grade4ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade4String);
        double grade5ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade5String);
        double grade6ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade6String);
        double grade7ToMaxPointer = gradeToPointer.GradeToMaxPointer(grade7String);
        
        double grade1ToMinPointer = gradeToPointer.GradeToMinPointer(grade1String);
        double grade2ToMinPointer = gradeToPointer.GradeToMinPointer(grade2String);
        double grade3ToMinPointer = gradeToPointer.GradeToMinPointer(grade3String);
        double grade4ToMinPointer = gradeToPointer.GradeToMinPointer(grade4String);
        double grade5ToMinPointer = gradeToPointer.GradeToMinPointer(grade5String);
        double grade6ToMinPointer = gradeToPointer.GradeToMinPointer(grade6String);
        double grade7ToMinPointer = gradeToPointer.GradeToMinPointer(grade7String);
        double totalRecentCPADouble = Double.parseDouble(totalRecentCPAString);

        if (totalRecentCPADouble > 4.0d){
            Toast.makeText(this,"Invalid CPA.",Toast.LENGTH_SHORT).show();
            return;
        }

        totalCurrentCredit = credit1Integer + credit2Integer + credit3Integer + credit4Integer + credit5Integer + credit6Integer + credit7Integer;

        totalMaxPointer = (credit1Integer*grade1ToMaxPointer) + (credit2Integer*grade2ToMaxPointer) + (credit3Integer*grade3ToMaxPointer) + (credit4Integer*grade4ToMaxPointer)
                + (credit5Integer*grade5ToMaxPointer) + (credit6Integer*grade6ToMaxPointer) + (credit7Integer*grade7ToMaxPointer);

        totalMinPointer = (credit1Integer*grade1ToMinPointer) + (credit2Integer*grade2ToMinPointer) + (credit3Integer*grade3ToMinPointer) + (credit4Integer*grade4ToMinPointer)
                + (credit5Integer*grade5ToMinPointer) + (credit6Integer*grade6ToMinPointer) + (credit7Integer*grade7ToMinPointer);

        maxGPA = totalMaxPointer/totalCurrentCredit;
        minGPA = totalMinPointer/totalCurrentCredit;

        totalRecentPointer = totalRecentCreditInteger*totalRecentCPADouble;
        totalOverallPointerMax = totalRecentPointer + totalMaxPointer;
        totalOverallPointerMin = totalRecentPointer + totalMinPointer;

        maxCPA = totalOverallPointerMax/(totalCurrentCredit + totalRecentCreditInteger);
        minCPA = totalOverallPointerMin/(totalCurrentCredit + totalRecentCreditInteger);

        intent.putExtra("MinGPA",minGPA);
        intent.putExtra("MaxGPA",maxGPA);
        intent.putExtra("MinCPA",minCPA);
        intent.putExtra("MaxCPA",maxCPA);

        startActivity(intent);
    }

    private boolean isGradeLetter(String grade){
        String grades = "A+AA-B+BB-C+CC-DEF";

        return !grades.contains(grade);
    }
}
