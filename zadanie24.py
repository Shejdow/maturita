import tkinter as tk
import ctypes

root = tk.Tk()

def submit():

    name=entry.get()
    lastname=entry1.get()

    ctypes.windll.user32.MessageBoxW(0, "Ahoj " + name + " " + lastname, "Pozdrav", 1)
    print("Ahoj " + name + " " + lastname)


tk.Label(root, text="Meno").grid(row=0, column=0)
tk.Label(root, text="Priezvisko").grid(row=1, column=0)
entry = tk.Entry(root)
entry1 = tk.Entry(root)
tk.Button(root, text="POTVRDIT", width=20, command=submit).grid(row=2, column=1)
entry.grid(row=0, column=1)
entry1.grid(row=1, column=1)

root.mainloop()