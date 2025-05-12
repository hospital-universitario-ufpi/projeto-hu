# SessaoControllerApi

All URIs are relative to *http://localhost:8095*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**create**](SessaoControllerApi.md#create) | **POST** /sessao |  |
| [**delete**](SessaoControllerApi.md#delete) | **DELETE** /sessao/{id} |  |
| [**findAll**](SessaoControllerApi.md#findAll) | **GET** /sessao |  |
| [**findByTratamentoId**](SessaoControllerApi.md#findByTratamentoId) | **GET** /sessao/tratamentoId/tratamento |  |


<a name="create"></a>
# **create**
> SessaoDto create(SessaoCreationDto)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **SessaoCreationDto** | [**SessaoCreationDto**](../Models/SessaoCreationDto.md)|  | |

### Return type

[**SessaoDto**](../Models/SessaoDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*

<a name="delete"></a>
# **delete**
> delete(id)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**|  | [default to null] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

<a name="findAll"></a>
# **findAll**
> List findAll()



### Parameters
This endpoint does not need any parameter.

### Return type

[**List**](../Models/SessaoDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

<a name="findByTratamentoId"></a>
# **findByTratamentoId**
> List findByTratamentoId(arg0)



### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **arg0** | **Long**|  | [default to null] |

### Return type

[**List**](../Models/SessaoDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

