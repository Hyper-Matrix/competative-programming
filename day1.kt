
import java.util.*
fun main(args:Array<String>) {
    print("Enter Number of elements in array")
    var sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var k = ""
    var v = ""
    var temp = ""
    if(a%2 != 0){
        print("should be a multiple of 2")
         }
    else{
          print("Enter the array")
          for(i in 0 ..  a){
          var   b = sc.nextLine()
            k = k + b;
          }
        print("Enter the number")
        var c = sc.nextInt()
        var q = c
        var l = k.split("").toMutableList()
        l.removeAt(0)
        l.removeAt(a)
        var f= l.toTypedArray()
            for(j in 0 until a){
                while(j<q){
                f[j] = f[j] + f[j+c]
                break
            }}
            for(o in 0 until a){
                while(o<q){
                v += f[o]
                break
            }}
        var p = v.split("").toMutableList()
        p.removeAt(0)
        p.removeAt(a)
        p.toTypedArray()
        for(r in 0 until a){
            print(p[r])
        } } }




