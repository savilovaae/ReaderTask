public class BirthDate {
    int day;
    int month;
    int year;

    public BirthDate() {
        this.day = this.month = this.year = 0;
    }

    public BirthDate setDay(int day) {
        this.day = day;
        return this;
    }

    public BirthDate setMonth(int month) {
        this.month = month;
        return this;
    }

    public BirthDate setYear(int year) {
        this.year = year;
        return this;
    }

    public BirthDate setAll(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        return this;
    }
}
