package electric_bill;

import java.util.Scanner;

public class currenttariff extends database{

	public float tariff_values;
	public float currenttariff_values(float unit) {
		if(unit<500) {
			tariff_values=tariff_values(1);
		}
		else if(unit>=500 && unit<1000) {
			tariff_values=tariff_values(2);
		}
		else if(unit>=1000 && unit<5000) {
			tariff_values=tariff_values(3);
		}
		else {
			tariff_values=tariff_values(4);
		}
		return tariff_values;
	}
}
