
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BudongsanSource  {
	public static WebDriver driver;
	public static String url = "https://m.land.naver.com/index?focus=main";
	public static WebElement element;
	public static String urlForDistrict =  "https://m.land.naver.com/map/37.496437:127.077115:18/APT/A1:B1:B2:B3#regionStep1";
	//public static Document doc = null
	public static String[] NAMES = {"강남구", "강동구", "강북구", "강서구", "관악구", "광진구", "구로구", "금천구", "노원구", 
			"도봉구", "동대문구", "동작구", "마포구", "서대문구", "서초구", "성동구", "성북구", "송파구", "양천구", 
			"영등포구", "용산구", "은평구", "종로구", "중구", "중랑구"};


	//Properties
	public static String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static String WEB_DRIVER_PATH = "C:\\Users\\J\\chromedriver_win32\\chromedriver.exe";
	
	public static void main(String[] args) throws IOException, InterruptedException {
		//driver.get(url);
		BudongsanSource budongsan = new BudongsanSource();
		
		getDistrict();
	}
	
	//class
	public BudongsanSource() {
		//System Property SetUp
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		//Driver SetUp
		ChromeOptions options = new ChromeOptions();
		options.setCapability("ignoreProtectedModeSettings", true);
		driver = new ChromeDriver(options);
	}
	
	public static String entrance() throws IOException {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//지역별
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/section/div/div[2]/div/div[2]/div[2]/div[2]/a")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//시
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/section/div[1]/div[1]/div[2]/div/div/table/tbody/tr[1]/td[1]")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//구
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/section/div[1]/div[2]/div[2]/div/div/table/tbody/tr[1]/td[1]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//동
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/section/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//select APT
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/section/div[1]/div[4]/div/div[2]/div/ul/li[1]/a")).click();
		//bottom button
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[1]/section/div[2]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//select in the map
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/section/div[4]/div/div[3]/div/div/div[1]/a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String APTname = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/section/div/div/div[1]/div[2]/h1")).getText();
		String Juso = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/section/div/div/div[1]/article[4]/div[2]/p[1]")).getText();
		String PerSquare = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/section/div/div/div[1]/article[2]/div/div[1]/div[1]/ul/li[8]/ul/li[1]/span[2]/span[2]")).getText();
		String Sedae = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/section/div/div/div[1]/div[2]/div[2]/ul/li[1]")).getText();
		
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		//시설
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/div[2]/div/div[2]/div/a[5]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//FileOutputStream output = new FileOutputStream("C:\\Users\\Jaeyeon\\Desktop\\output\\string.txt");
		//String data = driver.getPageSource();
		
		//link for Facilities article box
		
		//String[] testString = new String[1];

		//String test1 = driver.findElement(By.xpath(testString[0])).getText();
		
		//output.write(test1.getBytes());
		//output.close();
		
		System.out.println(Juso);
		System.out.println(APTname);
		
		System.out.println(PerSquare);
		System.out.println(Sedae);
		
		driver.quit();
		return APTname;
	}

	public static void getDistrict() throws IOException, InterruptedException {
		String district = "";
		String infostr = "";
		List<String> filetest = new ArrayList<String>();
		ArrayList <String> comp = new ArrayList();
		ArrayList <String> APTlist = new ArrayList();
		String compstr = "";
		String infos = "";
		int i = 0;
		
		//enters land.naver.com
		driver.get(url);
		
		Thread.sleep(4000);
		
		//select "지역별"
		System.out.println("지역명찾기");
		System.out.println("===============================");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/section/div/div[2]/div/div[2]/div[2]/div[2]/a")).click();
		
		Thread.sleep(4000);
		
		//select Seoul
		System.out.println("서울시");
		System.out.println("===============================");
		driver.findElement(By.linkText("서울시")).click();
		
		Thread.sleep(1000);
		i = 24;
		//find by link text "district names"
		while (i < 25) {
			try {
				String districtnames = NAMES[i];
				System.out.println(districtnames);
				System.out.println("===============================");
				
				APTlist = getDong(districtnames);
				
				for (int j = 0; j < APTlist.size(); j++) {
					comp.add(APTlist.get(j));
				}
				System.out.println("### District Done");
				
				Thread.sleep(1000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			i++;
			if (i > 25) {
				break;
			}
		} 
		//final str into file
		
		compstr = comp.toString();
		district = compstr.replace("[", "").replace("]", "");
		district = compstr.replace("\n", " ");
		/*
		try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\J\\Desktop\\output\\HSCP.txt");
			output.write(compstr.getBytes());
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		infos = APTinfos(comp);
		
        try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\J\\Desktop\\output\\repTest.csv");
			output.write(infos.getBytes());
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.quit();
	}
	
	public static ArrayList<String> getDong (String districtnames) throws IOException, InterruptedException {
		String APTstr = "";
		String str = "";
		ArrayList <String> APTlist = new ArrayList();
		ArrayList<String> filetest = new ArrayList();
		ArrayList<String> APTno = new ArrayList();
		
		int i = 1;
		int j = 1;
		
		while (true) {
			try {
				driver.findElement(By.linkText(districtnames)).click();
				Thread.sleep(1000);
				
				while (i < 4) {
					String dongXpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div[1]/section/div[1]/div[3]/div[2]/div/div/table/tbody/tr[" + j + "]/td[" + i + "]/a";
					driver.findElement(By.xpath(dongXpath)).click();
					Thread.sleep(500);
					
					String pagedata = driver.getPageSource();
					
					if (pagedata.contains("단지정보 없음")) {
						driver.navigate().back();
						Thread.sleep(500);
						i++;
						if (i > 3) {
							j++;
							i = 1;
						}
					} else {
					//get HSCP no. from page source of each dong
					APTno = getHscpno(pagedata);
					
					//add to APTlist
					for (int k = 0; k < APTno.size(); k++) {
						APTlist.add(APTno.get(k));
					}
					System.out.println("## Page Source Done");
					
					driver.navigate().back();
					Thread.sleep(500);
					i ++;
					
						if (i > 3) {
							j++;
							i = 1;
						}
					}
				}
			} catch (NoSuchElementException e) {
				System.out.println("###Next district");
				driver.navigate().back();
				Thread.sleep(2000);
				return APTlist;
			} catch (ElementClickInterceptedException e) {
				driver.navigate().back();
				Thread.sleep(2000);
			} catch (ElementNotInteractableException e) {
				driver.navigate().back();
				Thread.sleep(2000);
				driver.findElement(By.linkText(districtnames)).click();
				Thread.sleep(1000);
			}
			
		}
	}
	
	public static String APTinfos(ArrayList APTlist) throws ElementNotInteractableException, IOException, InterruptedException {
		String infosPerAPT = "";
		List<String> APTinfoList = new ArrayList<String>();
		String APTstr = "";
		String str = "";
		
		while(true) {
			try {
				for(int i = 0; i < APTlist.size(); i++) {
					String APTlink = "https://m.land.naver.com/complex/info/" + APTlist.get(i) + "?ptpNo=1";
					driver.get(APTlink);
					
					Thread.sleep(3000);
					
					WebDriverWait wait = new WebDriverWait(driver, 5);
		            WebElement parent = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#_basic_content_cd > div.detail_summary_area._sumarea_cd > h1")));

					/////////////////////////////////////////////////
					String APTname1 = driver.findElement(By.cssSelector("#_basic_content_cd > div.detail_summary_area._sumarea_cd > h1")).getText();
		               String APTsede = driver.findElement(By.cssSelector("#_basic_content_cd > div.detail_summary_area._sumarea_cd > div.detail_summary > ul > li:nth-child(1)")).getText();
		               APTsede = APTsede.replace("세대", "");
		               APTsede = APTsede.replace(",", "");
		               String APTdate = driver.findElement(By.cssSelector("#_basic_content_cd > div.detail_summary_area._sumarea_cd > div.detail_summary > ul > li:nth-child(3)")).getText();            
		               String APTmae = driver.findElement(By.cssSelector("#_basic_content_cd > div.detail_summary_area._sumarea_cd > div.complex_summary_info > div > div > div > dl:nth-child(1) > dd")).getText();
		               String [] APTmae1 = APTmae.split("~");
		               APTmae = APTmae1[0];
		               APTmae = APTmae.replace("억","");
		               APTmae = APTmae.replace(",","");
		               APTmae = APTmae.replace("-","0");
		               String Juso = driver.findElement(By.cssSelector("#_basic_content_cd > article.article_box.article_box--detail._article_location_cd > div.item_area > p.p_address_place._addr")).getText();
		               // String Juso = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[5]/div/section/div/div/div[1]/article[4]/div[2]/p[1]")).getText();
		               //<p class="p_address_place _addr">서울시 강남구 청담동 102</p>
		               //#_basic_content_cd > article.article_box.article_box--detail._article_location_cd > div.item_area > p.p_address_place._addr
		               Thread.sleep(2000);
		               
		               //facilities
		               driver.findElement(By.linkText("시설")).click();
		               Thread.sleep(2000);

		               //link for Facilities article box
		               //driver.findElement(By.cssSelector("#_facil_trans_content_cd > article.article_box.article_box--detail._article_near_facility")).getText();
		               //driver.findElement(By.className("article_box article_box--detail _article_near_facility")).getText();
		               String sisuldata = driver.findElement(By.cssSelector("#nf_inner_cd > ul")).getText()+"\n";
		               //String sisul = sisulString(sisuldata);
		               
		               sisuldata = sisuldata.replace("m", "");
		               sisuldata = sisuldata.replace("\n", ",");
		               sisuldata = sisuldata.replace(" ", ",");
		               
		               infosPerAPT =  Juso + ","+ APTname1+","+ APTmae +"," + APTsede+","+APTdate+"," + sisuldata;
		               System.out.println(APTlist.get(i));
		               System.out.println(infosPerAPT);
		               System.out.println("===============================");
		               
		               Thread.sleep(2000);
		               APTinfoList.add(infosPerAPT);
					/////////////////////////////////////////////////
					}
				
				APTstr = APTinfoList.toString();
				str = APTstr.replace("[", "").replace("]", "");
				
				return str;
				} catch (NoSuchElementException e) {
					System.out.println("NoSuchElementException");
				} catch(NoSuchSessionException e) {
					System.out.println("NoSuchSessionException");
				} catch(StringIndexOutOfBoundsException e) {
					System.out.println("StringIndexOutOfBoundsException");
				} catch(TimeoutException e) {
					System.out.println("Time out");
					driver.get(driver.getCurrentUrl());
					Thread.sleep(2000);
					
				}
			}
	}
	
		
	public static String sisulString(String sisuldata) {
		//driver.get(url);
		String sisulSub = sisuldata.substring(sisuldata.indexOf("보기")+3);
		String sisulRep = sisuldata.replace("\n", " "); 
		/*
		String[] sisulSplit = sisulRep.split(" ");
		for(int i = 0; i < sisulSplit.length; i++) {
			System.out.print(sisulSplit[i] + " ");
		}
		*/
		return sisulRep;
	}
	
	public static ArrayList<String> getHscpno (String pagedata) {
		ArrayList <String> list = new ArrayList();
		String TAG = "hscpno";
		String temp = "";
		String listSTR = "";
		String str = "";
		while(true) {
			try {
				pagedata = pagedata.substring(pagedata.indexOf(TAG));
				pagedata = pagedata.substring(TAG.length() + 2);
				temp = pagedata.substring(0, 20);
				
				if (temp.charAt(0) != '\"') {
					temp = temp.substring(0, temp.indexOf(" ") - 1);
					//list 위로 옮기기, 계속 추가
					list.add(temp);
				}
				pagedata = pagedata.substring(pagedata.indexOf(temp) + temp.length());
			}catch(Exception e) {
				break;
			}
		}
		//System.out.println(list.get(1));
		return list;
	}
}
	


