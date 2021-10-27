pipeline {
    agent none
    tools {
        maven 'Maven 3.6.3'
        jdk 'JDK8'
    }
    stages {
        stage("API tests") {
                parallel {
                    stage("Batch 1") {
                        agent {
                            label "Automation"
                        }
                        steps {
                            checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [[$class: 'CloneOption', timeout: 120]], userRemoteConfigs: [[url: 'git@github.com:viktormelnychuk/rpserenity.git']]])
                            sh "mvn clean verify -U -Denvironment=alpha -Drp.mode=DEFAULT -Drp.launch=tpgi-tests_alpha -Dserenity.batch.count=2 -Dserenity.batch.number=1 -f pom.xml"
                        }
                    }
                    stage("Batch 2") {
                        agent {
                            label "Automation"
                        }
                        steps {
                            checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [[$class: 'CloneOption', timeout: 120]], userRemoteConfigs: [[url: 'git@github.com:viktormelnychuk/rpserenity.git']]])
                            sh "mvn clean verify -U -Denvironment=alpha -Drp.mode=DEFAULT -Drp.launch=tpgi-tests_alpha -Dserenity.batch.count=2 -Dserenity.batch.number=2 -f pom.xml"
                        }
                    }
                }
        }
    }
}