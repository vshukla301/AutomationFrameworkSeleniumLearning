pipeline {
    agent any

    environment {
        // Define any environment variables you need here
        MAVEN_HOME = 'C:\\Program Files\\Maven'  // Path to your Maven installation
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from the Git repository
                git url: 'https://github.com/vshukla301/AutomationFrameworkSeleniumLearning.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Run Maven to build the project
                    bat '"${MAVEN_HOME}\\bin\\mvn" clean install'  // Windows batch command for Maven build
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // Run tests (e.g., Selenium tests)
                    bat '"${MAVEN_HOME}\\bin\\mvn" test'  // Windows batch command for running tests
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Optional deploy step if needed
                    // You can use `bat` to run deployment scripts or commands here
                    echo 'Deploying build...'
                    bat 'echo Deploying to environment'
                }
            }
        }
    }

    post {
        success {
            // Notify or take actions when the build is successful
            echo 'Build and test successful!'
        }
        failure {
            // Notify or take actions when the build fails
            echo 'Build or test failed!'
        }
        always {
            // Always executed after the pipeline ends, regardless of success or failure
            echo 'Pipeline execution finished.'
        }
    }
}
