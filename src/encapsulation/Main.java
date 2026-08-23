package encapsulation;

class Recharge {
	    private String mobileNumber;
	    private String operatorName;
	    private double rechargeAmount;

	    // Setter for mobile number
	    public void setMobileNumber(String mobileNumber) {
	        if (mobileNumber.length() == 10) {
	            this.mobileNumber = mobileNumber;
	        } else {
	            System.out.println("Invalid mobile number");
	        }
	    }

	    // Getter for mobile number
	    public String getMobileNumber() {
	        return mobileNumber;
	    }

	    // Setter for operator name
	    public void setOperatorName(String operatorName) {
	        this.operatorName = operatorName;
	    }

	    // Getter for operator name
	    public String getOperatorName() {
	        return operatorName;
	    }

	    // Setter for recharge amount
	    public void setRechargeAmount(double rechargeAmount) {
	        if (rechargeAmount >= 10) {
	            this.rechargeAmount = rechargeAmount;
	        } else {
	            System.out.println("Recharge amount should be at least ₹10");
	        }
	    }

	    // Getter for recharge amount
	    
	    public double getRechargeAmount() {
	        return rechargeAmount;
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Recharge r = new Recharge();

	        r.setMobileNumber("8317586375");
	        r.setOperatorName("jio");
	        r.setRechargeAmount(500);

	        System.out.println("Mobile Number: " + r.getMobileNumber());
	        System.out.println("Operator Name: " + r.getOperatorName());
	        System.out.println("Recharge Amount: ₹" + r.getRechargeAmount());

	    }
	}
