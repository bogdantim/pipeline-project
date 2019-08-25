node {
    external = load 'Pipeline.groovy'
    stage('Checkout'){
        echo 'begin checkout'
        git branch: 'master',
            url: 'https://github.com/bogdantim/sample-maven-project.git'
        echo 'finished checkout'
   }
   stage('Build'){
        new Pipeline().build()
   }
}