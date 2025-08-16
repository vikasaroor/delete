@Library('my-sharedlib') _ 

pipeline { 
    
    agent any 


    stages{ 
        stage('checkout'){ 
            steps{ 
                script{
              def mychk_config = [ 
                  branch: 'main', 
                  giturl: 'https://github.com/vikasaroor/delete.git' ,
                  gitcred: 'github-cred' 
              ]
                gitcheckout(mychk_config)

            }
            }


        }
    }


}