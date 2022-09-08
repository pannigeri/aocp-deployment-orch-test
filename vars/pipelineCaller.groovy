def call(Map config) { 
            script{
            runs << build(job:config.name, parameters: [
            string(name: 'version', value: config.version),
            extendedChoice(name: 'feature', value: config.feature)
            ], propagate: false)
            echo "${runs}"
            }             
}
