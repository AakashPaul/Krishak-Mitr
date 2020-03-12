# कृषक मित्र/Farmer's Friend (Prototype)
This app provides a platform for indian farmers to enhance their produce using ML rain based preiction method.

# Basic Info
-> According to the predicted rain patterns of over 100 years , rain statistics are provided.

-> Using the rain prediction ,crops are recommended.

-> Methods for better farming are also provided with the crop recommendation.

-> We aim to provide a portal to connect farmers with the respective govt. schemes.

-> Farmers of different states are also connected banks for loan and insurance purposes.

-> Main motive of the app is to provide as much information as possible in offline mode.

-> Pesticides firms are provided a space to display their product.

# Deep learning Applied
For this app 100 years of rainfall data of india was used from www.data.gov.in . This data was divided according to different regions sharing same rainfall patterns across the country for ex. Delhi,Haryana and Chandigarh was included in one region.

This data was fed to an RNN model with 4 layers and to prevent 3 dropout layes were also provided.Each epoch consisted of a total of 60 data points to predict the new data point.

<img src="https://user-images.githubusercontent.com/40910723/76427785-c48bce00-63d2-11ea-928f-96d48756eb74.png" width="90%"></img> 

Considering poor awareness of technology among farmers the model was kept as a separate entity so that the model does not run every time the prediction is done hence reducing the computational load on a low spec device.

# Glimpse of the app

<img src="https://user-images.githubusercontent.com/40910723/76436346-1ede5c00-63de-11ea-91cc-e7f62957ca93.jpg" width="23%"></img> <img src="https://user-images.githubusercontent.com/40910723/76436359-21d94c80-63de-11ea-8289-5dfcbac3de63.jpg" width="23%"></img> <img src="https://user-images.githubusercontent.com/40910723/76436384-2998f100-63de-11ea-97a9-dcbbe5e6e4c6.jpg" width="23%"></img> <img src="https://user-images.githubusercontent.com/40910723/76436398-2e5da500-63de-11ea-8c4e-615153562cbc.jpg" width="23%"></img> <img src="https://user-images.githubusercontent.com/40910723/76436419-361d4980-63de-11ea-9132-1fb315530c73.jpg" width="23%"></img> <img src="https://user-images.githubusercontent.com/40910723/76436435-39b0d080-63de-11ea-867c-b4d49d52afd5.jpg" width="23%"></img> <img src="https://user-images.githubusercontent.com/40910723/76436445-3cabc100-63de-11ea-8648-2e679e15f89b.jpg" width="23%"></img> <img src="https://user-images.githubusercontent.com/40910723/76436456-403f4800-63de-11ea-84b7-37be1ad42a7f.jpg" width="23%"></img> 
# Created By:
Aakash Paul and Kartikay Khosla (BVCOE,NEW DELHI)
