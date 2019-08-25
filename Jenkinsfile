node {
    stage('Checkout'){
        echo 'begin checkout'
        git branch: 'master',
            url: 'https://github.com/bogdantim/sample-maven-project.git'
        echo 'finished checkout'
   }
   stage('Build'){
        def pipelineBuilder = load 'PipelineBuilder.groovy'
        pipelineBuilder.build()
   }
}