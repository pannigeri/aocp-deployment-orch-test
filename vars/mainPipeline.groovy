def call(String version, String feature, String... pipelines){
    pipelines.each(){
        pipeline{
            agent any
            stages{
                stage("Building pipeline "){
                    pipelineCaller(
                        name : "${it}",
                        version : String.valueOf(version),
                        feature : String.valueOf(feature)
                    )
                }
            }
        }
        
        
    }
}