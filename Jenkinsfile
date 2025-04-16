pipeline {
    agent any

    stage('Checkout') {
        steps {
            git branch: 'main', url: 'https://github.com/vshukla301/AutomationFrameworkSeleniumLearning.git'
        }
    }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
