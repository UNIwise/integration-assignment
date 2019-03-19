package com.assignment.project;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/integration/assignment")
public class AssignmentController {

    @RequestMapping(path = "/exam/{type}", method = RequestMethod.GET)
    public ResponseEntity<ResponseModel> fetchExam(@PathVariable("type") String examId) {
        ResponseModel response = new ResponseModel();
        response.setInfo(examId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
