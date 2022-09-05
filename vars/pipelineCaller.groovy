def call(name, version, feature) {
    pipeline {
      agent any
      stages {
        stage('Building stage') {
          steps {
            build job: name, 
            parameters: [
            string(name: 'version', value: version),
            extendedChoice(name: 'feature', value: feature)
            ]
          }
        }
      }
    }
}
