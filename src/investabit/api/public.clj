(ns investabit.api.public
  (:require [investabit.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1-public-current-symbol-get-with-http-info
  "Current
  "
  [symbol ]
  (check-required-params symbol)
  (call-api "/v1/public/current/{symbol}" :get
            {:path-params   {"symbol" symbol }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn v1-public-current-symbol-get
  "Current
  "
  [symbol ]
  (:data (v1-public-current-symbol-get-with-http-info symbol)))

(defn v1-public-price-history-symbol-get-with-http-info
  "Price History
  "
  [symbol ]
  (check-required-params symbol)
  (call-api "/v1/public/price-history/{symbol}" :get
            {:path-params   {"symbol" symbol }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn v1-public-price-history-symbol-get
  "Price History
  "
  [symbol ]
  (:data (v1-public-price-history-symbol-get-with-http-info symbol)))

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

