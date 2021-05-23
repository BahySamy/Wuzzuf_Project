import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import tech.tablesaw.api.StringColumn;
import tech.tablesaw.api.Table;

import java.util.List;

public class TestWuzzufJobs {
    public void test(){
        String FileName = "D:\\ITI\\Courses\\JAVA\\Day 4\\Wazzuf Project\\Wuzzuf_Jobss.csv";
        JobDetailsCSVR jdread = new JobDetailsCSVR();
        List<JobDetails> Jdetails = jdread.JobDetailsCSVRead(FileName);
        JobDataService serv = new JobDataService();
        serv.FilterJobsByTitle(Jdetails);
        serv.FilterJobsByCountry(Jdetails);
        serv.FilterJobsByLevel(Jdetails);
        serv.FilterJobsByYearsExp(Jdetails);

        Table JobServices =
                Table.create("Jobs OverView")
                        .addColumns(
                                StringColumn.create("Jobs Tiles ", serv.FilterJobsByTitle(Jdetails)),
                                StringColumn.create("Jobs Countries ", serv.FilterJobsByCountry(Jdetails)),
                                StringColumn.create("Jobs Levels ", serv.FilterJobsByLevel(Jdetails)),
                                StringColumn.create("Jobs Years of Exp ", serv.FilterJobsByYearsExp(Jdetails)));
        System.out.println(JobServices.print());

    }

}

