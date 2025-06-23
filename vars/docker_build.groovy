def call(string imagetag, string){
  sh "sudo docker build -t ${imagetag} . "
}
