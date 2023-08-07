pipeline {
    agent any
    environment {
        registry = "docker.io"
        registryCredential = 'dockerhub'
        dockerImage = 'mohakbajaj/CI-CD-Lab-1'
    }
    stages {
        stage('Building and Push the Docker Image'){
            steps{
                script {
                    docker.withRegistry("https://registry-1.docker.io/v2/", registryCredential ) {
                        def customImage = docker.build dockerImage
                        customImage.push()
                    }
                }
            }
        }
    }
}