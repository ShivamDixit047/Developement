import pyttsx3
import qrcode
import image
engine = pyttsx3.init()
newVoiceRate = 160 # specify speak speed
engine.setProperty('rate',newVoiceRate) # setting up for speak speed
voices = engine.getProperty('voices')
engine.setProperty('voice',voices[3].id) # 3 for better english
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
            s=s.split('.')[-2] # split file by '.' and assign name not extension
    else:        
        s=s[-1] # assign direct last name.extension
        if '.' in s: # To '.' extenstion
            s=s.split('.')[-2] # split file by '.' and assign name not extension
    img.save(s+'.png') # saving file in png format
    engine.say("Your file has been created in current directory")
    engine.runAndWait() # Waiting time to speak
    engine.stop() # Stopping the engine
custom(data.split('/')) # calling where we pass split list by '/'
