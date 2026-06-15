pipeline{
    agent any
    stages {
        stage ('Checkout') {
            steps {git'https://github.com/repo/app'}
        }
        stage ('Build') {
            steps { sh 'mvn clean install'}
        }
        stage ('Test') {
            Steps { sh 'mvn test'}
        }
    }
    post {
        always {junit'target/surefire-reports/*.xml'
        }
    }
