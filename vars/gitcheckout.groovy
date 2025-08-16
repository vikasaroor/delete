def call(Map mychk_config) {


   checkout([
                    $class: 'GitSCM',
                    branches: [[name: ]],
                    doGenerateSubmoduleConfigurations: false,
                    extensions: [],
                    userRemoteConfigs: [[
                        url: gitcred.myurl,
                        credentialsId: gitcred.credentials
                    ]]
                ])

}

def mychk_config = { 
    branch: 'main' , 
    giturl: 'https://github.com/vikasaroor/delete.git' ,
    gitcred: '' 
}