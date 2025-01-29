pipeline {
    agent { docker { image 'ruby:3.4.1-alpine3.21' } }
    stages {
        stage('build') {
            steps {
                sh 'ruby --version'
            }
        }
    }
}
