package RaceProgram.Domain;

/**
 * Created by student on 2015/04/17.
 */
public class Weather
{
    private String date;
    private String weather;

    private Weather(){}

    public Weather(Builder builder) {
        date = builder.date;
        weather = builder.weather;
    }

    public String getWeather() {
        return weather;
    }

    public static class Builder
    {
        private String weather;
        private String date;

        public Builder(String date)
        {
            this.date = date;
        }

        public Builder weather(String value)
        {
            this.weather = value;
            return this;
        }

        public Weather build()
        {
            return new Weather(this);
        }
    }

    @Override
    public String toString() {
        return "Weather{" +
                "date='" + date + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}
