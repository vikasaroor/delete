@Library('my_checkout') _

pipeline {

agent any
stages{

stage('checkout') {
    steps{
        script {
        def gitcred = {
          branch = 'main'
          credentials = 'github-my'
          myurl = 'https://github.com/vikasaroor/delete.git'
         }
        
        gitcheckout(gitcred)
        }
    }

}

}
}