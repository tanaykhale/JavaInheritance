package apps;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.util.*;
import mail.Mail;

public class ProblemXI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Mail> s=new TreeSet<>(new Comparator<Mail>() {

			@Override
			public int compare(Mail m1, Mail m2) {
				// TODO Auto-generated method stub
				return m1.getRec_time().compareTo(m2.getRec_time());
			}
		});
		s.add(new Mail(1234, "tcs", "Job Status", "Regards ", LocalDateTime.of(2025, 3, 12, 9, 10)));
		s.add(new Mail(1234, "tcs", "Job Status", "Regards ", LocalDateTime.of(2025, 3, 11, 9, 10)));
		s.add(new Mail(1234, "tcs", "Job Status", "Regards ", LocalDateTime.of(2025, 3, 10, 9, 10)));
		
		Iterator<Mail> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
