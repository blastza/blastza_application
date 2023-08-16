package com.platform.security.dao;

import com.platform.security.assigmentApp.domain.Assignment;
import com.platform.security.assigmentApp.domain.AssignmentEnum;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Setter @Getter
public class AssignmentResponseDto {
    private Assignment assignment;
    //private List<AssignmentEnumDto> assignmentEnums = new ArrayList<>();
    private AssignmentEnum[] assignmentEnums = AssignmentEnum.values();

    public AssignmentResponseDto(Assignment assignment) {
        this.assignment = assignment;
/*        Arrays.stream(AssignmentEnum.values())
                .forEach(assignmentEnum -> {
                    assignmentEnums.add(new AssignmentEnumDto(assignmentEnum.getAssignmentName(), assignmentEnum.getAssignmentNum()));
                });*/
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public AssignmentEnum[] getAssignmentEnums() {
        return assignmentEnums;
    }

/*    public List<AssignmentEnumDto> getAssignmentEnums() {
        return assignmentEnums;
    }*/
}
