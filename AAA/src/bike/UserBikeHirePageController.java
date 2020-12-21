package bike;

import com.oms.bean.Media;

import abstractdata.ADataListPane;
import abstractdata.ADataPageController;
import cardinfor.CartController;

public abstract class UserBikeHirePageController extends ADataPageController<Media> {
	public UserBikeHirePageController() {
		super();
	}

	@Override
	public ADataListPane<Media> createListPane() {
		return new UserBikeHireListPane(this);
	}

}
