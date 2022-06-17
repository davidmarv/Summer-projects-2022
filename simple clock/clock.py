from tkinter import Label, Tk 
import time
app_window = Tk() 
app_window.title("Clock") 
app_window.geometry("300x100") 


text_font= ("",20, 'bold')
background = "#5d8aa8"
foreground= "#363529"
border_width = 25

label = Label(app_window, font=text_font, bg=background, fg=foreground, bd=border_width) 
label.grid(row=0, column=1)

def digital_clock(): 
   time_live = time.strftime("%m/%d/%Y, %H:%M:%S")
   label.config(text=time_live) 
   label.after(200, digital_clock)



digital_clock()
app_window.mainloop()