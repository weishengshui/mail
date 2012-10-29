import static org.junit.Assert.*;

import com.wss.lsl.mail.main.SendEmailBean;


public class Test {

	@org.junit.Test
	public void test() {
		SendEmailBean sendEmailBean = new SendEmailBean();
		sendEmailBean.sendSimpleEmail("914463145@qq.com", "你好，水哥！", "测试邮箱程序");
		sendEmailBean.sendHtmlEmail("1349317563@qq.com", "你好，华妹子！\n这是我用程序发给你的", "测试邮箱程序");
		
	}

}
