# unconference-quarkus-demo
Quarkus demo for Global unconference on the 23rd of Feb 2023

## Build and Run Native Image

1. Install graalvm using [sdkman](https://sdkman.io/)

```shell
# Run to see all available java versions, you want graalVM 
sdk list java

# Install graalVM for example for java 17 -> sdk install java 22.3.r17-grl
sdk install java <VERSION.rJAVA_VERSION-grl>
```
2. Use that version in the terminal

```shell
# Use graal version for example for java 17 -> sdk use java 22.3.r17-grl
sdk use java <VERSION.rJAVA_VERSION-grl>
```

3. Install native image support

```shell
gu install native-image
```

4. Build native image

```shell
# NOTE: Ensure you are in the correct directory 
# cd ~/<REPO_LOCATION>/unconference-quarkus-demo
quarkus build --native
```

5. Set up a postgres database through docker

```shell
docker run --name postgres-db -e POSTGRES_PASSWORD=docker -p 5432:5432 -d postgres
```

6. Run native image
```shell
# NOTE: Ensure you are in the correct directory 
# cd ~/<REPO_LOCATION>/unconference-quarkus-demo/build
./unconference-quarkus-demo-1.0-SNAPSHOT-runner
```