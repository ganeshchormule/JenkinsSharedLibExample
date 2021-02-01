def call() {
    node {
        git url: "https://github.com/ganeshchormule/JenkinsSharedLibExample"

        stage("Install") {
            bat "echo install"
        }

        stage("Test") {
            bat "echo test"
        }

        stage("Deploy") {
            
          bat "echo deploy"
            
        }
        
    }
}
