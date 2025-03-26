package mail;

import java.time.LocalDateTime;

public class Mail {
	private long mailid;
	private String from,subject,body;
	private LocalDateTime rec_time;
	public Mail(long mailid, String from, String subject, String body, LocalDateTime rec_time) {
		super();
		this.mailid = mailid;
		this.from = from;
		this.subject = subject;
		this.body = body;
		this.rec_time = rec_time;
	}
	@Override
	public String toString() {
		return "Mail [mailid=" + mailid + ", from=" + from + ", subject=" + subject + ", body=" + body + ", rec_time="
				+ rec_time + "]";
	}
	public LocalDateTime getRec_time() {
		return rec_time;
	}
	
	
	
}
