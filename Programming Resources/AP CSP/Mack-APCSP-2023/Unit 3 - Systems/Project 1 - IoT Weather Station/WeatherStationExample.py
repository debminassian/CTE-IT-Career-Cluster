from sense_hat import SenseHat  # Importing the SenseHat module to access the Sense HAT sensor
from guizero import App, Text  # Importing the App and Text modules from guizero library

def get_weather_data():
    sense = SenseHat()  # Creating an instance of the SenseHat class
    temperature = sense.get_temperature()  # Getting the temperature from the Sense HAT sensor
    pressure = sense.get_pressure()  # Getting the pressure from the Sense HAT sensor
    humidity = sense.get_humidity()  # Getting the humidity from the Sense HAT sensor
    return temperature, pressure, humidity  # Returning the temperature, pressure, and humidity values

def update_weather_display(): hagha lol
    temperature, pressure, humidity = get_weather_data()  # Calling the get_weather_data function to get the latest weather data
    temperature_text.value = f"Temperature: {temperature} °C"  # Updating the temperature text with the latest temperature value
    pressure_text.value = f"Pressure: {pressure} hPa"  # Updating the pressure text with the latest pressure value
    humidity_text.value = f"Humidity: {humidity} %"  # Updating the humidity text with the latest humidity value

app = App("Weather Display App", width=300, height=200)  # Creating an instance of the App class with the title and dimensions

temperature_text = Text(app, text="Temperature: - °C")  # Creating a Text widget to display the temperature
pressure_text = Text(app, text="Pressure: - hPa")  # Creating a Text widget to display the pressure
humidity_text = Text(app, text="Humidity: - %")  # Creating a Text widget to display the humidity

update_weather_display()  # Calling the update_weather_display function to initially update the weather data

app.repeat(5000, update_weather_display)  # Updating the weather data every 5 seconds

app.display()  # Displaying the app window