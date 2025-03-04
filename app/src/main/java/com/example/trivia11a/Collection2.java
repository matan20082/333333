package com.example.trivia11a;

import java.util.ArrayList;
import java.util.Random;

public class Collection2 {
    private ArrayList<Question> arr;
    private int index; // מספר השאלה הבאה בתור

    private Question qq;

    private int num=0;

    public Collection2()
    {
        Question q1 = new Question("1+10","7", "11", "3","100", 2);
        Question q2 = new Question("1+2", "8", "2", "3","100", 3);
        Question q3 = new Question("1+3", "6", "2", "4","100", 3);
        Question q4 = new Question("1+4", "5", "2", "3","100", 1);
        Question q5 = new Question("1+0", "1", "2", "3","100", 1);

        arr = new ArrayList<>();
        arr.add (q1);
        arr.add (q2);
        arr.add (q3);
        arr.add (q4);
        arr.add (q5);

    }

    public void initQuestions()
    {
        index = arr.size();
    }

    public Question getNextQuestion()
    {
        // הפעולה מחזירה הפניה לשאלה הבאה
        int randomInt = (int) (Math.random() * index-1);

        qq= arr.get(randomInt);
        arr.remove(qq);
        index--;
        return qq;
    }

    public boolean isNotLastQuestion() {
        // הפעולה מחזירה אמת אם אנו בשאלה האחרונה
        return  (index>0);
        // if not at the end of the ArrayList
        // }
    }

    public int getIndex() {
        return num++;
    }
}
