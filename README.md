# Integration Assignment

## Build a small integration (import an exam)
- Create fetch exam endpoint in AssignmentController to import, validate and map exam data returned from the data endpoint.
- Also create the data endpoint (in DataEndPointController) to return the exam data.
- The validation process should be able to give a precise error message if the json is malformed or missing keys.
- The data from the endpoints should correspond to the two json models given below.


### Assignment project
#### Request:
##### url: localhost:8080/integration/assignment/exam/{examId}
```json
{
  "examId": "string",
  "title": "string",
  "startDate": "int",
  "endDate": "int",
  "participants": [
    {
      "participantId": "int",
      "firstName": "string",
      "lastName": "string"
    }
  ],
  "assessor": [
    {
      "assessorId": "int",
      "firstName": "string",
      "lastName": "string"
    }
  ]
}
```
#### startDate and endDate
 - timestamps

### Data endpoint
#### Request 
##### url: localhost:8090/data/endpoint/exam/{examId}
```json
{
  "examId": "string",
  "title": "string",
  "startDate": "string",
  "endDate": "string",
  "users": [
    {
      "id": "int",
      "firstName": "string",
      "lastName": "string",
      "type": "int"
    }
  ]
}
```

#### type
- 0 => participant
- 1 => assessor

#### date
- yyyy-MM-dd