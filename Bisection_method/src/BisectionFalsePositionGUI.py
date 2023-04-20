# -*- coding: utf-8 -*-
"""
Created on Thu Mar 31 16:29:26 2022

@author: Ferhat and Betul
"""
import math
import numpy
import tkinter
from tkinter import ttk
import ctypes
def bisection():
    # Kökü bulunacak fonksiyonu alt limit üst limiti ve istenen bağıl hatayı kullanıcıdan alıyoruz.

    fonksiyonn = fonksiyonGirdi.get()
    Xl = eval(xlGirdi.get())
    Xu = eval(xuGirdi.get())
    Es = eval(esGirdi.get())

    Xr = 0.0
    Xrold = 0.0
    iterasyonSayaci = 1
    Ea = 100.0
    # Hesapladığımız verileri tutmak için bir liste oluşturuyoruz.
    veriler = []
    veriler.append(iterasyonSayaci)
    veriler.append(Xl)
    veriler.append(Xu)
    # Kullanıcıdan alınan karakter dizisini koda dönüştürür.
    def fonksiyon(x):
        fonksiyon = eval(fonksiyonn)
        return fonksiyon
    if(fonksiyon(Xl)* fonksiyon(Xu) < 0):
        while(Ea > Es):
            Xr = (Xl + Xu) / 2
            veriler.append(Xr)
            if(iterasyonSayaci == 1):
                Xrold = Xr
                veriler.append(" ")
            if(fonksiyon(Xl)* fonksiyon(Xr) < 0):
                Xu = Xr
                if(iterasyonSayaci != 1):
                    Ea = abs(((Xr - Xrold) / Xr)*100)
                    Xrold = Xr
                    veriler.append(Ea)
            else:
                Xl = Xr
                if(iterasyonSayaci != 1):
                    Ea = abs(((Xr - Xrold) / Xr)*100)
                    Xrold = Xr
                    veriler.append(Ea)
            if(Ea>Es):
                iterasyonSayaci += 1
                veriler.append(iterasyonSayaci)
                veriler.append(Xl)
                veriler.append(Xu)
        print("\n\nBağıl hata: " , Ea)
        print("Kök: " , Xr)
        print("İterasyon sayısı: ", iterasyonSayaci)
        def bilgiGörüntüle():
           for k in verileriGöster.get_children():
               verileriGöster.delete(k)
           try:
               satir = iterasyonSayaci
               sutun = 5
               veriler2 = numpy.array_split(veriler,5)
               matris = numpy.array(veriler2).reshape(satir, sutun)
               for i in matris:
                   verileriGöster.insert('', 'end', values= i)
               print("\n",matris)
             

           except:
               print("\nHatalı aralık")   
        bilgiGörüntüle() 
    else:
        ctypes.windll.user32.MessageBoxW(0, "Bu aralıkta kök yoktur", "Hatalı aralık", 1)
def FalsePosition():
    # Kökü bulunacak fonksiyonu alt limit üst limiti ve istenen bağıl hatayı kullanıcıdan alıyoruz.

    fonksiyonn = fonksiyonGirdi.get()
    Xl = eval(xlGirdi.get())
    Xu = eval(xuGirdi.get())
    Es = eval(esGirdi.get())

    Xr = 0.0
    Xrold = 0.0
    iterasyonSayaci = 1
    Ea = 100.0
    # Hesapladığımız verileri tutmak için bir liste oluşturuyoruz.
    veriler = []
    veriler.append(iterasyonSayaci)
    veriler.append(Xl)
    veriler.append(Xu)
    # Kullanıcıdan alınan karakter dizisini koda dönüştürür.
    def fonksiyon(x):
        fonksiyon = eval(fonksiyonn)
        return fonksiyon
    if(fonksiyon(Xl)* fonksiyon(Xu) < 0):
        while(Ea > Es):
            Xr = Xu - ((fonksiyon(Xu)*(Xl-Xu)/(fonksiyon(Xl)-fonksiyon(Xu))))
            veriler.append(Xr)
            if(iterasyonSayaci == 1):
                Xrold = Xr
                veriler.append(" ")
            if(fonksiyon(Xl)* fonksiyon(Xr) < 0):
                Xu = Xr
                if(iterasyonSayaci != 1):
                    Ea = abs(((Xr - Xrold) / Xr)*100)
                    Xrold = Xr
                    veriler.append(Ea)
            else:
                Xl = Xr
                if(iterasyonSayaci != 1):
                    Ea = abs(((Xr - Xrold) / Xr)*100)
                    Xrold = Xr
                    veriler.append(Ea)
            if(Ea>Es):
                iterasyonSayaci += 1
                veriler.append(iterasyonSayaci)
                veriler.append(Xl)
                veriler.append(Xu)
        print("\n\nBağıl hata: " , Ea)
        print("Kök: " , Xr)
        print("İterasyon sayısı: ", iterasyonSayaci)
        def bilgiGörüntüle():
           for k in verileriGöster.get_children():
               verileriGöster.delete(k)
           try:
               satir = iterasyonSayaci
               sutun = 5
               veriler2 = numpy.array_split(veriler,5)
               matris = numpy.array(veriler2).reshape(satir, sutun)
               for i in matris:
                   verileriGöster.insert('', 'end', values= i)
               print("\n",matris)
             

           except:
               print("\nHatalı aralık")   
        bilgiGörüntüle() 
    else:
        ctypes.windll.user32.MessageBoxW(0, "Bu aralıkta kök yoktur", "Hatalı aralık", 1) 

        

