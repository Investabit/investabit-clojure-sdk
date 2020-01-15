(defproject crypto-weather ""
  :description "The CryptoWeather API allows for access to all of the cryptocurrency data and market forecast services provided. There are two primary categories of routes, `public` and `private`, where `public` routes are accessible to the general public and do not require API authentication, and `private` routes, which require API authentication.

## General Overview

1. All API methods adhere to RESTful best practices as closely as possible. As such, all API calls will be made via the standard HTTP protocol using the GET/POST/PUT/DELETE request types.

2. Every request returns the status as a JSON response with the following:
    - success, true if it was successful
    - code, the http status code (also in the response header)
        - 200 if response is successful
        - 400 if bad request
        - 401 if authorization JWT is wrong or limit exceeded
        - 404 wrong route
        - 500 for any internal errors
    - status, the status of the request, default **success**
    - errors, an array of any relevant error details

3. For any requests that are not successful an error message is specified and returned as an array for the **errors** key in the JSON response.

4. All authentication uses JSON Web Tokens (JWT), which is set as the **Authorization** entry in the header, see the following for more details.
    - http://jwt.io
    - https://scotch.io/tutorials/the-anatomy-of-a-json-web-token

## Code Example

The following is a code example in Python, which demonstrates using the [Python Requests library](https://requests.readthedocs.io/en/master/) for both the `public` and `private` API routes.

```
import requests

HOST = \"https://api.cryptoweather.ai/v1\"

# Your API key (JWT)
API_KEY = \"<YOUR API KEY>\"

# Example public request, no API key required.
requests.get(\"{}/public/symbols\".format(HOST)).json()

# Get the current btc price using the public route
requests.get(\"{}/public/price-current/{}\".format(HOST, \"btc\")).json()


# Example private request, API key required. Get the btc hourly forecasts
headers = {\"Authorization\": \"Bearer {}\".format(API_KEY)}
requests.get(\"{}/private/forecast/{}/{}\".format(HOST, \"btc\", \"1h\"),
             headers=headers).json()
```"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [clj-http "3.6.0"]
                 [cheshire "5.5.0"]])
