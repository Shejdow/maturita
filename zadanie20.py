import tkinter as tk
import tkinter.font as tkFont

root = tk.Tk()
canvas = tk.Canvas(root, width=300, height=150)
canvas.pack()

colores = ["black", "blue", "red", "lime", "aqua"]
for i in range(5):
    font = tkFont.Font(family="Times", size=14+(i*2), weight="bold")
    label = tk.Label(root, text="Milujem tuto školu", font=font, fg=colores[i])
    label.pack()

root.mainloop()