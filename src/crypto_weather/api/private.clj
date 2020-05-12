(ns crypto-weather.api.private
  (:require [crypto-weather.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn v1-private-accuracy-symbol-interval-period-get-with-http-info
  "Accuracy
  The accuracy response contains the following attributes.

+ `rmse` Root Mean Square Error

+ `mae` Mean Absolute error

+ `r2` R Squared

+ `ci` Confidence Interval lower and upper error bounds"
  ([symbol interval period ] (v1-private-accuracy-symbol-interval-period-get-with-http-info symbol interval period nil))
  ([symbol interval period {:keys [cookie x-csrf ]}]
   (check-required-params symbol interval period)
   (call-api "/v1/private/accuracy/{symbol}/{interval}/{period}" :get
             {:path-params   {"symbol" symbol "interval" interval "period" period }
              :header-params {"Cookie" cookie "X-csrf" x-csrf }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2"]})))

(defn v1-private-accuracy-symbol-interval-period-get
  "Accuracy
  The accuracy response contains the following attributes.

+ `rmse` Root Mean Square Error

+ `mae` Mean Absolute error

+ `r2` R Squared

+ `ci` Confidence Interval lower and upper error bounds"
  ([symbol interval period ] (v1-private-accuracy-symbol-interval-period-get symbol interval period nil))
  ([symbol interval period optional-params]
   (:data (v1-private-accuracy-symbol-interval-period-get-with-http-info symbol interval period optional-params))))

(defn v1-private-forecast-symbol-interval-get-with-http-info
  "Forecast
  The forecast response contains a sequence of forecasts at the specified intervals, with the following attributes.

+ `time_start` start time of the period the forecast is applicable for

+ `time_end` end time of the period the forecast is applicable for

+ `low` forecasted high during the period

+ `high` forecasted low during the period

+ `weighted_price` forecasted weighted price during the period

+ `change_pct` percent change in price for forecasted weighted_price relative to current price

+ `change_usd` dollar change in price for forecasted weighted_price relative to current price"
  ([symbol interval ] (v1-private-forecast-symbol-interval-get-with-http-info symbol interval nil))
  ([symbol interval {:keys [cookie x-csrf ]}]
   (check-required-params symbol interval)
   (call-api "/v1/private/forecast/{symbol}/{interval}" :get
             {:path-params   {"symbol" symbol "interval" interval }
              :header-params {"Cookie" cookie "X-csrf" x-csrf }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2"]})))

(defn v1-private-forecast-symbol-interval-get
  "Forecast
  The forecast response contains a sequence of forecasts at the specified intervals, with the following attributes.

+ `time_start` start time of the period the forecast is applicable for

+ `time_end` end time of the period the forecast is applicable for

+ `low` forecasted high during the period

+ `high` forecasted low during the period

+ `weighted_price` forecasted weighted price during the period

+ `change_pct` percent change in price for forecasted weighted_price relative to current price

+ `change_usd` dollar change in price for forecasted weighted_price relative to current price"
  ([symbol interval ] (v1-private-forecast-symbol-interval-get symbol interval nil))
  ([symbol interval optional-params]
   (:data (v1-private-forecast-symbol-interval-get-with-http-info symbol interval optional-params))))

(defn v1-private-forecast-time-symbol-interval-period-get-with-http-info
  "Forecast Time
  "
  ([symbol interval period ] (v1-private-forecast-time-symbol-interval-period-get-with-http-info symbol interval period nil))
  ([symbol interval period {:keys [cookie x-csrf ]}]
   (check-required-params symbol interval period)
   (call-api "/v1/private/forecast-time/{symbol}/{interval}/{period}" :get
             {:path-params   {"symbol" symbol "interval" interval "period" period }
              :header-params {"Cookie" cookie "X-csrf" x-csrf }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2"]})))

(defn v1-private-forecast-time-symbol-interval-period-get
  "Forecast Time
  "
  ([symbol interval period ] (v1-private-forecast-time-symbol-interval-period-get symbol interval period nil))
  ([symbol interval period optional-params]
   (:data (v1-private-forecast-time-symbol-interval-period-get-with-http-info symbol interval period optional-params))))

(defn v1-private-trend-symbol-get-with-http-info
  "Trend
  The trend response contains a collection of forecasts for different intervals with the following attributes.

+ `time_start` start time of the period the forecast is applicable for

+ `time_end` end time of the period the forecast is applicable for

+ `interval` interval in hours that the forecast is applicable for

+ `weighted_price` forecasted weighted price during the period

+ `change_pct` percent change in price for forecasted weighted_price relative to current price

+ `change_usd` dollar change in price for forecasted weighted_price relative to current price"
  ([symbol ] (v1-private-trend-symbol-get-with-http-info symbol nil))
  ([symbol {:keys [cookie x-csrf ]}]
   (check-required-params symbol)
   (call-api "/v1/private/trend/{symbol}" :get
             {:path-params   {"symbol" symbol }
              :header-params {"Cookie" cookie "X-csrf" x-csrf }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2"]})))

(defn v1-private-trend-symbol-get
  "Trend
  The trend response contains a collection of forecasts for different intervals with the following attributes.

+ `time_start` start time of the period the forecast is applicable for

+ `time_end` end time of the period the forecast is applicable for

+ `interval` interval in hours that the forecast is applicable for

+ `weighted_price` forecasted weighted price during the period

+ `change_pct` percent change in price for forecasted weighted_price relative to current price

+ `change_usd` dollar change in price for forecasted weighted_price relative to current price"
  ([symbol ] (v1-private-trend-symbol-get symbol nil))
  ([symbol optional-params]
   (:data (v1-private-trend-symbol-get-with-http-info symbol optional-params))))

(defn v1-private-trend-tabular-get-with-http-info
  "Trend Tabular
  The trend tabular response contains a collection of forecasts for all supported cryptocurrencies at different intervals with the following attributes.

+ `time_start` start time of the period the forecast is applicable for

+ `time_end` end time of the period the forecast is applicable for

+ `interval` interval in hours that the forecast is applicable for

+ `weighted_price` forecasted weighted price during the period

+ `change_pct` percent change in price for forecasted weighted_price relative to current price

+ `change_usd` dollar change in price for forecasted weighted_price relative to current price"
  ([] (v1-private-trend-tabular-get-with-http-info nil))
  ([{:keys [cookie x-csrf ]}]
   (call-api "/v1/private/trend-tabular" :get
             {:path-params   {}
              :header-params {"Cookie" cookie "X-csrf" x-csrf }
              :query-params  {}
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    ["oauth2"]})))

(defn v1-private-trend-tabular-get
  "Trend Tabular
  The trend tabular response contains a collection of forecasts for all supported cryptocurrencies at different intervals with the following attributes.

+ `time_start` start time of the period the forecast is applicable for

+ `time_end` end time of the period the forecast is applicable for

+ `interval` interval in hours that the forecast is applicable for

+ `weighted_price` forecasted weighted price during the period

+ `change_pct` percent change in price for forecasted weighted_price relative to current price

+ `change_usd` dollar change in price for forecasted weighted_price relative to current price"
  ([] (v1-private-trend-tabular-get nil))
  ([optional-params]
   (:data (v1-private-trend-tabular-get-with-http-info optional-params))))

