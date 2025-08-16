def call(Map gitcred) {

    echo "URL is  {gitcred.myurl}"
    echo "branch is  {gitcred.branch}"
    checkout scmGit(branches: [[name: gitcred.branch]], 
    extensions: [], 
    userRemoteConfigs: [[credentialsId: gitcred.credentials, url: gitcred.myurl]])

}
// def gitcred {
//     branch = main
//     credentials = github-my
//     myurl = https://github.com/vikasaroor/delete.git

// }


// def call(Map gitcred) 
//     checkout scmGit(branches: [[name: '*/gitcred.branch']], 
//     extensions: [], 
//     userRemoteConfigs: [[credentialsId: 'github-my', url: 'https://github.com/vikasaroor/delete.git']])