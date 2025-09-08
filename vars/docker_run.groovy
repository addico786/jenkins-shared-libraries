def call (String port, String name, String network_name, String image_name){
  sh "docker run -d -p ${port} --name ${name} --network ${network_name} ${image_name} "
}
