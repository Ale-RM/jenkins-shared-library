
#retrieve git and docker versions

def call() {
    node {
      sh '''
        git version
        docker version
      '''
    }
}
