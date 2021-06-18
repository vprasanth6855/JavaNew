package JavaRevision_Package1;

public class Java_13_03_SeleniumWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void launchBrowser(String browser, String OS){
		interactWithBrowser(browser, OS);
	}
	private void interactWithBrowser(String browser, String OS){
		if(browser.equals("Chrome")){
			interactWithChromeServices(OS);
			System.out.println("launch Chrome");
		}
		else if(browser.equals("firefox")){
			interactWithFirefoxServices(OS);
			System.out.println("launch firefox");
		}
	}
	private void interactWithChromeServices(String OS){
		if(OS.equals("WIN")){
			System.out.println("win-chrome");
		}
		else if(OS.equals("MAC")){
			System.out.println("mac-chrome");
		}
		else if(OS.equals("LINUX")){
			System.out.println("linux-chrome");
		}
	}
	private void interactWithFirefoxServices(String OS){
		if(OS.equals("WIN")){
			System.out.println("win-ff");
		}
		else if(OS.equals("MAC")){
			System.out.println("mac-ff");
		}
		else if(OS.equals("LINUX")){
			System.out.println("linux-ff");
		}
	}

}
