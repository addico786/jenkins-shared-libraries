def call (String imagename, String imagetag){
  echo "this is building the code"
  sh "sudo  docker build -t ${imagetag}:${imagetag} ."
  echo "the code has been built sucessfully"
}
