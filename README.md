# About

Small repro for coursier/coursier#419.

# Instructions

1. Run `sbt publishLocal` in `projectA`.

2. Run `sbt checkCSV` in `projectB` (ensure to disable coursier in your global plugins).

expected output:

```
files: /home/claudio/.ivy2/local/test/a_2.10/1.0.0/infos/test_2.10.csv
```

3. Run `sbt checkCSV` in `projectC`

expected output:

```
files:
```
