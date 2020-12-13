// Credential Pass

def call(Id,branch ){
  git credentialsId: ${Id}, url: 'https://github.com/Pract-devops/WebTest', branch:${branch}
}
