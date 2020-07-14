properties([ disableConcurrentBuilds(), pipelineTriggers([githubPush()]) ])

node('master') {
    deleteDir()
    checkout scm

    stage('test'){
        def TestProject = load "mydef.groovy"
          TestProject.Deploy()
    }
step([$class: 'WsCleanup'])
}
