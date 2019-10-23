(ns investabit.api.public
  (:require [investabit.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1-public-price-change-symbol-get-with-http-info
  "Price Change
  "
  [symbol ]
  (check-required-params symbol)
  (call-api "/v1/public/price-change/{symbol}" :get
            {:path-params   {"symbol" symbol }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn v1-public-price-change-symbol-get
  "Price Change
  "
  [symbol ]
  (:data (v1-public-price-change-symbol-get-with-http-info symbol)))

(defn v1-public-price-current-symbol-get-with-http-info
  "Price Current
  "
  [symbol ]
  (check-required-params symbol)
  (call-api "/v1/public/price-current/{symbol}" :get
            {:path-params   {"symbol" symbol }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn v1-public-price-current-symbol-get
  "Price Current
  "
  [symbol ]
  (:data (v1-public-price-current-symbol-get-with-http-info symbol)))

(defn v1-public-price-history-symbol-period-interval-get-with-http-info
  "Price History
  "
  [symbol period interval ]
  (check-required-params symbol period interval)
  (call-api "/v1/public/price-history/{symbol}/{period}/{interval}" :get
            {:path-params   {"symbol" symbol "period" period "interval" interval }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn v1-public-price-history-symbol-period-interval-get
  "Price History
  "
  [symbol period interval ]
  (:data (v1-public-price-history-symbol-period-interval-get-with-http-info symbol period interval)))

(defn v1-public-symbols-get-with-http-info
  "Symbols
  "
  []
  (call-api "/v1/public/symbols" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn v1-public-symbols-get
  "Symbols
  "
  []
  (:data (v1-public-symbols-get-with-http-info)))

(defn v1-public-trend-symbol-get-with-http-info
  "Trend
  "
  [symbol ]
  (check-required-params symbol)
  (call-api "/v1/public/trend/{symbol}" :get
            {:path-params   {"symbol" symbol }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn v1-public-trend-symbol-get
  "Trend
  "
  [symbol ]
  (:data (v1-public-trend-symbol-get-with-http-info symbol)))

(defn v1-public-waiting-list-post-with-http-info
  "Waiting List
  Subscribe a user to the waiting list, `name` is not required."
  ([] (v1-public-waiting-list-post-with-http-info nil))
  ([{:keys [body ]}]
   (call-api "/v1/public/waiting-list" :post
             {:path-params   {}
              :header-params {}
              :query-params  {}
              :form-params   {}
              :body-param    body
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn v1-public-waiting-list-post
  "Waiting List
  Subscribe a user to the waiting list, `name` is not required."
  ([] (v1-public-waiting-list-post nil))
  ([optional-params]
   (:data (v1-public-waiting-list-post-with-http-info optional-params))))

