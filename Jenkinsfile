pipeline {
  agent any
  stages {
    stage('First') {
      steps {
          echo "First step running..."
          sleep 5
      }
    }
    stage('Second') {
      steps {
        sh '''
          set -x
          echo "starting at $(date)"
          sleep 5
          ls -la
          cd
          pwd
        '''
      }
    }
  }
}
