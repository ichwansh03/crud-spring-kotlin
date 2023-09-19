# API Spec

## Create Merchant
Request :
* Method : POST
* Endpoint : /pos/merchant
* Header :
    - Content-Type : application/json
    - Accept : application/json
* Body :
```json
{
  "id" : "integer, auto-increment",
  "name" : "string",
  "address" : "string",
  "latitude" : "string",
  "longitude" : "string",
  "admin" : "string"
}
```
* Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : 
  {
    "id" : "integer, auto-increment",
    "name" : "string",
    "address" : "string",
    "latitude" : "string",
    "longitude" : "string",
    "admin" : "string"
  }
}
```

## Get Merchant
Request :
* Method : GET
* Endpoint : /pos/merchant
* Header :
    - Content-Type : application/json
    - Accept : application/json

* Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : 
  {
    "id" : "integer, auto-increment",
    "name" : "string",
    "address" : "string",
    "latitude" : "string",
    "longitude" : "string",
    "admin" : "string"
  }
}
```

## Update Merchant
Request :
* Method : PUT
* Endpoint : /pos/merchant/{id}
* Header :
    - Content-Type : application/json
    - Accept : application/json
* Body :
```json
{
  "name" : "string",
  "address" : "string",
  "latitude" : "string",
  "longitude" : "string",
  "admin" : "string"
}
```
* Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : 
  {
    "id" : "integer, auto-increment",
    "name" : "string",
    "address" : "string",
    "latitude" : "string",
    "longitude" : "string",
    "admin" : "string"
  }
}
```

## List Merchant
Request :
* Method : GET
* Endpoint : /pos/merchant
* Header :
    - Accept : application/json
* Query Param :
    - size : number
    - page : number
* Response :
```json
{
  "code" : "number",
  "status" : "string",
  "data" : [
    {
      "id" : "integer, auto-increment",
      "name" : "string",
      "address" : "string",
      "latitude" : "string",
      "longitude" : "string",
      "admin" : "string"
    },
    {
      "id" : "integer, auto-increment",
      "name" : "string",
      "address" : "string",
      "latitude" : "string",
      "longitude" : "string",
      "admin" : "string"
    }
  ]
}
```

## Delete Merchant
Request :
* Method : DELETE
* Endpoint : /pos/merchant
* Header :
    - Accept : application/json

* Response :
```json
{
  "code" : "number",
  "status" : "string"
}
```

