package com.demo.pojo;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    public static List<Instructor> getAll(){
        Instructor inst1 = new Instructor("Mike",11,"Soft Developer","M",true, Arrays.asList("Java","C++","Python"));
        Instructor inst2 = new Instructor("Jenny",5,"Engineer","F",false, Arrays.asList("Multithreaded","CICD","Unit Testing"));
        Instructor inst3 = new Instructor("Gene",6,"Manager","M",false, Arrays.asList("C++","C","React Native"));
        Instructor inst4 = new Instructor("Anthony",15,"Senior Developer","M",true, Arrays.asList("Java","Angular","React Native"));
        Instructor inst5 = new Instructor("Harshal",5,"Principle Engineer","M",false, Arrays.asList("Java","Multithreaded","React"));

        List<Instructor> list = Arrays.asList(inst1,inst2,inst3,inst4,inst5);
        return list;
    }
}
