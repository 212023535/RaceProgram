package RaceProgram.Domain;

import java.io.Serializable;

/**
 * Created by student on 2015/04/17.
 */
public class PitCrews implements Serializable
{
    private boolean answer;
    private String driverName;

    private PitCrews(){}

    public PitCrews(Builder builder)
    {
        answer = builder.answer;
        driverName = builder.driverName;
    }

    public boolean isAnswer() {
        return answer;
    }

    public static class Builder
    {
        private boolean answer;
        private String driverName;

        public Builder(String driverName)
        {
            this.driverName = driverName;
        }

        public Builder answer(boolean value)
        {
            this.answer = value;
            return this;
        }

        public PitCrews build()
        {
            return new PitCrews(this);
        }
    }

    @Override
    public String toString() {
        return "PitCrews{" +
                "answer=" + answer +
                ", driverName='" + driverName + '\'' +
                '}';
    }
}
