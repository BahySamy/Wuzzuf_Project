import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

import java.util.List;

/** Creates a simple Chart using QuickChart */
public class Example0 {

  public static void main(String[] args) throws Exception {
    String FileName = "D:\\ITI\\Courses\\JAVA\\Day 4\\Wazzuf Project\\Wuzzuf_Jobss.csv";
    JobDetailsCSVR jdread = new JobDetailsCSVR();
    List<JobDetails> Jdetails = jdread.JobDetailsCSVRead(FileName);
    JobDataService serv = new JobDataService();


    // Create Chart
    XYChart chart = QuickChart.getChart("Sample Chart", "X", "Y", "y(x)", serv.FilterJobsByTitle(Jdetails), serv.FilterJobsByCountry(Jdetails));

    // Show it
    new SwingWrapper(chart).displayChart();
  }
}
