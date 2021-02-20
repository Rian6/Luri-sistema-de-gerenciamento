
#import psycopg2
import matplotlib.pyplot as plt
import numpy as np

#Banco de dados
'''
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
'''
#Interface grafica  
'''
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
'''

arq = open('eixo_x.bin', 'r')
conteudo = arq.readlines()
arq.write("asdasd")
valores = np.array(arq.readlines())
arq.close()

arq2 = open('eixo_y.bin', 'r')
valores2 = np.array(arq2.readlines())
arq2.close()

conf = open('config.bin', 'r')
valores3 = np.array(conf.readlines())
conf.close()

plt.rcParams['figure.figsize'] = (11,7)

plt.title(valores3[0])
plt.xlabel(valores3[1])
plt.ylabel(valores3[2])
#valores = list(map(int, valores))

plt.plot(valores2, valores)
#plt.xticks(range(len(valores)),meses)

plt.show()
'''
btn0 = Button(Ltudo, text="Fazer Media", bg="orange", fg="white",command=clicked)
btn0.grid(column=0, row=2)

janela.mainloop()
'''