pipeline {
    agent any

    parameters {
        booleanParam(name: 'INSTALL_POSTGRES', defaultValue: false, description: 'Installl PostgreSQL?')
        booleanParam(name: 'INSTALL_LIFERAY', defaultValue: false, description: 'Install Liferay?')
    }

    stages {
        stage('PostgreSQL installation stage') {
            when {
                expression { return params.INSTALL_POSTGRES }
            }
            steps {
                echo "Starting installation PostgreSQL..."
                // Здесь может быть команда для запуска ansible playbook, например:
                // sh "ansible-playbook install_postgres.yml -i inventory.ini"
                echo "PostgreSQL installed succesfully."
            }
        }
        
        stage('Liferay installation stage') {
            when {
                expression { return params.INSTALL_LIFERAY }
            }
            steps {
                echo "Starting installation Liferay..."
                // Здесь может быть команда для запуска ansible playbook, например:  
                // sh "ansible-playbook install_liferay.yml -i inventory.ini"
                echo "Liferay succesfully installed."
            }
        }
    }
    
    post {
        always {
            echo "Pipeline completed."
        }
    }
}
