import pymongo
conn=pymongo.MongoClient("mongodb://localhost:27017/")
db=conn["college"]
mycol=db["studlist"]
#question 1
print("\nQuestion 1\n")
for i in mycol.find({"gender":"female","course":"MCA"},{"name.fname":1,"name.lname":1,"mark":1,"_id":0}):
    print(i["name"]["fname"],i["name"]["lname"],i["mark"])
 
   
#question 2
print("\nQuestion 2\n")
for i in mycol.find({"course": "MCA"}).sort("mark", -1).limit(1):
    print(i)
    
#question 3
print("\nQuestion 3\n")
for i in mycol.find({"gender":"male","grade":"A+"}):
    print(i,"\n")
    
#question 4
print("\nQuestion 4\n")
for i in mycol.find({"course":"Mechanical"},{"name":1,"mark":1,"_id":0}).sort("mark",-1).limit(3):
    print(i)

#question 5
print("\nQuestion 5\n")
for i in mycol.find({"gender":"female","mark":{"$gt":90}},{"name.fname":1,"name.lname":1,"grade":1,"mark":1,"course":1,"_id":0}):
    print(i)
   
#question 6
print("\nQuestion 6\n")
for i in mycol.find({"mark":{"$gt":80,"$lt":90}}):
    print(i,"\n")
  
#question 7
print("\nQuestion 7\n")
for i in mycol.find({"name.fname":{"$regex":"^V"}}):
    print(i,"\n")
    
#question 8
print("\nQuestion 8\n")
for i in mycol.find({"address.city":"Kollam"}):
    print(i,"\n")
    
#question 9
print("\nQuestion 9\n")
for i in mycol.find({"address.city":{"$nin":["Kollam","Thiruvananthapuram"]}}):
    print(i,"\n")
    
#question 10
print("\nQuestion 10\n")
for i in mycol.find({"gender":"female","address.city":{"$in":["Kollam","Thiruvananthapuram"]}}):
    print(i,"\n")