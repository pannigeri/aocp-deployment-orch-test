def call(Map config) {   
            build job:config.name, 
            parameters: [
            string(name: 'version', value: config.version),
            extendedChoice(name: 'feature', value: config.feature)
            ]
}
