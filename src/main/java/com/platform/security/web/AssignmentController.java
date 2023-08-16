package com.platform.security.web;

import com.platform.security.assigmentApp.domain.Assignment;
import com.platform.security.dao.AssignmentResponseDto;
import com.platform.security.dao.User;
import com.platform.security.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/assignments")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("")
    public ResponseEntity<?> createAssignment(@AuthenticationPrincipal User user) {
        Assignment assignment = assignmentService.save(user);
        return ResponseEntity.ok(assignment);
    }

    @GetMapping("")
    public ResponseEntity<?> getAssignments(@AuthenticationPrincipal User user) {
        Set<Assignment> byUser = assignmentService.findByUser(user);
        return ResponseEntity.ok(byUser);
    }

    @GetMapping("{assignmentId}")
    public ResponseEntity<?> getAssignmentById(@PathVariable Long assignmentId, @AuthenticationPrincipal User user) {
        Optional<Assignment> byId = assignmentService.getById(assignmentId);

        AssignmentResponseDto response = new AssignmentResponseDto(byId.orElse(new Assignment()));

        return ResponseEntity.ok(response);
    }

    @PutMapping("{assignmentId}")
    public ResponseEntity<?> updateAssignmentById(@PathVariable Long assignmentId,
                                                  @RequestBody Assignment assignment,
                                                  @AuthenticationPrincipal User user) {
        Assignment result = assignmentService.save(assignment);
        return ResponseEntity.ok(result);
    }
}
