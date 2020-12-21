package bike;

import java.util.List;
import java.util.Map;

import javax.swing.JDialog;

import com.oms.bean.Book;
import com.oms.bean.Media;

import abstractdata.IDataManageController;
import api.MediaApi;
import cardinfor.CartController;
import editdialog.BookEditDialog;

public class UserBikeHireController extends UserBikeHirePageController {
	public UserBikeHireController() {
		super();
	}

	@Override
	public List<? extends Media> search(Map<String, String> searchParams) {
		return new MediaApi().getBooks(searchParams);
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
