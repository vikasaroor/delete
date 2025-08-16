@Library('my-sharedlib') _ 

pipelIne { 
    
    agent any 


    stages{ 
        stage('checkout'){ 
            steps{ 
              def mychk_config = { 
                  branch: 'main', 
                  giturl: 'https://github.com/vikasaroor/delete.git' ,
                  gitcred: 'github-cred' 
                }
                gitcheckout(my_config)

            }


        }
    }


}