Import and run as a Maven project.

Simple Spring Boot Application that demonstrates two endpoints.

1) accepts two string parameters and returns them as an array with some additional string.
2) searches the configured (in application.properties) Solr instance using a query that
   accepts field and value as parameters and returns the search result.

http://localhost:8080/swagger-ui.html should bring up Swagger UI interface, which can be used
for testing the endpoints and exploring the documentation.

Self documenting, with unambiguous names, minimum exposure of data for the desired results,
compartmentalization of concerns, with each endpoint targeting a specific concern.
