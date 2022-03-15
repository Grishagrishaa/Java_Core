package testWorks.citizens.dto;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private int humanId;
    private String madeBy;
    private LocalDate date;
    private int PassportId;

    public Passport(int humanId, String madeBy, LocalDate date, int passportId) {
        this.humanId = humanId;
        this.madeBy = madeBy;
        this.date = date;
        PassportId = passportId;
    }

    public int getHumanId() {
        return humanId;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "humanId=" + humanId +
                ", madeBy='" + madeBy + '\'' +
                ", date=" + date +
                ", PassportId=" + PassportId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return humanId == passport.humanId && PassportId == passport.PassportId && Objects.equals(madeBy, passport.madeBy) && Objects.equals(date, passport.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanId, madeBy, date, PassportId);
    }
}

