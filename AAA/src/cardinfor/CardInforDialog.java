//package cardinfor;
//
//import java.util.List;
//
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//
////import com.oms.bean.RentalData;
////import com.oms.bean.Card;
////import com.oms.components.abstractdata.controller.RentalController;
////import com.oms.components.abstractdata.gui.ARentalDataListDialog;
////import com.oms.serverapi.RentalApi;
////import com.oms.serverapi.CardBankApi;
//
//@SuppressWarnings("serial")
//public class CardInforDialog extends ARentalDataListDialog<Card> {
//
//	public CardListDialog(List<Card> card, RentalData rentalData) {
//		super(card, rentalData);
//	}
//
//	@Override
//	public void buildControls(int i) {
//		int row = getLastRowIndex();
//		JLabel idLabel = new JLabel("MÃ SỐ THẺ NGÂN HÀNG: " + t.get(i).getId());
//		c.gridx = 0;
//		c.gridy = row;
//		getContentPane().add(idLabel, c);
//
//		row = getLastRowIndex();
//		JLabel nameLabel = new JLabel("TÊN CHỦ THẺ NGÂN HÀNG: " + t.get(i).getName());
//		c.gridx = 0;
//		c.gridy = row;
//		getContentPane().add(nameLabel, c);
//
//		row = getLastRowIndex();
//		JLabel moneyLabel = new JLabel("SỐ DƯ TÀI KHOẢN: " + t.get(i).getMoney());
//		c.gridx = 0;
//		c.gridy = row;
//		getContentPane().add(moneyLabel, c);
//
//	}
//
//	@Override
//	public Card getNewData(int i) {
//		return t.get(i);
//	}
//
//	@Override
//	public String getCardId(int i) {
//		return t.get(i).getId();
//	}
//
//}
