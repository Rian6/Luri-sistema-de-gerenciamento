try:
    # for Python2
    from Tkinter import * 
    import tkMessageBox
except ImportError:
    # for Python3
    import tkinter 
    from tkinter import messagebox
    from tkinter import *

import psycopg2
import matplotlib.pyplot

#Banco de dados

con = psycopg2.connect(host='localhost', database='Banco',
user='postgres', password='leitao1239@r')
cur = con.cursor()


sql = "insert into cidade values (default,'Sao Paulo','SP')"
cur.execute(sql)

con.commit()

cur.execute('select * from cidade')
recset = cur.fetchall()

cur.execute('select * from cidade')
recset = cur.fetchall()


con.close()

#Interface grafica

janela = Tk()
janela.title('Menu')
janela.geometry('800x500')

Ltudo = Label(janela)
Ltudo.grid(column=0, row=0)

lbl = Label(Ltudo, text="\nMenu de gerenciamento de gastos")
lbl.grid(column=0, row=0)

Lescrita = Label(Ltudo, text="Media de custo por maquina")
Lescrita.grid(column=0, row=1)


def clicked():

    meses = ['Janeiro', 'Fevereiro', 'Marco', 'Abril', 'Maio', 'Junho','julho','Agosto','Setembro','Outubro','Novembro']
    valores = [2000,3000,4000,5000,6000,9000]
    matplotlib.pyplot.plot(meses, valores)
    matplotlib.pyplot.show()


btn0 = Button(Ltudo, text="Fazer Media", bg="orange", fg="white",command=clicked)
btn0.grid(column=0, row=2)

janela.mainloop()
