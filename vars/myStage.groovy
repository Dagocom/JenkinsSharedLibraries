def call(String newStage){
    if ("${newStage}" == "test&build")
        {
            sh 'mvn clean package'
        }
    else if ("${newStage}" == "codeQuality")
        {
            sh 'mvn sonar:sonar'
        }
    else if ("${newStage}" == "uploadArtifacts")
        {
            sh 'mvn deploy'
        }
}
