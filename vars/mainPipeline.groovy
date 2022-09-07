def call(String... pipelines, String version, String feature){
    pipelines.each{
        /* pipelineCaller(
            name : ${it},
            version : String.valueOf(version),
            feature : String.valueOf(feature)
        ) */
        sh 'echo "${it}"'
    }
}