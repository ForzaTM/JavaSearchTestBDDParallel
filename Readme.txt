In order to run project from command line use following commands:
1. Run all test runners - mvn clean test
2. Run one by one runner - mvn clean test -Dtest=TestRunner
3. Run parallel runner - mvn clean test -Dtest=ParallelTestRunner

Note: Parallel test runners thread count could be configured manually using the following command (simply change Ddataproviderthreadcount value):
mvn clean test -Dtest=ParallelTestRunner -Ddataproviderthreadcount=6