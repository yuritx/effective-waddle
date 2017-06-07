package components;

public class FormattedTextFieldDemoData {
	public double amount;
	public double rate;
	public int numPeriods;

	public FormattedTextFieldDemoData(double amount, double rate, int numPeriods) {
		this.amount = amount;
		this.rate = rate;
		this.numPeriods = numPeriods;
	}

	double computePayment(double loanAmt, double rate, int numPeriods) {
	    double I, partial1, denominator, answer;
	
	    numPeriods *= 12;        //get number of months
	    if (rate > 0.01) {
	        I = rate / 100.0 / 12.0;         //get monthly rate from annual
	        partial1 = Math.pow((1 + I), (0.0 - numPeriods));
	        denominator = (1 - partial1) / I;
	    } else { //rate ~= 0
	        denominator = numPeriods;
	    }
	
	    answer = (-1 * loanAmt) / denominator;
	    return answer;
	}
}