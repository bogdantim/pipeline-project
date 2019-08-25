pipeline {
    stages{
      stage('Checkout'){
        echo 'begin checkout'
        git branch: 'master',
            url: 'https://github.com/bogdantim/sample-maven-project.git'
        echo 'finished checkout'
     }
      stage('Build'){
        bat label: '', script: 'mvn clean install && exit %%ERRORLEVEL%%'
     }
   }
}