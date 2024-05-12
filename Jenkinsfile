pipeline {
    agent any
    
    stages {
        stage("Checkout") {
            steps {
                git 'https://github.com/denisputnov/vsu-java-practice.git'
            }
        }
        stage("Build") {
            steps {
                sh 'mvn clean package'
            }
        }
        stage("Tests") {
            when {
                branch 'feature/*'
            }
            steps {
                sh 'mvn test'
            }
        }
        stage("Checkstyle") {
            when {
                branch 'develop'
            }
            steps {
                sh 'mvn checkstyle:check'
            }
        }
        stage("Report") {
            when {
                branch 'feature/*'
            }
            steps {
                junit testResults: '**/surefire-reports/*.xml'
                jacoco()
            }
        }
        stage("Install") {
            steps {
                sh 'mvn install'
            }
        }
        stage("Publish") {
            steps {
                sh 'cp app/target/app-1.0.0-jar-with-dependencies.jar /Users/denisputnov/prog/vsu-java-practice-publication && echo "Published"'
            }
        }
    }
}
