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
      cps {
         script(readFileFromWorkspace('Jenkinsfile'))
      }
   }
   queue "${SEED_PROJECT}-${SEED_BRANCH}-build".replaceAll('/','-')
}
