package cn.wh.mode.pojo.UserAttribute;

public class Balance {
	Integer GoldCoins;//金币
	Integer GeanPoint;//游戏点数
	Integer Cash;//现金

	public Balance(Integer goldCoins, Integer geanPoint, Integer cash) {
		GoldCoins = goldCoins;
		GeanPoint = geanPoint;
		Cash = cash;
	}

	public Integer getGoldCoins() {
		return GoldCoins;
	}

	public void setGoldCoins(Integer goldCoins) {
		GoldCoins = goldCoins;
	}

	public Integer getGeanPoint() {
		return GeanPoint;
	}

	public void setGeanPoint(Integer geanPoint) {
		GeanPoint = geanPoint;
	}

	public Integer getCash() {
		return Cash;
	}

	public void setCash(Integer cash) {
		Cash = cash;
	}

	@Override
	public String toString() {
		return "用户资产{" +
				"游戏金币:" + GoldCoins +
				", 游戏点数:" + GeanPoint +
				", 现金余额:" + Cash +
				'}';
	}
}
