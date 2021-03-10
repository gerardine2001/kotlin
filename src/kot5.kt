fun main() {
    text()
    sentence("gerardine",20)
    country()
    My_name("Gerardine")
    My_name("louise")


}
fun text(){
    var akira="Akirachix"
    print(akira[0])
    print(akira[2])
    println(akira[3])
}
fun sentence(x:String,y:Int){
    println("Hi,My name is $x and i am $y years old")
}
fun country(){
    var loc="Rwanda"
    println(loc.length)

}
fun My_name(name:String){
    if(name=="Gerardine"){
        println("That's me")
    }
    else{
        println("i don't know who that is")
    }
    }