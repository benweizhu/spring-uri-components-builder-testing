# spring-uri-components-builder-testing

Should use uri instead of toUriString() when pass to restTemplate cause toUriString() will encode the url, and restTemplate will encode again.

```
public DataDto findDetailsById(String id, String number) {
    URI uri = getUriComponentsBuilder(id, number).build().toUri();
    return restTemplate.getForObject(uri, DataDto.class);
}
```
