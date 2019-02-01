# spring-boot-rest-design

Sample application for creating RESTful web services in Spring Boot with Exception handling. 

The goal is to not to build the response in the service layer but with the help of exception handling.

  1. Service layer only possessing business logic which is perfect for testing it.
  2. Errors are handled in a common class not in actual controller or service that it's called from.
  2. Allows sending two different response Type Success and Error corresponding to the result.
