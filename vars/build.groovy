def call() {
    steps {
        echo 'This is Building the code'

        sh 'docker compose build'
    }
}
