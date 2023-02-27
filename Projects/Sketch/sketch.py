import numpy as np
import imageio.v2
import scipy.ndimage
import cv2

img = input("Enter the image with extension(if image is not in a same directory as program must specify path with it): ").strip() # The image must be present in a same directory.

def rgb2gray(rgb):
    return np.dot(rgb[...,:3],[0.2989,0.5870,0.1140])
    # it is 2-D array formula to convert image to gray scale

def dodge(front, back):
    final_sketch = front*255/(255-back)
    # if image is greater than 255 which I don't think is possible byt still if it is there will convert it to 255
    final_sketch[final_sketch>255] = 255
    final_sketch[back==255] = 255
    # to convert any suitable column to categorical type we will use aspect function
    # and uint8 is for 8-bit signed integer
    return final_sketch.astype('uint8')

ss = imageio.v2.imread(img) # this function will read the image
gray = rgb2gray(ss) # for black and white color scheme

i = 210-gray # 255 for bright color(white) You can change the numeric value accordingly jere I used 210.

blur = scipy.ndimage.gaussian_filter(i,sigma=15)
# sigma is the intensity of blurness of image
r = dodge(blur, gray)  # this function will convert our image to sketch

cv2.imwrite('Sketch.jpg',r)
