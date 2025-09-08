def call (String imagename, String imagetag, String path){
  echo "this is building the code"
  sh "sudo  docker build -t ${imagename}:${imagetag} ${path}"
  echo "the code has been built sucessfully"
}
