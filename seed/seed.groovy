job("${SEED_PROJECT}-${SEED_BRANCH}-build".replaceAll('/','-')) {
   description "Building the ${SEED_BRANCH} branch."
   parameters {
      stringParam('SEED_BRANCH', 'main', 'BRANCH to build')
   }
   scm {
      git {
         remote {
             url 'https://github.com/${SEED_PROJECT}'
             branch '${SEED_BRANCH}'
         }
         extensions {
             wipeOutWorkspace()
             localBranch SEED_BRANCH
         }
      }
   }
   steps {
      shell 'echo "Look! Im building ${SEED_BRANCH}!"'
   }
   queue "${SEED_PROJECT}-${SEED_BRANCH}-build".replaceAll('/','-')
}
