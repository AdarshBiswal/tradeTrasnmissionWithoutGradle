package tradeTransmissionWithoutGradle;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Trade Class
 * Date Create: 12/12/2020
 * @author Adarsh Biswal
 *
 */

public class Trade {
	
	private String tradeId;
	private int version;
	private String counterPartyId;
	private String bookId;
	private Date maturityDate;
	private Date createdDate;
	private char expired;

	
	public Trade(String tid,int ver,String cpid,String bkid,Date mdate,Date cdate,char exp)
	{
		tradeId=tid;
		version=ver;
		counterPartyId=cpid;
		bookId=bkid;
		maturityDate=mdate;
		createdDate=cdate;
		expired=exp;
		
	}
	
	//getter
	public void setTradeId(String TradeId)
	{
		tradeId=TradeId;
	}
	public void setVersion(int Version)
	{
		version=Version;
	}
	public void setCounterPartyId(String CounterPartyId)
	{
		counterPartyId=CounterPartyId;
	}
	public void setBookID(String BookId)
	{
		bookId=BookId;
	}
	public void setMaturityDate(Date MaturityDate)
	{
		maturityDate=MaturityDate;
	}
	public void setCreatedDate(Date CreatedDate)
	{
		createdDate=CreatedDate;
	}
	public void setExpired(char Expired)
	{
		expired=Expired;
	}
	
	//Getter
	public String getTradeId()
	{
		return tradeId;
	}
	public int getVersion()
	{
		return version;
	}
	public String getCounterPartId()
	{
		return counterPartyId;
	}
	public String getBookId()
	{
		return bookId;
	}
	public Date getMaturityDate()
	{
		return maturityDate;
	}
	public Date getCreatedDate()
	{
		return createdDate;
	}
	public char getExpired()
	{
		return expired;
	}
	
	
	
	//Class toString convertion
	@Override
	public String toString()
	{
		SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
		
		 return ""+tradeId+" "+version+" "+counterPartyId+" "+bookId+" "+sdformat.format(maturityDate)+" "+sdformat.format(createdDate)+" "+expired;
	}
}