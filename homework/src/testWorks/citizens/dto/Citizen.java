package testWorks.citizens.dto;

import testWorks.citizens.suppliers.PassportSupplier;

import java.time.LocalDate;
import java.util.Objects;

public class Citizen {
    private int humanId;
    private Passport passport;
    private String name;
    private LocalDate birthDate;

    public Citizen( Passport passport, String name, LocalDate birthDate) {
        this.humanId = passport.getHumanId();
        this.passport = passport;
        this.name = name;
        this.birthDate = birthDate;
    }
    public Citizen (){
        this(new PassportSupplier().get(),"Grisha", LocalDate.of(2004,04,21));
    }


    @Override
    public String toString() {
        return "Citizen{" +
                "humanId=" + humanId +
                ", passport=" + passport +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return humanId == citizen.humanId && Objects.equals(passport, citizen.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanId, passport);
    }
}
