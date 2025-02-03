library 'jsl'
DIRECTORY_NAME = "DEPLOY"

node {
    stage("Prepare workspace") {
        // sh "rm -rf ./" + DIRECTORY_NAME
        // deleteFile(DIRECTORY_NAME)
        deleteFolder(DIRECTORY_NAME)
    }
    stage("Build") {
        sh "echo > test_test.txt 'Hello World'"
    }
    stage("Test"){
        println("DEBUG1: run command ''")
        sh("cat test_test.txt | grep World")
    }
    stage("Deploy"){
        sh """
        mkdir ./${DIRECTORY_NAME}
        mv test_test.txt ./${DIRECTORY_NAME}/test_test.txt
        """
    }
    stage("Post prepare workspace") {
        // sh "rm -rf ./${DIRECTORY_NAME}"
        // deleteFile(DIRECTORY_NAME)
        deleteFolder(DIRECTORY_NAME)
    }
}


def deleteFile(path){
    sh "rm -rf ./" + path
}
