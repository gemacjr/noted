# LevelsBeyondNoted

Clone repository:

$git clone git@github.com:gemacjr/LevelsBeyondNoted.git

$cd LevelsBeyondNoted

$mvn spring-boot:run

POST:

$curl -i -H "Content-Type: application/json" -X POST -d '{"body" : "Pick up milk!"}' http://localhost:8000/api/notes


GET Existing Note 

$curl -i -H "Content-Type: application/json" -X GET http://localhost:8000/api/notes/0

GET All Notes

$curl -i -H "Content-Type: application/json" -X GET http://localhost:8000/api/notes# LevelsBeyondNoted
