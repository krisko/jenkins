pipelineJob("${SEED_PROJECT}-${SEED_BRANCH}-build".replaceAll('/','-')) {
   description "Building the ${SEED_BRANCH} branch."
   //parameters {
   //   stringParam('SEED_BRANCH', 'main', 'BRANCH to build')
   //}
   triggers {
      scm('')
   }
   logRotator {
      numToKeep(5)
   }
   definition {
      cpsScm {
         scm {
            git {
               remote {
                  url "https://github.com/${SEED_PROJECT}"
               }
               //branches("${SEED_BRANCH}")
               extensions { }
            }
         }
         scriptPath('Jenkinsfile')
      }
   }
   queue "${SEED_PROJECT}-${SEED_BRANCH}-build".replaceAll('/','-')
}
