pipeline {
    agent any

    parameters {
        booleanParam(name: 'TRIGGER_POSTGRES_PIPELINE', defaultValue: false, description: 'run pipeline?')
    }

    stages {
        stage('pipeline lets goo') {
            when {
                expression { return params.TRIGGER_POSTGRES_PIPELINE }
            }
            steps {
                build job: 'lecture_ci_cd/pipeline'
            }
        }
    }

    post {
        always {
            echo "Master-pipeline ended"
        }
    }
}
