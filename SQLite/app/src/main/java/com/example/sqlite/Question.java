package com.example.sqlite;

/**
 * 在答题界面创建Question 的对象，通过传来的参数(选择1、选择2、选择3、选择4)，调用Dao类中的方法，
 * 返回一个Question类的对象，通过getXxx方法获取从数据库中拿到的数据
 */
public class Question {
    private int id ;
    private String question;
    private String A;
    private String B;
    private String C;
    private String D;
    private String anwser;

    public Question(){
        super();
    }

    public Question(int id, String question, String a, String b, String c, String d, String anwser) {
        this.id = id;
        this.question = question;
        A = a;
        B = b;
        C = c;
        D = d;
        this.anwser = anwser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    public String getAnwser() {
        return anwser;
    }

    public void setAnwser(String anwser) {
        this.anwser = anwser;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                ", anwser='" + anwser + '\'' +
                '}';
    }
}
