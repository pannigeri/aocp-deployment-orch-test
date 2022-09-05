def call(String name, String version, String feature) {   
            build job: name, 
            parameters: [
            string(name: 'version', value: version),
            extendedChoice(name: 'feature', value: feature)
            ]
}
