import com.tothenew.utility

def call(Stinrg name){

    object = new  utility()

    pipeline{
      agent any
      stage('print'){
        steps{
            object.print(name)
        }
      }





    }
     
    
}
