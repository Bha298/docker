pipelne{
    agent any
    stages{
        stage('Init') {
            steps{
                echo 'we are starting testing'
            }
        }
        stage('Build'){
            steps{
                echo 'Building sample Maven Project'
            }
        }
        stage('Deploy'){
            steps{
                echo 'Deploying in Stage area'
            }
        }
    }
}