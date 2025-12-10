import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class environement__es6{

    private int id;
    private double temperature;
    private double pressure;
    private double humidity;
    private double windSpeed;
    private double windDirection;

    // getter & setter
    public void setTemperature(final double temperature)
    {
        this.temperature = temperature;

    }
    public void setPressure(final double pressure)
    {
        this.pressure = pressure;

    }
    public void setHumidity(final double humidity)
    {
        this.humidity = humidity;

    }
    public void setWindSpeed(final double windSpeed)
    {
        this.windSpeed = windSpeed;

    }
    public void setWindDirection(final double windDirection)
    {
        this.windDirection = windDirection;

    }
    public double getTemperature(){
        return  temperature;
    }

    public double getPressure(){
        return  pressure;
    }
    public double getHumidity(){
        return  humidity;
    }
    public double getWindSpeed(){
        return  windSpeed;
    }
    public double getWindDirection(){
        return  windDirection;
    }

}

public environement__es6(double temperature , double pressure, double humidity,
                         double windSpeed, double windDirection){

    Random


}