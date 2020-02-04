(ns crypto-weather.api.public
  (:require [crypto-weather.core :refer [call-api check-required-params with-collection-format]])
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

(defn v1-public-summary-get-with-http-info
  "Summary
  "
  []
  (call-api "/v1/public/summary" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn v1-public-summary-get
  "Summary
  "
  []
  (:data (v1-public-summary-get-with-http-info)))

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
  The trend response contains a collection of forecasts for different intervals with the following attributes.

+ `time_start` start time of the period the forecast is applicable for

+ `time_end` end time of the period the forecast is applicable for

+ `interval` interval in hours that the forecast is applicable for

+ `weighted_price` forecasted weighted price during the period

+ `change_pct` percent change in price for forecasted weighted_price relative to current price

+ `change_usd` dollar change in price for forecasted weighted_price relative to current price"
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
  The trend response contains a collection of forecasts for different intervals with the following attributes.

+ `time_start` start time of the period the forecast is applicable for

+ `time_end` end time of the period the forecast is applicable for

+ `interval` interval in hours that the forecast is applicable for

+ `weighted_price` forecasted weighted price during the period

+ `change_pct` percent change in price for forecasted weighted_price relative to current price

+ `change_usd` dollar change in price for forecasted weighted_price relative to current price"
  [symbol ]
  (:data (v1-public-trend-symbol-get-with-http-info symbol)))

