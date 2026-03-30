import pymongo
conn=pymongo.MongoClient("mongodb://localhost:27017/")
db=conn["college"]
mycol=db["studlist"]
#question 1
'''for i in mycol.find({"gender":"female","course":"MCA"},{"name.fname":1,"name.lname":1,"mark":1,"_id":0}):
    print(i["name"]["fname"],i["name"]["lname"],i["mark"])'''
 
   
#question 2
'''for i in mycol.find({"course":"MCAfor i in mycol.find({"address.city":"$nin:['Kollam']"}):
    print(i)"}).sort("mark",-1).limit(1):
    print(i)'''
    
#question 3
'''for i in mycol.find({"gender":"male","grade":"A+"}):
    print(i,"\n")'''
    
#question 4
'''for i in mycol.find({"course":"Mechanical"},{"name":1,"mark":1,"_id":0}).sort("mark",-1).limit(3):
    print(i)'''

#question 5
'''for i in mycol.find({"gender":"female","mark":{"$gt":90}},{"name.fname":1,"name.lname":1,"grade":1,"mark":1,"course":1,"_id":0}):
    print(i)'''
   
#question 6
'''for i in mycol.find({"mark":{"$gt":80,"$lt":90}}):
    print(i,"\n")'''
  
#question 7
'''for i in mycol.find({"name.fname":{"$regex":"^V"}}):
    print(i,"\n")'''
    
#question 8
'''for i in mycol.find({"address.city":"Kollam"}):
    print(i,"\n")'''
    
#question 9
'''for i in mycol.find({"address.city":{"$nin":["Kollam","Thiruvananthapuram"]}}):
    print(i,"\n")'''
    
#question 10
'''for i in mycol.find({"gender":"female","address.city":{"$in":["Kollam","Thiruvananthapuram"]}}):
    print(i,"\n")'''