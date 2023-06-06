pipeline {
  agent any
  
  stages {
    stage('Obtener código fuente de Git') {
      steps {
        git ''
      }
    }
    
    stage('Realizar análisis del código') {
      steps {
        sh 'mvn clean compile'
        // Agrega aquí los pasos adicionales para análisis estático de código o pruebas de calidad
      }
    }
    
    stage('Realizar deployment') {
      steps {
        sh 'mvn clean package'
        // Agrega aquí los pasos adicionales para implementar/deploy el proyecto
      }
    }
    
    stage('Envío de mensajes') {
      steps {
        sh 'java -cp target/nombre-del-proyecto.jar com.example.MessageSender'
      }
    }
  }
}


