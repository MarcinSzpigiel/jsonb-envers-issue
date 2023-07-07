# Introduction

This is an example of the issue with envers persisting jsonb data in the audit table using @JdbcTypeCode(SqlTypes.JSON)
annotation.

There are two entities, one with `@Audited` annotation and one without. The one without works fine, the one with does not.

## How to run it

### start posgresql in docker

```
docker-compose -d up
```

### run tests

```
./gradlew clean check --info
```




