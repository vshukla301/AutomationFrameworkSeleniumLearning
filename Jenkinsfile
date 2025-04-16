pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/vshukla301/AutomationFrameworkSeleniumLearning.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
