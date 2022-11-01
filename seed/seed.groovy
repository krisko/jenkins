job("${SEED_PROJECT}-${SEED_BRANCH}-build") {
   description "Building the ${BRANCH} branch."
   parameters {
      stringParam('BRANCH', 'main', 'BRANCH to build')
   }
   scm {
      git {
         remote {
             url PROJECT_SCM_URL
             branch '${BRANCH}'
         }
         extensions {
             wipeOutWorkspace()
             localBranch BRANCH
         }
      }
   }
   steps {
      shell 'echo "Look! Im building ${BRANCH}!"'
   }
   queue "${SEED_PROJECT}-${SEED_BRANCH}-build"
}
