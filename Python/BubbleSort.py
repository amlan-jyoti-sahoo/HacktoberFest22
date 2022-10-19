def bubble_sort(list1):
        for i in range(len(list1)):
          for j in range(len(list1)-i-1):
              if list1[j]>list1[j+1]:
                temp=list1[j]
                list1[j]=list1[j+1]
                list1[j+1]=temp
        return list1           

list1=[]
while True:
    a=int(input(" Enter Element in list/ do you want to quit press(0) "))
    if a==0:
       break
    list1.append(a) 
print(" Bubble Sort")     
print(f"list entered by user is:{list1}")
print(f"Sorted list is:{bubble_sort(list1)}")