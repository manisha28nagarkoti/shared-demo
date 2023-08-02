import com.tothenew.utility

def call(Stinrg name){

    object = new  utility()

    pipeline{
      stage('print'){
        script{
            object.print(name)
        }
      }





    }
     
    
}
