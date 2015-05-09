package in.warecon.ams.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Fees {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long feesId;
	
	private Student student;
	private long feesApplicable;
	private long feesOutStanding;
	private Date dueDate;
	private long penalty;
	private int year;
	
	
}
