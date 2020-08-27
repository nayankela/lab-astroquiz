package utility;

import model.User;

public class EligibiltyCheck extends BasicEligibility implements EligibilityInterface {

	@Override
	public boolean checkUser(User user) {
		boolean flag = false;
		int age = user.getAge();
		int height = user.getHeight();
		int weight = user.getWeight();
		String country = user.getCountry().toLowerCase();

		if ((18 <= age && age <= 35) && (155 <= height && height <= 170) && (55 <= weight && weight <= 90)
				&& country.equals("prograd")) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		boolean flag = false;
		int point = Integer.parseInt(points);
		if (point > 80) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		boolean flag = false;
		if (checkUser(user)) {
			flag = true;
		}
		return flag;
	}

}
