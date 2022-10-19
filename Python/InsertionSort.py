
def insertion_sort(list1):
    for i in range(1,len(list1)):
        curr=list1[i]
        previous_element=i-1
        while previous_element>=0 and curr<list1[previous_element]:
            list1[previous_element+1]=list1[previous_element]
            previous_element=previous_element-1
        list1[previous_element+1]=curr
      

list1=[]
while True:
    a=int(input(" Enter Element in list/ do you want to quit press(0) "))
    if a==0:
       break
    list1.append(a) 
print(" insertion Sort")     
print(f"list entered by user is:{list1}")
insertion_sort(list1)
print("Insertion sort:",list1)