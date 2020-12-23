package bike;

import com.oms.bean.ReceiveBikeInfor;

import abstractdata.ADataListPane;
import abstractdata.ADataPageController;

public abstract class UserBikeHirePageController extends ADataPageController<ReceiveBikeInfor> {
	public UserBikeHirePageController() {
		super();
	}

	@Override
	public ADataListPane<ReceiveBikeInfor> createListPane() {
		return new UserBikeHireListPane(this);
	}

}
