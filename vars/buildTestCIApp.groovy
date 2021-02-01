def call(Map config=[:], Closure body) {
    node {
        git url: "https://github.com/ganeshchormule/JenkinsSharedLibExample"

        stage("Install") {
            bat "echo install"
        }

        stage("Test") {
            bat "echo test"
        }

        stage("Deploy") {
            if (config.deploy) {
                bat "echo deploy"
            }
        }

        body()
    }
}
