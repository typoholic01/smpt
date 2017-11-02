package smpt;

public class Main {

	public static void main(String[] args) {
		GmailSend mail = new GmailSend();
		mail.GmailSet("typoholic01@gmail.com", "안녕하세요", "반갑습니다");
	}

}
