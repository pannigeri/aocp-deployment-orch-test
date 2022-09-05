def call(body) {   
            def params= [:]
            body.resolveStrategy = Closure.DELEGATE_FIRST
            body.delegate = params
            body()
            build job: params.name, 
            parameters: [
            string(name: 'version', value: params.version),
            extendedChoice(name: 'feature', value: params.feature)
            ]
}
