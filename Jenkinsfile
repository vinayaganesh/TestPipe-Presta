pipeline{

  agent any

  stages {

    stage("build") {

      steps {
          echo 'Build the application'
        mvn install
      }
      
     }
     stage("test") {

      steps {
          echo 'Test the application'
        mvn test
      }
      
     }
     stage("deploy") {

      steps {
          echo 'Deploy the application'
        mvn run
      }
      
     }
   }
   
}   
