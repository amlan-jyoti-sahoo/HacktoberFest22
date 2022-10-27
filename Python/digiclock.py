
from this import d
from time import time
from tkinter import *
import datetime

def date_time():
    time = datetime.datetime.now()
    hr = time.strftime('%I')
    min  = time.strftime('%M')
    sec = time.strftime('%S')
    mid = time.strftime('%p')
    date = time.strftime('%d')
    mon = time.strftime('%m')
    year = time.strftime('%y')
    day = time.strftime('%a')

    lab_hr.config(text=hr)
    lab_min.config(text=min)
    lab_sec.config(text=sec)
    lab_mid.config(text=mid)
    lab_date.config(text=date)
    lab_mon.config(text=mon)
    lab_year.config(text=year)
    lab_day.config(text=day)
    lab_hr.after(200,date_time)




clock = Tk()
clock.title("DIGI CLOCK!!!")
clock.geometry('500x375')
clock.config(bg="black")


lab_hr=Label(clock,text='00',font=('Old English Text MT',40,"bold"),bg='black',fg='turquoise')
lab_hr.place(x=30,y=25,height=50,width=60)

lab_space1=Label(clock,text=':',font=('Old English Text MT',35,"bold"),fg='TAN',bg='black')
lab_space1.place(x=105,y=25,height=50,width=30)

lab_min=Label(clock,text='00',font=('Old English Text MT',40,"bold"),bg='black',fg='turquoise')
lab_min.place(x=155,y=25,height=50,width=60)

lab_space2=Label(clock,text=':',font=('Old English Text MT',35,"bold"),fg='TAN',bg='black')
lab_space2.place(x=235,y=25,height=50,width=30)

lab_sec=Label(clock,text='00',font=('Old English Text MT',40,"bold"),bg='black',fg='turquoise')
lab_sec.place(x=285,y=25,height=50,width=60)

lab_space3=Label(clock,text='|',font=('Old English Text MT',25,"bold"),fg='TAN',bg='black')
lab_space3.place(x=365,y=25,height=50,width=30)

lab_mid=Label(clock,text='PM',font=('Old English Text MT',30,"bold"),bg='black',fg='turquoise')
lab_mid.place(x=415,y=25,height=50,width=60)

lab_hrl=Label(clock,text='HOUR',font=('Old English Text MT',10,"bold"),bg='TURQUOISE',fg='black')
lab_hrl.place(x=30,y=90,height=20,width=60)

lab_minl=Label(clock,text='MINUTE',font=('Old English Text MT',10,"bold"),bg='TURQUOISE',fg='black')
lab_minl.place(x=155,y=90,height=20,width=60)

lab_secl=Label(clock,text='SECOND',font=('Old English Text MT',10,"bold"),bg='TURQUOISE',fg='black')
lab_secl.place(x=285,y=90,height=20,width=60)

lab_midl=Label(clock,text='AM/PM',font=('Old English Text MT',10,"bold"),bg='TURQUOISE',fg='black')
lab_midl.place(x=415,y=90,height=20,width=60) 





lab_date=Label(clock,text='00',font=('Old English Text MT',40,"bold"),bg='black',fg='gold')
lab_date.place(x=30,y=165,height=50,width=60)

lab_space1=Label(clock,text='/',font=('Old English Text MT',35,"bold"),fg='LIGHT BLUE',bg='black')
lab_space1.place(x=105,y=165,height=50,width=30)

lab_mon=Label(clock,text='00',font=('Old English Text MT',40,"bold"),bg='black',fg='gold')
lab_mon.place(x=155,y=165,height=50,width=60)

lab_space2=Label(clock,text='/',font=('Old English Text MT',35,"bold"),fg='LIGHT BLUE',bg='black')
lab_space2.place(x=235,y=165,height=50,width=30)

lab_year=Label(clock,text='00',font=('Old English Text MT',40,"bold"),bg='black',fg='gold')
lab_year.place(x=285,y=165,height=50,width=60)

lab_space3=Label(clock,text='|',font=('Old English Text MT',25,"bold"),fg='LIGHT BLUE',bg='black')
lab_space3.place(x=365,y=165,height=50,width=30)

lab_day=Label(clock,text='DAY',font=('Old English Text MT',25,"bold"),bg='black',fg='gold')
lab_day.place(x=415,y=165,height=50,width=60)


lab_datel=Label(clock,text='DATE',font=('Old English Text MT',10,"bold"),bg='GOLD',fg='black')
lab_datel.place(x=30,y=230,height=20,width=60)

lab_monl=Label(clock,text='MONTH',font=('Old English Text MT',10,"bold"),bg='GOLD',fg='black')
lab_monl.place(x=155,y=230,height=20,width=60)

lab_yearl=Label(clock,text='YEAR',font=('Old English Text MT',10,"bold"),bg='GOLD',fg='black')
lab_yearl.place(x=285,y=230,height=20,width=60)

lab_dayl=Label(clock,text='DAY',font=('Old English Text MT',10,"bold"),bg='GOLD',fg='black')
lab_dayl.place(x=415,y=230,height=20,width=60) 


lab_name=Label(clock,text='***   DIGI CLOCK   ***',font=('Old English Text MT',30,"bold"),bg='BLACK',fg='VIOLET')
lab_name.place(x=40,y=295,height=55,width=420)

date_time()
clock.mainloop()