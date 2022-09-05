def call(String name, String version, List<string> feature) {   
            build job: name, 
            parameters: [
            string(name: 'version', value: version),
            extendedChoice(name: 'feature', value: feature)
            ]
}
