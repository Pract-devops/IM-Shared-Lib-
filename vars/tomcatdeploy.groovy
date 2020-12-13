// de call(tomcatip,tomcatusr,finalWarName ){
 sh "mv target/myweb*.war target/${finalWarName}.war"
                sshagent(credentials: ['slave-one'], ignoreMissing: true) {
                         // some block
                sh "scp -o StrictHostKeyChecking=no target/${finalWarName}.war ${tomcatusr}@${tomcatip}:/opt/tomcat8/webapps"
                sh """
                        ssh ${tomcatusr}@${tomcatip} /opt/tomcat8/bin/shutdown.sh
                        ssh ${tomcatusr}@${tomcatip} /opt/tomcat8/bin/startup.sh
                    """
                    }
}
