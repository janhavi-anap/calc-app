pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // To run Maven on a Windows agent, use
                git branch: 'main',
                url: "https://github.com/janhavi-anap/calc-app.git"
            }
        }
        stage('Build') {
            steps {
                // To run Maven on a Windows agent, use
                bat 'mvn  compile'
            }
        }
        stage('Testing') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }
    post{
        success{
            echo 'Build completed successfully!'
        }
        failure{
            echo 'Build failed!'
        }
    }
}
