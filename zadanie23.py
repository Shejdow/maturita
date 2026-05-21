import tkinter as tk
import random as rnd

root = tk.Tk()
canvas = tk.Canvas(root, width=400, height=300)
canvas.pack()

def ovaal(x0 , y0 , r ):
    canvas.create_oval(x0-r, y0-r, x0+r, y0+r)

for i in range(100):
    x0 = rnd.randint(0, 400)
    y0 = rnd.randint(0, 400)
    r =  rnd.randint(5, 50)
    ovaal(x0, y0, r)
    
canvas.mainloop()