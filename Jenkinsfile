pipeline {
  agent any
  stages {
    stage('First') {
      steps {
        sh '''
          set -x
          echo "starting at $(date)"
          sleep 5
          ls -la
        '''
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
