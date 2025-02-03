def call(dirName){
    sh "rm -rf ./${dirName}"
    println("File deleted from JSL")
}
