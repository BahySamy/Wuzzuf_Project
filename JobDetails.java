public class JobDetails {
    String Title;
    String Company;
    String Location;
    String Type;
    String Level;
    String YearsExp;
    String Country;
    String Skills;

    public JobDetails(String Title, String Company, String Location, String Type, String Level, String YearsExp,
                      String Country, String Skills){
        this.Title = Title; this.Company = Company; this.Location = Location; this.Type = Type; this.Level = Level; this.YearsExp = YearsExp;
        this.Country = Country; this.Skills = Skills;
    }



    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        this.Company = company;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        this.Level = level;
    }

    public String getYearsExp() {
        return YearsExp;
    }

    public void setYearsExp(String yearsExp) {
        this.YearsExp = yearsExp;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String skills) {
        this.Skills = skills;
    }
}
