// Credential Pass

def call(id,branch ){
  git credentialsId:${id}, url: 'https://github.com/Pract-devops/WebTest', branch:${branch}
}
