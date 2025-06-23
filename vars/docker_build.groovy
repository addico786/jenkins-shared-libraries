def call (String imagetag){
  echo "this is building the code"
  sh "sudo  docker build -t ${imagetag} ."
  echo "the code has been built sucessfully"
}
