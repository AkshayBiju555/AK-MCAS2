import pymongo
conn = pymongo.MongoClient("mongodb://localhost:27017/")
db=conn["exam"]
mycol=db["stmarks"]
'''count=0

x=int(input("Enter number of students:"))
for i in range(x):
    rollno=int(input("Enter roll number :"))
    name=input("Enter name:")
    m1=int(input("Enter mark 1:"))
    m2=int(input("Enter mark 2:"))
    m3=int(input("Enter mark 3:"))
    data={"rollno":rollno,"name":name,"mark1":m1,"mark2":m2,"mark3":m3,"total":m1+m2+m3}
    mycol.insert_one(data)
    print("data inserted")'''

    
'''for doc in mycol.find():
    print(doc)'''
    
'''print("Marks in sorted order")
for i in mycol.find({},{"name":1,"total":1,"_id":0}).sort([("name", -1)]):
    print(i["total"])'''


#for i in mycol.find({"total":{"$lte":100}},{"name":1,"total":1,"_id":0}):
 #   print(i["name"],i["total"])
    
'''for i in mycol.find():
    count+=1
print("Total number of students : ",count)'''


'''for i in mycol.find({"name":{"$regex":"^a"}}):
    print(i)'''
    
'''for i in mycol.find({"name": {"$regex": "e$"},"total":{"$gt":50}}):
    print(i)'''
    
'''top = mycol.find({}, {"name":1, "total":1, "_id":0}).sort([("total", -1)]).limit(1)

for student in top:
    print(student["total"])'''
    
#UPDATE(update one and update many)
'''my_query={"rollno":26}
new_value={"$set":{"total":100},"$set":{"mark1":27}}
mycol.update_one(my_query,new_value)
print(mycol.find_one({"rollno":26}))'''

#delete
'''mycol.delete_one({"name":{"$regex":"^s"}})
for doc in mycol.find():
    print(doc)'''
    
'''mycol.delete_many({"name":{"$regex":"^a"}})
for doc in mycol.find():
    print(doc)'''
    
for i in mycol.find({},{"total":1,"_id":0}).sort("total",-1).limit(1):
    print(i["total"])

