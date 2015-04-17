package RaceProgram.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/15.
 */
public class Grid implements Serializable
{
    private String driverName;
    private String classCode;
    private int gridSize;
    private int gridPosition;

    private Grid(){}

    public Grid(Builder builder)
    {
        driverName = builder.driverName;
        gridSize = builder.gridSize;
        classCode = builder.classCode;
        gridPosition = builder.gridPosition;
    }


    public String getDriverName() {
        return driverName;
    }

    public String getClassCode() {
        return classCode;
    }

    public int getGridPosition(){return gridPosition;}

    public static class Builder
    {
        private String driverName;
        private int gridSize;
        private String classCode;
        private int gridPosition;

        public Builder(int gridSize)
        {
            this.gridSize = gridSize;
        }


        public Builder driverName(String value)
        {
            this.driverName = value;
            return this;
        }

        public Builder classCode(String value)
        {
            this.classCode = value;
            return this;
        }

        public Builder gridPosition(int value)
        {
            this.gridPosition = value;
            return this;
        }

        public Grid build()
        {
            return new Grid(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grid grid = (Grid) o;

        if (classCode != null ? !classCode.equals(grid.classCode) : grid.classCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return classCode != null ? classCode.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Grid{" +
                "classCode='" + classCode + '\'' +
                ", gridSize=" + gridSize +
                '}';
    }
}
