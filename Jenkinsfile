pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        pwd()
      }
    }
    stage('Stage2') {
      steps {
        echo 'Welcome to Stage2'
        emailext(subject: 'Welcome Subject', body: 'Welcome Body', from: 'myjenkins@aaa.com', to: 'vinoddum1@gmail.com')
        input 'Welcome Input'
      }
    }
  }
}