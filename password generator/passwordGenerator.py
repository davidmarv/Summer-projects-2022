#run this file in terminal
#this file will create a new file named SavedPasswords.txt
#if you want to change the name of the file change the name of the txt file on line 31



import random
#this portion takes in user input to get the tag, username and the number of characters and letters they want 
tag = str(input("enter tag: "))
username = str(input("enter username: "))
passwordLength = int(input("enter number of characters (a,b,c) you want in password: "))
numbersL = int(input("enter number of numbers you want in password: "))
#strings of letters and numbers to be called by random
charOptions="abcdefghijklmnopqrstuvwxyz"
charNumOptions="1234567890"

#creates a random string of numbers and letters seperated 
letterPart = "".join(random.sample(charOptions, passwordLength))
numPart = "".join(random.sample(charNumOptions, numbersL))
#combines the two pieces together 
password = str(letterPart+numPart)
#turns them into a list and shuffles the list 
pass_list = list(password)
random.shuffle(pass_list)
#turns the list back into a string 
pass_list = "".join(pass_list)

print(pass_list)

#creates or opens a file and appends the new password and other information to the end 
f= open("SavedPasswords.txt","a")
f.write("Tag: " + tag + "   Username: " + username + "   password: "+ pass_list + "\n")
f.close
