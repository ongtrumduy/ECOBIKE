
package bike;

import com.oms.bean.ReceiveBikeInfor;
import abstractdata.IDataManageController;

import api.BikeInforApi;

public class BikeHireManageController implements IDataManageController<ReceiveBikeInfor> {

	@Override
	public void create(ReceiveBikeInfor t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void read(ReceiveBikeInfor t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ReceiveBikeInfor t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ReceiveBikeInfor t) {
		BikeInforApi api = new BikeInforApi();
		api.updateReceiveBikeInfor(t);
	}

}