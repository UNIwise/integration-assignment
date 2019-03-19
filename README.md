# Integration Assignment

## Build a small integration (import an exam)
- Assignment project endpoint should handle calls with type
  -  valid, invalid, missing, and error
- call external data endpoint for examdata
- validate data
- map data
- send data or error code describing the error as response

### Assignment project
#### Request:
##### url: localhost:8080/integration/assingment/exam/{type}
```json
{
  "examId": string,
  "title": string,
  "startDate": int,
  "endDate": int,
  "participants": [
    {
      "participantId": int,
      "firstName": string,
      "lastName": string,
    }
  ],
  "assessor": [
    {
      "assessorId": int,
      "firstName": string,
      "lastName": string,
    }
  ]
}
```
startDate and endDate are timestamps

### Data endpoint
#### Request 
##### url: localhost:8090/data/endpoint/exam/json/{type}
```json
{
  "examId": string,
  "title": string,
  "startDate": string,
  "endDate": string,
  "users": [
    {
      "id": int,
      "firstName": string,
      "lastName": string,
      "type": int
    }
  ]
}
```

#### types
- 0 => participant
- 1 => assessor