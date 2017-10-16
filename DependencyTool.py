import json
import pip

file=input('Enter JSON file name (please add extension at the end like .json')
with open(file) as f
	readData=json.load(f)
if 'Dependencies' in readData:#Looking for presence of dependencies in the JSON file
	count=0
	notinstalled []#array to store the names of the dependencies not installed
	for each in readData:
		line=str(each)#reading each data in the JSON file
		ins=pip.main(['install',line])
		if ins!=0#That is an error has occured during installation 
			count=1
			notinstalled.append(str(each))#dependencies found is added to the array
	if count==1:#Hence atleast 1 uninstalled dependency is found 
		print('The following is the list of not installed dependencies')
		for c in notinstalled:
			print(c)
	else:#count remains 0 as there has been no uninstalled dependency
		print('All dependencies successfully installed')
else:
	print('No dependencies found in the JSON file')