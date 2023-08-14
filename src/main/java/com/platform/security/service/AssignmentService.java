package com.platform.security.service;

import com.platform.security.assigmentApp.domain.Assignment;
import com.platform.security.dao.AssignmentRepository;
import com.platform.security.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class AssignmentService {

    @Autowired
    private AssignmentRepository assignmentRepository;
    public Assignment save(User user) {
        Assignment assignment = new Assignment();
        assignment.setStatus("To be submitted");
        assignment.setUser(user);

        return assignmentRepository.save(assignment);
    }

    public Assignment save(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }
    public Set<Assignment> findByUser(User user){
         return assignmentRepository.findByUser(user);
    }

    public Optional<Assignment> getById(Long id){
         Optional<Assignment> assignment = assignmentRepository.findById(id);
         return assignment;
    }
}
