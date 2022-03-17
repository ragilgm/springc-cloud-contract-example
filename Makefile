clean-logs:
	@rm -f -r ./logs

generate-test-sources: clean-logs
	@mvn clean generate-test-sources

install: clean-logs
	@mvn clean install

dependency-check:
	./mvnw dependency-check:check -DfailBuildOnCVSS=6