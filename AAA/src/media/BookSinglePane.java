package media;

import javax.swing.JLabel;

import com.oms.bean.Media;
import com.oms.bean.Book;

@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
//	private JLabel labelPublisher;
//	private JLabel labelPublicationDate;
//	private JLabel labelAuthor;
//	private JLabel labelNumberPage;
//	private JLabel labelLanguage;
//
//	public BookSinglePane() {
//		super();
//	}
//
//	public BookSinglePane(Media media) {
//		this();
//		this.t = media;
//
//		displayData();
//	}
//
//	@Override
//	public void buildControls() {
//		super.buildControls();
//
//		int row = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = row;
//		labelPublisher = new JLabel();
//		add(labelPublisher, c);
//
//		row = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = row;
//		labelPublicationDate = new JLabel();
//		add(labelPublicationDate, c);
//		
//		row = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = row;
//		labelAuthor = new JLabel();
//		add(labelAuthor, c);
//		
//		row = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = row;
//		labelNumberPage = new JLabel();
//		add(labelNumberPage, c);
//		
//		row = getLastRowIndex();
//		c.gridx = 0;
//		c.gridy = row;
//		labelLanguage = new JLabel();
//		add(labelLanguage, c);
//	}
//
//	@Override
//	public void displayData() {
//		super.displayData();
//
//		if (t instanceof Book) {
//			Book b = (Book) t;
//			labelPublisher.setText("DuyPH-Publisher: " + b.getPublisher());
//			labelPublicationDate.setText("DuyPH-Publication date: " + b.getPublicationDate());
//			labelAuthor.setText("DuyPH-Author: " + b.getAuthors());
//			labelNumberPage.setText("DuyPH-Number Of Pages: " + b.getNumberOfPages());
//			labelLanguage.setText("DuyPH-Language: " + b.getLanguage());
//		}
//	}
}
