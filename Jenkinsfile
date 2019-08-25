node {
    stage('Checkout'){
        echo 'begin checkout'
        git branch: 'master',
            url: 'https://github.com/bogdantim/sample-maven-project.git'
        echo 'finished checkout'
   }
   stage('Build'){
        def libPath = "${env.WORKSPACE}" + "@script" + "/PipelineBuilder.groovy"
        def pipelineBuilder = load libPath
        pipelineBuilder.build()
   }
}