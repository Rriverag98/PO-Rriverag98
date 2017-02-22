/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

/**
 *
 * @author Rodrigo
 */
public class Alumno {
    private String name;
    private int id;
    private int age;
    private char gender;
    private String degree;

    public Alumno(String name,String career,int id,int age,char gender){
        this.name = name;
        this.degree = career;
        this.id = id;
        this. age = age;
        this.gender = gender;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the career
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }
    
    @Override
    public String toString(){
        return "Alumno[name= "+this.name+",age= "+this.age+",id= "+this.id+",gender= "+this.gender+",degree= "+this.degree+"]";
    }
    
}
