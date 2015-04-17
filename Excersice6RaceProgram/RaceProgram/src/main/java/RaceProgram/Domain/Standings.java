package RaceProgram.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/16.
 */
public class Standings  implements Serializable
{
    private int position;
    private String driverName;
    private String classCode;
    private String className;

    private Standings(){}

    public Standings(Builder builder)
    {
        position = builder.position;
        driverName = builder.driverName;
        classCode = builder.classCode;
        className = builder.className;
    }

    public int getPosition() {
        return position;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getClassName() {
        return className;
    }

    public static class Builder
    {
        private int position;
        private String driverName;
        private String classCode;
        private String className;

        public Builder(String classCode)
        {
            this.classCode = classCode;
        }

        public Builder className(String value)
        {
            this.className = value;
            return this;
        }

        public Builder driverName(String value)
        {
            this.driverName = value;
            return this;
        }

        public Builder position(int value)
        {
            this.position = value;
            return this;
        }

        public Standings build()
        {
            return new Standings(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Standings standings = (Standings) o;

        if (position != standings.position) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return position;
    }

    @Override
    public String toString() {
        return "Standings{" +
                "position=" + position +
                ", driverName='" + driverName + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
