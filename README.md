# Usage


1. publish projectA locally

    ```
    cd projectA
    sbt publishLocal
    ```

2. test artefact is not in the test config classpath

    ```
    cd projectB
    sbt 'show test:dependencyClasspath'                                                                                  :(
    ...
    [info] Fetched artifacts of projectb
    [info] * Attributed(/home/claudio/sandbox/sample308/projectB/target/scala-2.10/classes)
    [info] * Attributed(/home/claudio/.sbt/boot/scala-2.10.6/lib/scala-library.jar)
    [info] * Attributed(/home/claudio/.ivy2/local/example/a_2.10/1.0/jars/a_2.10.jar)
                                                                          ^^^^^^^^^^
    ```

3. disable coursier-sbt in projectB

4. Re-try step 3

    ```
    cd projectB
    sbt 'show test:dependencyClasspath' 
    ...
    [info] * Attributed(/home/claudio/sandbox/sample308/projectB/target/scala-2.10/classes)
    [info] * Attributed(/home/claudio/.sbt/boot/scala-2.10.6/lib/scala-library.jar)
    [info] * Attributed(/home/claudio/.ivy2/local/example/a_2.10/1.0/jars/a_2.10.jar)
    [info] * Attributed(/home/claudio/.ivy2/local/example/a_2.10/1.0/jars/a_2.10-tests.jar)
                                                                          ^^^^^^^^^^^^^^^^
    ```
