# Documentation for API Hospital Universitário

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost:8095*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *ActuatorApi* | [**beans**](Apis/ActuatorApi.md#beans) | **GET** /actuator/beans | Actuator web endpoint 'beans' |
*ActuatorApi* | [**caches**](Apis/ActuatorApi.md#caches) | **GET** /actuator/caches | Actuator web endpoint 'caches' |
*ActuatorApi* | [**caches2**](Apis/ActuatorApi.md#caches2) | **DELETE** /actuator/caches | Actuator web endpoint 'caches' |
*ActuatorApi* | [**cachesCache**](Apis/ActuatorApi.md#cachescache) | **GET** /actuator/caches/{cache} | Actuator web endpoint 'caches-cache' |
*ActuatorApi* | [**cachesCache2**](Apis/ActuatorApi.md#cachescache2) | **DELETE** /actuator/caches/{cache} | Actuator web endpoint 'caches-cache' |
*ActuatorApi* | [**conditions**](Apis/ActuatorApi.md#conditions) | **GET** /actuator/conditions | Actuator web endpoint 'conditions' |
*ActuatorApi* | [**configprops**](Apis/ActuatorApi.md#configprops) | **GET** /actuator/configprops | Actuator web endpoint 'configprops' |
*ActuatorApi* | [**configpropsPrefix**](Apis/ActuatorApi.md#configpropsprefix) | **GET** /actuator/configprops/{prefix} | Actuator web endpoint 'configprops-prefix' |
*ActuatorApi* | [**env**](Apis/ActuatorApi.md#env) | **GET** /actuator/env | Actuator web endpoint 'env' |
*ActuatorApi* | [**envToMatch**](Apis/ActuatorApi.md#envtomatch) | **GET** /actuator/env/{toMatch} | Actuator web endpoint 'env-toMatch' |
*ActuatorApi* | [**health**](Apis/ActuatorApi.md#health) | **GET** /actuator/health | Actuator web endpoint 'health' |
*ActuatorApi* | [**healthPath**](Apis/ActuatorApi.md#healthpath) | **GET** /actuator/health/** | Actuator web endpoint 'health-path' |
*ActuatorApi* | [**heapdump**](Apis/ActuatorApi.md#heapdump) | **GET** /actuator/heapdump | Actuator web endpoint 'heapdump' |
*ActuatorApi* | [**info**](Apis/ActuatorApi.md#info) | **GET** /actuator/info | Actuator web endpoint 'info' |
*ActuatorApi* | [**links**](Apis/ActuatorApi.md#links) | **GET** /actuator | Actuator root web endpoint |
*ActuatorApi* | [**loggers**](Apis/ActuatorApi.md#loggers) | **GET** /actuator/loggers | Actuator web endpoint 'loggers' |
*ActuatorApi* | [**loggersName**](Apis/ActuatorApi.md#loggersname) | **GET** /actuator/loggers/{name} | Actuator web endpoint 'loggers-name' |
*ActuatorApi* | [**loggersName2**](Apis/ActuatorApi.md#loggersname2) | **POST** /actuator/loggers/{name} | Actuator web endpoint 'loggers-name' |
*ActuatorApi* | [**mappings**](Apis/ActuatorApi.md#mappings) | **GET** /actuator/mappings | Actuator web endpoint 'mappings' |
*ActuatorApi* | [**metrics**](Apis/ActuatorApi.md#metrics) | **GET** /actuator/metrics | Actuator web endpoint 'metrics' |
*ActuatorApi* | [**metricsRequiredMetricName**](Apis/ActuatorApi.md#metricsrequiredmetricname) | **GET** /actuator/metrics/{requiredMetricName} | Actuator web endpoint 'metrics-requiredMetricName' |
*ActuatorApi* | [**scheduledtasks**](Apis/ActuatorApi.md#scheduledtasks) | **GET** /actuator/scheduledtasks | Actuator web endpoint 'scheduledtasks' |
*ActuatorApi* | [**threaddump**](Apis/ActuatorApi.md#threaddump) | **GET** /actuator/threaddump | Actuator web endpoint 'threaddump' |
| *PacienteControllerApi* | [**create1**](Apis/PacienteControllerApi.md#create1) | **POST** /paciente |  |
| *SessaoControllerApi* | [**create**](Apis/SessaoControllerApi.md#create) | **POST** /sessao |  |
*SessaoControllerApi* | [**delete**](Apis/SessaoControllerApi.md#delete) | **DELETE** /sessao/{id} |  |
*SessaoControllerApi* | [**findAll**](Apis/SessaoControllerApi.md#findall) | **GET** /sessao |  |
*SessaoControllerApi* | [**findByTratamentoId**](Apis/SessaoControllerApi.md#findbytratamentoid) | **GET** /sessao/tratamentoId/tratamento |  |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Link](./Models/Link.md)
 - [PacienteCreationDto](./Models/PacienteCreationDto.md)
 - [PacienteDto](./Models/PacienteDto.md)
 - [SessaoCreationDto](./Models/SessaoCreationDto.md)
 - [SessaoDto](./Models/SessaoDto.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
