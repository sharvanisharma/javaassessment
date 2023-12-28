class Youarenoteligible extends Exception{
    Youarenoteligible(String s)
    {
        System.out.println(s);
    }
}

    public class finallythrowthrows {
        void vote(int age) 
        throws Youarenoteligible
         {
            if (age<18)
        {
            throw new Youarenoteligible("Age not sufficient");
        }
        else 
        {
            System.out.println("You can vote");
        }
        }
        public static void main(String[] args){
            finallythrowthrows obj = new finallythrowthrows();
            try{
                obj.vote(16);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            finally{
                System.out.println("Thank you");
             
            }

            


            
        }
    }
        
       