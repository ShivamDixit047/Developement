import qrcode
import image   
qr = qrcode.QRCode (
        version = 15, # To specify pixel
        box_size = 10, # To specify QR Code size
        border = 3 # To specify QR Code border
        )     
data = input("Enter link address to generate QR_Code: ")
qr.add_data(data)       
qr.make(fit=True)
img = qr.make_image(fill="black",back_color="white")
def custom(s): # function to save file according user specified url 
    if s[-1]=='': # To check whether url has subfolder
        s=s[-2]  # assign last second string
        if '.' in s: # We don't require extension So check . 
            s=s.split('.')[0] # split file by '.' and assign name not extension
    else:        
        s=s[-1] # assign direct last name.extension
        if '.' in s: # To '.' extenstion
            s=s.split('.')[0] # split file by '.' and assign name not extension
    print("Your QR Code has been generated in same file directory.")
    img.save(s+'.png') # saving file in png format
custom(data.split('/')) # calling where we pass split list by '/'
