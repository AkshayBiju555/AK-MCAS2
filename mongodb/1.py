import pymongo
#for database connection
conn = pymongo.MongoClient("mongodb://localhost:27017/")
#to list databases
print(conn.list_database_names())
#to connect to our db 
db=conn["temp"]
#to list collections
print(db.list_collection_names())
#to connect to collection
collection=db["dean"]

#CRUD opertaions
#data=[{"roll_no":2,"name":"Sree","marks":10},{"roll_no":3,"name":"archie"}]
#to insert the above data to collection dean
#x=collection.insert_many(data)
#if(x):
   #print("data inserted")