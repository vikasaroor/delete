@Library('my_checkout') _

pipeline {

agent any
stages{

stage('checkout') {
    steps{

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