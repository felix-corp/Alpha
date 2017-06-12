import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import java.util.*;

public class MongoDBJDBC{
   public static void main( String args[] ){
      try{   
         // To connect to mongodb server
         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
         
		@SuppressWarnings("deprecation")
		DB db = mongoClient.getDB( "test" );
         
         System.out.println(db.getName());
         
         @SuppressWarnings("deprecation")
		List<String> dbs = mongoClient.getDatabaseNames();
         for(String d : dbs){
         	System.out.println(d);
         }
         
         //DBCollection table = db.getCollection("user");
         //System.out.println("table" + table);
         
         Set<String> tables = db.getCollectionNames();
         for(String coll : tables){
        		System.out.println(coll);
        	}
         
         DBCollection table = db.getCollection("user");
         BasicDBObject document = new BasicDBObject();
         document.put("name", "mkyong");
         document.put("age", 30);
         document.put("createdDate", new Date());
         table.insert(document);
      }catch(Exception e){
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      }
   }
}