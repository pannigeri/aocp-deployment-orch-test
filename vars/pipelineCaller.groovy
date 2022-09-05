def call(Map pipelineParams) {
    pipeline {
      agent any
      stages {
        stage('Building stage') {
          steps {
            build job: pipelineParams.name, 
            parameters: [
            string(name: 'version', value: pipelineParams.version),
            extendedChoice(name: 'feature', value: pipelineParams.feature)
            ]
          }
        }
      }
    }
}
