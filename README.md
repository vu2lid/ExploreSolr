# ExploreSolr
Clone - import and run this as a Maven project.

A simple Spring Boot Application that demonstrates two endpoints.

1. **/solr/hello-world** - accepts two string parameters and returns them as an array with some additional string.
2. **/solr/search** - searches the configured (in application.properties) Solr instance using a query that
   accepts field and value as parameters and returns the search result.

Something like http://localhost:8080/swagger-ui.html should bring up Swagger UI interface, which can be used
for testing the endpoints and exploring the documentation.

Self documenting, with unambiguous names, minimum exposure of data for the desired results,
compartmentalization of concerns, with each endpoint targeting a specific concern.

### Notes - REST
#### HTTP Verbs
1. GET - retrieves a resource specified in the URL and returns it
2. POST - creates the resource specified by the URL and the body
3. PUT - replace the existing resource specifiedd by the URL or creates it
4. PATCH - partially updates a resource specified by the URL
5. DELETE - deletes a resource specified by the URL

---
#### References
1. [Spring Guides](https://spring.io/guides)
2. [Solr Tutorial](https://solr.apache.org/guide/8_11/solr-tutorial.html)
