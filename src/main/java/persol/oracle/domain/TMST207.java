package persol.oracle.domain;

import java.sql.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Entity
public class TMST207 {

    @Id
    @Getter
	@Setter
    public String ASSYULID;
    @Getter
	@Setter
    public String ASSYULNM;
    @Getter
	@Setter
    public int ASORT;
    @Getter
	@Setter
    public Date ABTDT;
    @Getter
	@Setter
    public Date ACRDT;
    @Getter
	@Setter
    public String ACRID;
    @Getter
	@Setter
    public Date AUPDT;
    @Getter
	@Setter
    public String AUPID;
    @Getter
	@Setter
    public Date ADLDT;
    @Getter
	@Setter
    public String ADLID;
    @Getter
	@Setter
    public String ADLFL;

    public TMST207() {
        
    }
}