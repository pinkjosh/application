#!groovy

def Deploy() {
sh '''#!/bin/bash -xe
   echo "hello world!"
   '''.stripIndent()
}
return this;

