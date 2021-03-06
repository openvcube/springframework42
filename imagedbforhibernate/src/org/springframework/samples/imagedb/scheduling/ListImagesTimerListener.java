package org.springframework.samples.imagedb.scheduling;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.samples.imagedb.ImageDatabase;
import org.springframework.samples.imagedb.ImageDescriptor;
import org.springframework.util.StringUtils;

import commonj.timers.Timer;
import commonj.timers.TimerListener;

/**
 * 
 * @author worldheart
 *
 */
public class ListImagesTimerListener implements TimerListener {

	private final Log logger = LogFactory.getLog(getClass());

	private ImageDatabase imageDatabase;

	private MailSender mailSender;

	private String mailFrom;

	private String mailTo;

	public void setImageDatabase(ImageDatabase imageDatabase) {
		this.imageDatabase = imageDatabase;
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void setMailFrom(String mailFrom) {
		this.mailFrom = mailFrom;
	}

	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}

	public void timerExpired(Timer timer) {
		logger.info("Listing images in image database, scheduled by Timer");
		List images = this.imageDatabase.getImages();
		String[] imageNames = new String[images.size()];
		for (int i = 0; i < images.size(); i++) {
			ImageDescriptor image = (ImageDescriptor) images.get(i);
			imageNames[i] = image.getName();
		}

		String text = "Images in image database: " + StringUtils.arrayToDelimitedString(imageNames, ", ");
		logger.info(text);

		if (!"".equals(this.mailTo)) {
			logger.info("Sending image list mail to: " + this.mailTo);
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(this.mailFrom);
			message.setTo(this.mailTo);
			message.setSubject("Image list");
			message.setText(text);
			this.mailSender.send(message);
		}
		else {
			logger.info("Not sending image list mail - specify mail settings in 'WEB-INF/mail.properties'");
		}
	}

}
