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
#### HTTP Verbs - Commonly used Request Methods
1. GET - retrieves a resource specified in the URI and returns it
2. POST - creates the resource specified by the URI and the body
3. PUT - replace the existing resource specifiedd by the URI or creates it
4. PATCH - partially updates a resource specified by the URI
5. DELETE - deletes a resource specified by the URI

These are conventions: https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods


---
#### References
1. [Spring Guides](https://spring.io/guides)
2. [Solr Tutorial](https://solr.apache.org/guide/8_11/solr-tutorial.html)
3. [IBM REST API Conventions](https://www.ibm.com/docs/en/urbancode-build/6.1.2?topic=reference-rest-api-conventions)
4. [SWAGGER API Design Best Practices](https://swagger.io/blog/api-design/api-design-best-practices/)
5. [Microsoft RESTful Web API Best Practices](https://docs.microsoft.com/en-us/azure/architecture/best-practices/api-design)
