pipeline{
    agent any

    parameters {
  choice choices: ['1.1', '1.3', '1.5', '2.1'], description: 'The version', name: 'version'
  extendedChoice defaultValue: '', description: 'Features as input to the deployment-orchestration-pipeline', descriptionPropertyValue: '', multiSelectDelimiter: ',', name: 'feature', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_MULTI_SELECT', value: 'feature 1, feature 2, feature 3', visibleItemCount: 5
}
stages{
    stage("Checking Parameters"){
        steps{
            sh "echo '${params.version}, ${params.feature}'"
        }
    }
}
}


