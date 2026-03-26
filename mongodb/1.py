import pymongo
#for database connection
conn = pymongo.MongoClient("mongodb://localhost:27017/")
#to list databases
#print(conn.list_database_names())
#to connect to our db 
db=conn["student"]
#to list collections
#print(db.list_collection_names())
#to connect to collection
col=db["mark"]

#CRUD opertaions
data={"roll_no":2,"name":"Sree","marks":10}
#to insert the above data to collection mark
x=col.insert_one(data)
if(x):
    print("data inserted")