def call(Map mychk_config) {


   checkout([
                    $class: 'GitSCM',
                    branches: [[name: mychk_config.branch ]],
                    doGenerateSubmoduleConfigurations: false,
                    extensions: [],
                    userRemoteConfigs: [[
                        url: mychk_config.myurl,
                        credentialsId: mychk_config.credentials
                    ]]
                ])

}

// def mychk_config = { 
//     branch: 'main' , 
//     giturl: 'https://github.com/vikasaroor/delete.git' ,
//     gitcred: '' 
// }