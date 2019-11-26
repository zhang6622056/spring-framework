package beans;

import beans.inter.ICollectService;

public class UserService {



	ICollectService collectService;

	public String getUserName(){
		return "nero"+collectService.getCollectGoods();
	}


	public void setCollectService(ICollectService collectService) {
		this.collectService = collectService;
	}
}
