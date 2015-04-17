package RaceProgram.Domain;


import java.io.Serializable;

/**
 * Created by student on 2015/04/13.
 */
public class Classes implements Serializable
{
    private String className;
    private String classCode;
    private int gridSize;
    private String raceTime;

    private Classes(){}



    public Classes(Builder builder)
    {
        className = builder.className;
        gridSize = builder.gridSize;
        raceTime = builder.raceTime;
        classCode = builder.classCode;
    }

    public String getClassName()
    {
        return className;
    }

    public String getClassCode()
    {
        return classCode;
    }

    public int getGridSize()
    {
        return gridSize;
    }

    public String getRaceTime()
    {
        return raceTime;
    }

    public static class Builder
    {
        private String className;
        private int gridSize;
        private String raceTime;
        private String classCode;

        public Builder(String classCode)
        {
            this.classCode = classCode;
        }

        public Builder gridSize(int value)
        {
            this.gridSize = value;
            return this;
        }

        public Builder raceTime(String value)
        {
            this.raceTime = value;
            return this;
        }

        public Builder className(String value)
        {
            this.className = value;
            return this;
        }

        public Classes build()
        {
            return new Classes(this);
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Classes)) return false;

        Classes classes = (Classes) o;

        if (classCode != null ? !classCode.equals(classes.classCode) : classes.classCode != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return classCode != null ? classCode.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "className='" + className + '\'' +
                ", classCode='" + classCode + '\'' +
                ", gridSize=" + gridSize +
                ", raceTime=" + raceTime +
                '}';
    }
}
