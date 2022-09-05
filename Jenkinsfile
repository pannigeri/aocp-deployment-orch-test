 @Library('jenkins-shared-lib@main') _

pipeline{
    agent any

    parameters {
    choice choices: ['1.1', '1.3', '1.5', '2.1'], description: 'The version', name: 'version'
    extendedChoice defaultValue: '', description: 'Features as input to the deployment-orchestration-pipeline', descriptionPropertyValue: '', multiSelectDelimiter: ',', name: 'feature', quoteValue: false, saveJSONParameterToFile: false, type: 'PT_CHECKBOX', value: 'feature 1, feature 2, feature 3', visibleItemCount: 5
}

stages{
    stage("Access CosmoDB"){
        steps{
            sh "echo 'R/W to database using Jenkins shared library CosmoDB facade'"
        }
    }
    stage("Checking Parameters"){
        steps{
            sh "echo '${params.version}, ${params.feature}'"
        }
    }
    stage("Calling Terraform Orchestration pipeline"){
        steps{
            pipelineCaller(
                name = "terraform-orchestration",
                version = String.valueOf(params.version),
                feature = String.valueOf(params.feature)
            )
            // script{
            // build job: 'terraform-orchestration', parameters: [string(name: 'version', value: String.valueOf(params.version)), extendedChoice(name: 'feature', value: String.valueOf(params.feature))]
            //    }
        }
    }
    stage("Calling OCP Configuration pipeline"){
        steps{
            script{
            build job: 'ocp-configuration', parameters: [string(name: 'version', value: String.valueOf(params.version)), extendedChoice(name: 'feature', value: String.valueOf(params.feature))]
        }
        }
    }
    stage("Calling Application Configuration pipeline"){
        steps{
            script{
            build job: 'application-configuration', parameters: [string(name: 'version', value: String.valueOf(params.version)), extendedChoice(name: 'feature', value: String.valueOf(params.feature))]
        }
        }
    }
}
}


