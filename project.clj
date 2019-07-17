(defproject investabit ""
  :description "The Investabit API allows for access to all of the public facing services provided, including market data and forecasts.

## General Overview

1. All API methods will be built to adhere to RESTful best practices as closely as possible. As such, all API calls will be made via the standard HTTP protocol using the GET/POST/PUT/DELETE request types.

2. Every request returns the status as a JSON response with the following
  - success, true if it was successful
  - code, the http status code (also in the response header)

        200 if response is successful

        400 if bad request

        401 if authorization JWT is wrong or limit exceeded

        404 wrong route

        500 for any internal errors

- status, the status of the request, default **success**

- errors, an array of any relevant error details

3. For any requests that are not successful an error message is specified and returned as an array for the **errors** key in the JSON response.

4. All authentication uses JSON Web Tokens (JWT), which is set as the **Authorization** entry in the header, see the following for more details.
    * http://jwt.io
    * https://scotch.io/tutorials/the-anatomy-of-a-json-web-token"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clj-http "3.6.0"]
                 [cheshire "5.5.0"]])
