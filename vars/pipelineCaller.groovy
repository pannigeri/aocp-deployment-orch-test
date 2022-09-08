def call(Map config) { 
            script{
            def runs = build job:config.name, parameters: [
            string(name: 'version', value: config.version),
            extendedChoice(name: 'feature', value: config.feature)
            ]
            env.runs = runs
            echo "${runs}"
            }             
}
