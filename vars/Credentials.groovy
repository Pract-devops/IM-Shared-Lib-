// Credential Pass

def call(Id,branch ){
  git credentialsId:${id}, url: 'https://github.com/Pract-devops/WebTest', branch:${branch}
}
