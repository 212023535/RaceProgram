package RaceProgram.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/13.
 */
public class Drivers implements Serializable
{
    private String driverName;
    private int carNumber;
    private String classCode;

    private Drivers(){}

    public Drivers(Builder builder)
    {
        classCode = builder.classCode;
        carNumber = builder.carNumber;
        driverName = builder.driverName;
    }

    public String getClassCode()
    {
        return classCode;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public static class Builder
    {
        private String driverName;
        private int carNumber;
        private String classCode;

        public Builder(int carNumber)
        {
            this.carNumber = carNumber;
        }

        public Builder classCode(String value)
        {
            this.classCode = value;
            return this;
        }

        public Builder driverName(String value)
        {
            this.driverName = value;
            return this;
        }

        public Drivers build()
        {
            return new Drivers(this);
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Drivers)) return false;

        Drivers drivers = (Drivers) o;

        if (carNumber != drivers.carNumber) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return carNumber;
    }

    @Override
    public String toString()
    {
        return "Drivers{" +
                "driverName='" + driverName + '\'' +
                ", carNumber=" + carNumber +
                ", classCode='" + classCode + '\'' +
                '}';
    }
}
