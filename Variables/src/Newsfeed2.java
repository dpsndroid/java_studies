public class Newsfeed2 {
  
  
    public Newsfeed2(){
      
    }
      
    // Create getTopics() below:
    public String[] getTopics(){
      String[] topics = {"Opinion", "Tech", "Science", "Health"};
      return topics;
    }
    
    public static void main(String[] args){
      Newsfeed2 sampleFeed = new Newsfeed2();
      String[] topics = sampleFeed.getTopics();
      System.out.println(topics);
    }
  }
  
