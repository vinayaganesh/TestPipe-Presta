pipeline{

  agent any

  stages {

    stage("build") {

      steps {
          echo 'Build the application'
          bat 'mvn clean compile'
      }
      
     }
     stage("test") {

      steps {
          echo 'Test the application'
          bat 'mvn test'
      }
      
     }
     stage("deploy") {

      steps {
          echo 'Deploy the application'
          bat 'mvn run'
      }
      
     }
   }
   
}   
