# ActuatorApi

All URIs are relative to *http://localhost:8095*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**beans**](ActuatorApi.md#beans) | **GET** /actuator/beans | Actuator web endpoint &#39;beans&#39; |
| [**caches**](ActuatorApi.md#caches) | **GET** /actuator/caches | Actuator web endpoint &#39;caches&#39; |
| [**caches2**](ActuatorApi.md#caches2) | **DELETE** /actuator/caches | Actuator web endpoint &#39;caches&#39; |
| [**cachesCache**](ActuatorApi.md#cachesCache) | **GET** /actuator/caches/{cache} | Actuator web endpoint &#39;caches-cache&#39; |
| [**cachesCache2**](ActuatorApi.md#cachesCache2) | **DELETE** /actuator/caches/{cache} | Actuator web endpoint &#39;caches-cache&#39; |
| [**conditions**](ActuatorApi.md#conditions) | **GET** /actuator/conditions | Actuator web endpoint &#39;conditions&#39; |
| [**configprops**](ActuatorApi.md#configprops) | **GET** /actuator/configprops | Actuator web endpoint &#39;configprops&#39; |
| [**configpropsPrefix**](ActuatorApi.md#configpropsPrefix) | **GET** /actuator/configprops/{prefix} | Actuator web endpoint &#39;configprops-prefix&#39; |
| [**env**](ActuatorApi.md#env) | **GET** /actuator/env | Actuator web endpoint &#39;env&#39; |
| [**envToMatch**](ActuatorApi.md#envToMatch) | **GET** /actuator/env/{toMatch} | Actuator web endpoint &#39;env-toMatch&#39; |
| [**health**](ActuatorApi.md#health) | **GET** /actuator/health | Actuator web endpoint &#39;health&#39; |
| [**healthPath**](ActuatorApi.md#healthPath) | **GET** /actuator/health/** | Actuator web endpoint &#39;health-path&#39; |
| [**heapdump**](ActuatorApi.md#heapdump) | **GET** /actuator/heapdump | Actuator web endpoint &#39;heapdump&#39; |
| [**info**](ActuatorApi.md#info) | **GET** /actuator/info | Actuator web endpoint &#39;info&#39; |
| [**links**](ActuatorApi.md#links) | **GET** /actuator | Actuator root web endpoint |
| [**loggers**](ActuatorApi.md#loggers) | **GET** /actuator/loggers | Actuator web endpoint &#39;loggers&#39; |
| [**loggersName**](ActuatorApi.md#loggersName) | **GET** /actuator/loggers/{name} | Actuator web endpoint &#39;loggers-name&#39; |
| [**loggersName2**](ActuatorApi.md#loggersName2) | **POST** /actuator/loggers/{name} | Actuator web endpoint &#39;loggers-name&#39; |
| [**mappings**](ActuatorApi.md#mappings) | **GET** /actuator/mappings | Actuator web endpoint &#39;mappings&#39; |
| [**metrics**](ActuatorApi.md#metrics) | **GET** /actuator/metrics | Actuator web endpoint &#39;metrics&#39; |
| [**metricsRequiredMetricName**](ActuatorApi.md#metricsRequiredMetricName) | **GET** /actuator/metrics/{requiredMetricName} | Actuator web endpoint &#39;metrics-requiredMetricName&#39; |
| [**scheduledtasks**](ActuatorApi.md#scheduledtasks) | **GET** /actuator/scheduledtasks | Actuator web endpoint &#39;scheduledtasks&#39; |
| [**threaddump**](ActuatorApi.md#threaddump) | **GET** /actuator/threaddump | Actuator web endpoint &#39;threaddump&#39; |


<a name="beans"></a>
# **beans**
> Object beans()

Actuator web endpoint &#39;beans&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="caches"></a>
# **caches**
> Object caches()

Actuator web endpoint &#39;caches&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="caches2"></a>
# **caches2**
> Object caches2()

Actuator web endpoint &#39;caches&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

<a name="cachesCache"></a>
# **cachesCache**
> Object cachesCache(cache)

Actuator web endpoint &#39;caches-cache&#39;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cache** | **String**|  | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="cachesCache2"></a>
# **cachesCache2**
> Object cachesCache2(cache)

Actuator web endpoint &#39;caches-cache&#39;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cache** | **String**|  | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="conditions"></a>
# **conditions**
> Object conditions()

Actuator web endpoint &#39;conditions&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="configprops"></a>
# **configprops**
> Object configprops()

Actuator web endpoint &#39;configprops&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="configpropsPrefix"></a>
# **configpropsPrefix**
> Object configpropsPrefix(prefix)

Actuator web endpoint &#39;configprops-prefix&#39;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **prefix** | **String**|  | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="env"></a>
# **env**
> Object env()

Actuator web endpoint &#39;env&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="envToMatch"></a>
# **envToMatch**
> Object envToMatch(toMatch)

Actuator web endpoint &#39;env-toMatch&#39;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **toMatch** | **String**|  | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="health"></a>
# **health**
> Object health()

Actuator web endpoint &#39;health&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="healthPath"></a>
# **healthPath**
> Object healthPath()

Actuator web endpoint &#39;health-path&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="heapdump"></a>
# **heapdump**
> Object heapdump()

Actuator web endpoint &#39;heapdump&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream

<a name="info"></a>
# **info**
> Object info()

Actuator web endpoint &#39;info&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="links"></a>
# **links**
> Map links()

Actuator root web endpoint

### Parameters
This endpoint does not need any parameter.

### Return type

[**Map**](../Models/map.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="loggers"></a>
# **loggers**
> Object loggers()

Actuator web endpoint &#39;loggers&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="loggersName"></a>
# **loggersName**
> Object loggersName(name)

Actuator web endpoint &#39;loggers-name&#39;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="loggersName2"></a>
# **loggersName2**
> Object loggersName2(name, body)

Actuator web endpoint &#39;loggers-name&#39;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | [default to null] |
| **body** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="mappings"></a>
# **mappings**
> Object mappings()

Actuator web endpoint &#39;mappings&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="metrics"></a>
# **metrics**
> Object metrics()

Actuator web endpoint &#39;metrics&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="metricsRequiredMetricName"></a>
# **metricsRequiredMetricName**
> Object metricsRequiredMetricName(requiredMetricName)

Actuator web endpoint &#39;metrics-requiredMetricName&#39;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requiredMetricName** | **String**|  | [default to null] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="scheduledtasks"></a>
# **scheduledtasks**
> Object scheduledtasks()

Actuator web endpoint &#39;scheduledtasks&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

<a name="threaddump"></a>
# **threaddump**
> Object threaddump()

Actuator web endpoint &#39;threaddump&#39;

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain;charset=UTF-8, application/vnd.spring-boot.actuator.v3+json, application/vnd.spring-boot.actuator.v2+json, application/json

