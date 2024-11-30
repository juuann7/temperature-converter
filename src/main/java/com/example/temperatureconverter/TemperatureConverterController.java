package com.example.temperatureconverter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureConverterController {

    // Mengonversi Celsius ke Fahrenheit
    @GetMapping("/api/convert/celsiusToFahrenheit")
    public double convertCelsiusToFahrenheit(@RequestParam double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Mengonversi Fahrenheit ke Celsius
    @GetMapping("/api/convert/fahrenheitToCelsius")
    public double convertFahrenheitToCelsius(@RequestParam double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
