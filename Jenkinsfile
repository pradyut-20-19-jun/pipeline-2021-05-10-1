pipeline {
    agent any 
    tools {
        maven 'maven_3_5_0' 
    }
    stages {
        stage('Build') { 
            steps {
		    sh 'date'
                withMaven(maven: 'maven_3_5_0') {
					sh 'mvn clean compile'
				}
            }
        }
        stage('Test') { 
            steps {
                withMaven(maven: 'maven_3_5_0') {
					sh 'mvn test'
				}
            }
        }
        stage('Deploy') { 
            steps {
                withMaven(maven: 'maven_3_5_0') {
					sh 'mvn tomcat8:deploy'
				}
            }
        }
    }
}
