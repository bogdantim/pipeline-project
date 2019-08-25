node {
    stage('Checkout'){
        echo 'begin checkout'
        checkout([$class: '`GitSCM`', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/bogdantim/sample-maven-project.git']]])
        echo 'finished checkout'
   }
}