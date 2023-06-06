pipeline {
    agent any
    
    stages {
        stage('Obtener código fuente') {
            steps {
                git 'https://github.com/MatiAragoZ/Ejemplo1.git'
            }
        }
        
        stage('Compilar') {
            steps {
                sh 'mvn compile'
            }
        }
        
        stage('Pruebas') {
            steps {
                sh 'mvn test'
            }
        }
        
        stage('Empaquetar') {
            steps {
                sh 'mvn package'
            }
        }
        
        stage('Desplegar') {
            steps {
                // Aquí puedes incluir los comandos o scripts necesarios para desplegar tu aplicación
            }
        }
    }
}



