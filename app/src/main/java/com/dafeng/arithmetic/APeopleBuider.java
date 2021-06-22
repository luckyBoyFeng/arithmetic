package com.dafeng.arithmetic;

public class APeopleBuider {
    private String name;
    private String age;

    public APeopleBuider(Buider buider) {
     this.age=buider.age;
     this.name=buider.name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static class Buider {
        private String name;
        private String age;

        public Buider name(String name) {
            this.name = name;
            return this;
        }

        public Buider age(String age) {
            this.age = age;
            return this;
        }

        public APeopleBuider buider(){
            return new APeopleBuider(this);
        }


    }
}