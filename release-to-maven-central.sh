#!/bin/bash -e
#
# Reference: https://dzone.com/articles/publish-your-artifacts-to-maven-central
#
# 1. Sets the new version in pom.xml as SNAPSHOT
#

# Without tests
# mvn clean deploy -Prelease -Dmaven.test.skip=true

# With tests
mvn clean deploy -Prelease -Dmaven.test.skip=true

#
# Perform the following commands after the release 
#
# git push tags
# git push origin master

