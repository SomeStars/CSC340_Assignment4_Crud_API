# CRUD API

The REST API performs CRUD operations on Animal objects as described below.

## Installation
- Get the project
    - clone
  
        `git clone https://github.com/SomeStars/CSC340_Assignment4_Crud_API.git`
    - download zip.
- Open the project in IntelliJ.
- [`/src/main/resources/application.properties`](https://github.com/SomeStars/CSC340_Assignment4_Crud_API/blob/main/f24-crud-api-main/src/main/resources/application.properties). file  is the configuration for the MySQL database on your localhost.
  - the database name is on the `datasource.url` property between the last `/` and the `?`. In this case the database name is `mydatabase`.
  - You MUST have the database up and running before running the project! 
    - Open your XAMPP Control Panel.
    - Start the Apache server.
    - Start MySQL.
    - Click on MySQL "Admin" to open up the DBMS.
    - Ensure the database that you need is available.
- Build and run the main class. You should see 2 new tables created in the aforementioned database.

## API Endpoints
Use POSTMAN to try the following endpoints:

## Get list of Animals

### Request

    `GET /animals/all`

    `http://localhost:8080/animals/all`

   
### Response

     [
     {
     "animalId": 1, "name": "sample1",
     "scientific_name": "Bird", 
     "species": "example1",
     "habitat": "examplehabitat1",
     "description": "exDesc1"
     }
   
     {
     "animalId": 2,
     "name": "sample2",
     "scientific_name": "Canine",
     "species": "example2", 
     "habitat": examplehabitat2",
     "description": "exDesc2"
     }, 
     ]

## Get a specific Animal

### Request

`GET /animals/{animalId}`

`http://localhost:8080/animals/1`

### Response

      {
     "animalId": 1, "name": "sample1",
     "scientific_name": "Bird", 
     "species": "example1",
     "habitat": "examplehabitat1",
     "description": "exDesc1"
     }

     
## Create a new Animal

### Request

    `POST /animals/new`
    
    `http://localhost:8080/animals/new` --data 
      "
      {
     "animalId": 3, "name": "Cow",
     "scientific_name": "Bovine", 
     "species": "example1",
     "habitat": "Fields",
     "description": "exDesc1"
      }
      "
   ### Response
     [
     {
     "animalId": 1, "name": "sample1",
     "scientific_name": "Bird", 
     "species": "example1",
     "habitat": "examplehabitat1",
     "description": "exDesc1"
     },
   
     {
     "animalId": 2,
     "name": "sample2",
     "scientific_name": "Canine",
     "species": "example2", 
     "habitat": examplehabitat2",
     "description": "exDesc2"
     }, 
     
     {
     "animalId": 3, "name": "Cow",
     "scientific_name": "Bovine", 
     "species": "example1",
     "habitat": "Fields",
     "description": "exDesc1"
      }
   ]

## Get Animals by species

### Request

    `GET /animals?species=Bovine`

    `http://localhost:8080/animals?species=Bovine`

   
### Response

     [
     {
     "animalId": 3, "name": "Cow",
     "scientific_name": "Bovine", 
     "species": "example1",
     "habitat": "Fields",
     "description": "exDesc1"
      }
     ]

## Get Animals by string in name

### Request

    `GET /animals?string=ow`

    `http://localhost:8080/animals?string=ow`

   
### Response
   
     [
     {
     "animalId": 3, "name": "Cow",
     "scientific_name": "Bovine", 
     "species": "example1",
     "habitat": "Fields",
     "description": "exDesc1"
      }
     ]

## Update an existing Animal

### Request

    `PUT /animals/update/{animalId}`
    
    `http://localhost:8080/animals/update/1` --data 
    '{
     "name": "BlueJay",
     "scientific_name": "Cyanocitta cristata", 
     "species": "Corvidae",
     "habitat": "Temperate Forests",
     "description": "A bird that is blue"
     }'

   ### Response
   
    {
     "name": "BlueJay",
     "scientific_name": "Cyanocitta cristata", 
     "species": "Corvidae",
     "habitat": "Temperate Forests",
     "description": "A bird that is blue"
     }


## Delete an existing Animal

### Request

    `DELETE /animals/delete/{animalId}`
    
    `http://localhost:8080/animals/delete/1`

   ### Response
   
     [
   
    {
     "animalId": 2,
     "name": "sample2",
     "scientific_name": "Canine",
     "species": "example2", 
     "habitat": examplehabitat2",
     "description": "exDesc2"
     }, 
     
     {
     "animalId": 3, "name": "Cow",
     "scientific_name": "Bovine", 
     "species": "example1",
     "habitat": "Fields",
     "description": "exDesc1"
      }
    ]
