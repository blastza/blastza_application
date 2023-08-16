package com.platform.security.assigmentApp.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@Getter
public enum AssignmentEnum {
    ASSIGNMENT_1(1, "HTML Assignment"),
    ASSIGNMENT_2(2, "User Login"),
    ASSIGNMENT_3(3,"Java Assignment"),
    ASSIGNMENT_4(4,"Spring Security"),
    ASSIGNMENT_5(5,"Spring MVC"),
    ASSIGNMENT_6(6,"Restful Services"),
    ASSIGNMENT_7(7,"PostgreSQL"),
    ASSIGNMENT_8(8,"Kubernetes"),
    ASSIGNMENT_9(9,"Custom Array List"),
    ASSIGNMENT_10(10,"Gateway System"),
    ASSIGNMENT_11(11,"Load balancing"),
    ASSIGNMENT_12(12,"Online Bank"),
    ASSIGNMENT_13(13,"Hibernate"),
    ASSIGNMENT_14(14,"Multi-threading");

    private Integer assignmentNum;
    private String assignmentName;

    AssignmentEnum(int assignmentNum, String assignmentName){
        this.assignmentNum = assignmentNum;
        this.assignmentName = assignmentName;
    }
}
