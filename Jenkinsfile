pipeline {
    agent any

    tools {
        maven 'Maven 3.8.5'  // Make sure this name matches your configured Maven in Jenkins
        jdk 'Java 11'        // Same here for Java
    }

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

        stage('Publish Report') {
            steps {
                echo 'You can add Extent or Allure report publishing here if needed.'
            }
        }
    }
}
