def call(String version, String feature, String... pipelines){
    pipelines.each(){
        
        stages{
            stage("Building pipeline "){
                steps{
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