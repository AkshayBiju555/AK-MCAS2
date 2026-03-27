import pymongo
conn = pymongo.MongoClient("mongodb://localhost:27017/")
db=conn["mca"]
mycol=db["s2"]
'''data=[{"rollno":1,"name":"Aravind","mark":89},{"rollno":23,"name":"John","mark":100},{"rollno":42,"name":"Merly","mark":98},{"rollno":58,"name":"Sreevidya","mark":56},{"rollno":60,"name":"Yadhu","mark":34}]
x=mycol.insert_many(data)
if(x):
    print("Data inserted")'''

#to display the all contents of collection(similar to select * from tablename)
#for doc in mycol.find():
 #   print(doc)
 
#to display the first document 
#print(mycol.find_one())

#where condition in nosql(first brace contain where condition)(second brace contain what to project or display)
#print(mycol.find_one({"rollno":42},{"name":1}))

#for i in mycol.find({},{"name":1}):
 #   print(i)

#sort the name in descending order
#for i in mycol.find({},{"name":1,"_id":0}).sort([("name", -1)]):
 #   print(i)
#sort the names in ascending order
#for i in mycol.find({},{"name":1,"_id":0}).sort([("name",1)]):
 #   print(i)

#sort based on mark
for i in mycol.find({},{"name":1,"mark":1,"_id":0}).sort([("mark", -1)]):
    print(i["name"])




