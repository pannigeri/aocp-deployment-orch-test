def call(String version, String feature, String... pipelines){
    pipelines.each(){
        pipelineCaller(
            name : "${it}",
            version : String.valueOf(version),
            feature : String.valueOf(feature)
        )
        
    }
}