pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Building..."'
            }
        }

        stage('Test') {
            steps {
                sh 'javac HelloWorld.java && java HelloWorld' 
            }
        }
    }
}