import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JobDetailsCSVR {


        public List<JobDetails> JobDetailsCSVRead(String FileName){
                List<JobDetails> jobdetails = new ArrayList<>();
                try(BufferedReader br = new BufferedReader(new FileReader(FileName))) {
                    String line = br.readLine();
                    if (line != null) {
                        line = br.readLine(); // the first real data
                    }
                    while (line != null) {
                        String[] attributes = line.split(",");
                        JobDetails jd = CreateJobDetails(attributes);
                        jobdetails.add(jd);
                        line = br.readLine();
                    }


                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }

                return jobdetails;
        }

    public JobDetails CreateJobDetails(String[] metadata){
        String Title = metadata[0];
        String Company =metadata[1];
        String Location = metadata[2];
        String Type = metadata[3];
        String Level = metadata[4];
        String YearsExp = metadata[5];
        String Country = metadata[6];
        String Skills = metadata[7];

        return new JobDetails(Title, Company, Location, Type, Level, YearsExp, Country, Skills);
    }

}
