from sys import argv

def get_names():
	filename = "greyhounddata.csv"
	f = open(filename,"r")

	#TAKE CARE OF THE LAST LINE
	kennel_list = []

	for line in f:
	     if '\n' == line[-1]:
	          line = line[:-1]
	          #print(line + "\n")

	          columns = line.split(";")
	          name_1 = columns[3]
	          name_1 = name_1[:-12]
	          name_2 = columns[5]
	          name_3 = columns[6]
	          iterat_names = (name_1,name_2,name_3)
	          for name in iterat_names:
	          	if name.count(" ") == 1:
	          		# First Case - Ocurrrences with "'" 
	          		if name.count("\'") == 1:
	          			temp_kennel = name.split(" ")[0][:-2]
	          		# Second case - Normal two name dog taking in the last name
	          		else:
	          			temp_kennel = name.split(" ")[1]

	          		if temp_kennel not in kennel_list and temp_kennel != "":
	          				kennel_list.append(temp_kennel)
	return kennel_list


def write_file(names):
	f = open('kennel_names.csv','w')
	for name in names:
		f.write(name + ";\n")
	f.close()


write_file(get_names())