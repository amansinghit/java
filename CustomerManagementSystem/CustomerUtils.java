package CustomerManagementSystem;

import java.time.LocalDate;

public class CustomerUtils {

	public static LocalDate parseDAte(String date) {
		return LocalDate.parse(date);
	}

	public static ServicePlan parseplan(String plan) {

		return ServicePlan.valueOf(plan.toUpperCase());

	}
}
