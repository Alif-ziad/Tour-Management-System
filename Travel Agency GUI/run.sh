#!/bin/bash

cd "$(dirname "$0")"
find . -name "*.class" -type f -delete
javac Start.java
java Start