pipeline{
    agent any

    parameters {
  choice choices: ['1.1', '1.3', '1.5', '2.1'], description: 'The version', name: 'version'
  extendedChoice defaultValue: '', description: 'Features as input to the deployment-orchestration-pipeline', descriptionPropertyValue: '', multiSelectDelimiter: ',', name: 'feature', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_CHECKBOX', value: 'feature 1, feature 2, feature 3', visibleItemCount: 5
}

stages{
    stage("Checking Parameters"){
        steps{
            sh "echo '${params.version}, ${params.feature}'"
        }
    }
    stage("Calling Terraform Orchestration pipeline"){
        steps{
            build job: 'terraform-orchestration', parameters: [string(name: 'version', value: ${params.version} ), extendedChoice(name: 'feature', value: ${params.feature})]
        }
    }
    stage("Calling OCP Configuration pipeline"){
        steps{
            build job: 'ocp-configuration', parameters: [string(name: 'version', value: ${params.version}), extendedChoice(name: 'feature', value: ${params.feature})]
        }
    }
    stage("Calling Application Configuration pipeline"){
        steps{
            build job: 'application-configuration', parameters: [string(name: 'version', value: ${params.version}), extendedChoice(name: 'feature', value: ${params.feature})]
        }
    }
}
}


