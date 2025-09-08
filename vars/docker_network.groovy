def call (String name){
 sh "docker network create ${name}"
}
