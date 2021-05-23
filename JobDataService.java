import java.util.*;

public class JobDataService {
    public List FilterJobsByTitle(List<JobDetails> Jobs){
        List<String> Jobs_Titles = new ArrayList<String>();
        for(JobDetails J:Jobs){
            Jobs_Titles.add(J.Title);
        }

        Set<String> st = new HashSet<String>(Jobs_Titles);
        for (String s : st){
            System.out.println(s + ": " + Collections.frequency(Jobs_Titles, s));}
        return Jobs_Titles;
    }

    public List FilterJobsByCountry(List<JobDetails> Jobs){
        List<String> Jobs_Countries = new ArrayList<>();
        for(JobDetails J:Jobs){
            Jobs_Countries.add(J.Country);
        }

        Set<String> st = new HashSet<String>(Jobs_Countries);
        for (String s : st){
            System.out.println(s + ": " + Collections.frequency(Jobs_Countries, s));}
        return Jobs_Countries;
    }

    public List FilterJobsByLevel(List<JobDetails> Jobs){
        List<String> Jobs_Levels = new ArrayList<>();
        for(JobDetails J:Jobs){
            Jobs_Levels .add(J.Level);
        }

        Set<String> st = new HashSet<String>(Jobs_Levels );
        for (String s : st){
            System.out.println(s + ": " + Collections.frequency(Jobs_Levels , s));}
        return Jobs_Levels;
    }

    public List FilterJobsByYearsExp(List<JobDetails> Jobs){
        List<String> Jobs_YearsExp = new ArrayList<>();
        for(JobDetails J:Jobs){
            Jobs_YearsExp .add(J.YearsExp);
        }

        Set<String> st = new HashSet<String>(Jobs_YearsExp );
        for (String s : st){
            System.out.println(s + ": " + Collections.frequency(Jobs_YearsExp , s));}
        return Jobs_YearsExp;
    }

}
