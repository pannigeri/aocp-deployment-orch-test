def call(name, version, feature) {   
            build job: name, 
            parameters: [
            string(name: 'version', value: version),
            extendedChoice(name: 'feature', value: feature)
            ]
}
