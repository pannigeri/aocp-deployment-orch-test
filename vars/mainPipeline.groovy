def call(String[] pipelines){
    pipelines.each(){
        /* pipelineCaller(
            name : ${it},
            version : String.valueOf(version),
            feature : String.valueOf(feature)
        ) */
        sh 'echo "${it}"'
    }
}