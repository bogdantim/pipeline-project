pipeline {
  agent any
  
    stages{
      stage('Checkout'){
      steps{
        echo 'begin checkout'
        git branch: 'master',
            url: 'https://github.com/bogdantim/sample-maven-project.git'
        echo 'finished checkout'
        }
     }
      stage('Build'){
      steps{
        bat label: '', script: 'mvn clean install && exit %%ERRORLEVEL%%'
        }
     }
   }
}