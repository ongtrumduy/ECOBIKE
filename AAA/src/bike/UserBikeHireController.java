package bike;

import java.util.List;
import java.util.Map;

import javax.swing.JDialog;

import com.oms.bean.ReceiveBikeInfor;

import abstractdata.IDataManageController;
import api.BikeInforApi;


public class UserBikeHireController extends UserBikeHirePageController {
	public UserBikeHireController() {
		super();
	}

	@Override
	public List<? extends ReceiveBikeInfor> search(Map<String, String> searchParams) {
		return new BikeInforApi().getReceiveBikeInfor(searchParams);
	}

	@Override
	public BikeHireSinglePane createSinglePane() {
		return new BikeHireSinglePane();
	}

	@Override
	public BikeHireSearchPane createSearchPane() {
		return new BikeHireSearchPane();
	}

}
