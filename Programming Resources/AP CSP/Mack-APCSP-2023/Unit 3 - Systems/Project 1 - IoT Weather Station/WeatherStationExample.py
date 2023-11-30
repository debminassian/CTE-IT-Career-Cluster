from sense_hat import SenseHat
from guizero import App, Text

def get_weather_data():
    sense = SenseHat()
    temperature = sense.get_temperature()
    pressure = sense.get_pressure()
    humidity = sense.get_humidity()
    return temperature, pressure, humidity

def update_weather_display():
    temperature, pressure, humidity = get_weather_data()
    temperature_text.value = f"Temperature: {temperature} °C"
    pressure_text.value = f"Pressure: {pressure} hPa"
    humidity_text.value = f"Humidity: {humidity} %"

app = App("Weather Display App", width=300, height=200)

temperature_text = Text(app, text="Temperature: - °C")
pressure_text = Text(app, text="Pressure: - hPa")
humidity_text = Text(app, text="Humidity: - %")

update_weather_display()

app.repeat(5000, update_weather_display)  # Update weather data every 5 seconds

app.display()
