import com.mongodb.MongoClient;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

import java.util.*;

public class MongoCloud {
	
	//MongoCloud: https://cloud.mongodb.com/v2/5942ac1bc0c6e31e2daa7552#clusters
	
	public static void main(String[] args){
		System.out.println("HelloWorld");
		MongoClientURI uri = new MongoClientURI("mongodb://evany:Citrix12345+@cluster0-shard-00-00-bhetz.mongodb.net:27017,cluster0-shard-00-01-bhetz.mongodb.net:27017,cluster0-shard-00-02-bhetz.mongodb.net:27017/admin?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin");

		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("test");
		
		System.out.println(database.getName());
	}
}



