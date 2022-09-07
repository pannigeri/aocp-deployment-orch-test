def call(Map pipelineParams) {

    pipeline {
        agent any
        stages {
            stage('checkout git') {
            steps {
                git branch: pipelineParams.branch, credentialsId: 'avaya-automation github user', url: pipelineParams.scmUrl
            }
        }            
        }
        
    }
}