import jakarta.jws.WebService;
import java.util.Random;
import jakarta.jws.WebMethod;

@WebService(targetNamespace = "http://myWSService")
public class ServiceImplementation {
	public static String[] allCountries = {"AX","AF","AL","DZ","AS","AD","AO","AI","AQ","AG","AR","AM","AW","AU","AT","AZ","BS",
			"BH","BD","BB","BY","BE","BZ","BJ","BM","BT","BO","BQ","BA","BW","BV","BR","IO","BN","BG","BF","BI","CI","KH","CM","CA",
			"CV","KY","CF","TD","CL","CN","CX","CC","MF","CO","KM","CG","CD","CK","CR","HR","CU","CW","CY","CZ","DK","DJ","DM","DO",
			"EC","EG","SV","GQ","ER","EE","ET","FK","FO","FJ","FI","FR","GF","PF","TF","GA","GM","GE","DE","GH","GI","GR","GL","GD",
			"GP","GU","GT","GN","GW","GY","HT","HM","HN","HK","HU","IS","IN","ID","IR","IQ","IE","IL","IT","JM","JP","JO","KZ","KE",
			"KI","KW","KG","LA","LV","LB","LS","LR","LY","LI","LT","LU","MO","MK","MG","MW","MY","MV","ML","MT","MH","MQ","MR","MU",
			"YT","MX","FM","MD","MC","MN","ME","MS","MA","MZ","MM","NA","NR","NP","NL","AN","NC","NZ","NI","NE","NG","NU","NF","KP",
			"MP","NO","OM","PK","PW","PS","PA","PG","PY","PE","PH","PN","PL","PT","PR","QA","RE","RO","RU","RW","BL","SH","PM","SM",
			"ST","SA","SN","RS","SC","SL","SG","SX","SK","SI","SB","SO","ZA","GS","KR","ES","LK","KN","LC","VC","SD","SR","SJ","SZ",
			"SE","CH","SY","TW","TJ","TZ","TH","TL","TG","TK","TO","TT","TN","TR","TM","TC","TV","UG","UA","AE","GB","US","UM","UY",
			"UZ","VU","VA","VE","VN","VG","VI","WF","EH","WS","YE","ZM","ZW"};  
	
	@WebMethod
	public String getRandomCountry() {
		 return  allCountries[new Random().nextInt(allCountries.length)];
	}
}
