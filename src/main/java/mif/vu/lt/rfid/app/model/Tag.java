package mif.vu.lt.rfid.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class Tag extends Element {

	
	private Integer rssi;
	
	private Integer butt;
	
	private Integer stop;
	
}