pencere = tkinter.Tk()
pencere.title("Bisection False Position Hesaplama")
pencere.geometry("1920x1080")

button1 = tkinter.Button(pencere, text = "Bisection Hesaplama " , font="Verdana 13", bg="#4D2A4F", fg="white",width=25,height=2, command=bisection)
button1.place(x=250,y=180 )

button2 = tkinter.Button(pencere, text = "False Position Hesaplama " , font="Verdana 13", bg="#7C5CA8", fg="white" ,width=25,height=2 ,command=FalsePosition)
button2.place(x=550,y=180)



bilgilendirme = tkinter.Label(pencere)
bilgilendirme.config(text="Kökü bulunacak fonksiyonu giriniz. Fonksiyon değişkeni olarak x kullanınız.", font="Verdana 12 bold")
bilgilendirme.place(x=50,y=20)

ornek = tkinter.StringVar()
ornek.set(" Örnek fonksiyon: (math.sqrt((9.81*x)/0.25))*(math.tanh((math.sqrt((9.81*0.25)/x))*4))-36  |  (x**4)-(9*(x**3))-(2*(x**2))+(120*x)-130")

ornekGirdi = tkinter.Entry(pencere,bd = 0, font=" Verdana 10 ",state = "readonly",textvariable=ornek,width="250",fg="#ff3030")
ornekGirdi.place(x=50,y=45)

fonksiyon = tkinter.Label(pencere)
fonksiyon.config(text="Fonksiyon : ", font="Verdana 12")
fonksiyon.place(x=50,y=80)

xl = tkinter.Label(pencere)
xl.config(text="Alt limit     : ", font="Verdana 12")
xl.place(x=50,y=130)

xu = tkinter.Label(pencere)
xu.config(text="Üst limit    : ", font="Verdana 12")
xu.place(x=600,y=130)

es = tkinter.Label(pencere)
es.config(text="Bağıl hata : ", font="Verdana 12")
es.place(x=600,y=80)



fonksiyonGirdi= tkinter.Entry(pencere,width="65")
fonksiyonGirdi.place(x=160,y=80)

xlGirdi= tkinter.Entry(pencere,width="65")
xlGirdi.place(x=160,y=130)

xuGirdi= tkinter.Entry(pencere,width="65")
xuGirdi.place(x=710,y=130)

esGirdi= tkinter.Entry(pencere,width="65")
esGirdi.place(x=710,y=80)


style = tkinter.ttk.Style()
style.configure("Treeview",font=(None, 13) ,background="#C7BBC6", foreground="black", rowheight=25,fieldbackground="silver")
style.configure("Treeview.Heading",font=(None, 14))
style.map('Treeview', background =[('selected','green')])

verileriGöster = tkinter.ttk.Treeview(pencere, columns=(1,2,3,4,5), show="headings", height="15" )
verileriGöster.place(x=150,y=270)

scroll = tkinter.ttk.Scrollbar(pencere, orient="vertical", command=verileriGöster.yview)
scroll.place(x=1153, y=271, height=399)

verileriGöster.configure(yscrollcommand=scroll.set)
verileriGöster.heading(1, text ="İterasyon")
verileriGöster.heading(2, text ="Xl")
verileriGöster.heading(3, text ="Xu")
verileriGöster.heading(4, text ="Xr")
verileriGöster.heading(5, text ="Ea")


pencere.mainloop()