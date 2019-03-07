package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.mysql.fabric.xmlrpc.base.Data;


@Entity
public class DateProposee {
	
	private long  idDate;
	@Temporal(TemporalType.DATE)
	private Date  dateDebut;
	private Date  dateFin;	
	private boolean pauseDej;
	private List<Sondage> listeSondages = new ArrayList<Sondage>();
	public DateProposee() {}
	
	public DateProposee(Date  datesond2,Date  datesond3) {
		super();
		this.dateDebut = datesond2;
		this.dateFin = datesond3;	
		if(dateDebut.getHours()<12 && dateFin.getHours()>14) {
			pauseDej=true;
		}
	}
	@Id
	@GeneratedValue
	public long  getIdDate() {
		return idDate;
	}
	public void setIdDate(long idDate) {
		this.idDate = idDate;
	}
	
	
<<<<<<< HEAD
	
	public Date getDatePauseDejeuner() {
		return datePauseDejeuner;
	}
	public void setDatePauseDejeuner(Date datePauseDejeuner) {
		this.datePauseDejeuner = datePauseDejeuner;
	}
	public Date getDatePause() {
		return datePause;
	}
	public void setDatePause(Date datePause) {
		this.datePause = datePause;
	}
	@ManyToMany()
=======
	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public boolean isPauseDej() {
		return pauseDej;
	}

	public void setPauseDej(boolean pauseDej) {
		this.pauseDej = pauseDej;
	}

	@ManyToMany(mappedBy="listeDatesProposees")
>>>>>>> 92ec98db26639e77e4b6b171c0220ea24f247f03
	public List<Sondage>  getListeSondages() {
		return listeSondages;
	}
	public void setListeSondages(List listeSondages) {
		this.listeSondages = listeSondages;
	}
	
	
	
	

}
