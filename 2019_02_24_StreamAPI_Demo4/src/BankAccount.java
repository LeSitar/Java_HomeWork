
public class BankAccount {
	
	private String ibann;

	public BankAccount(String ibann) {
		super();
		this.ibann = ibann;
	}

	public String getIbann() {
		return ibann;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ibann == null) ? 0 : ibann.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (ibann == null) {
			if (other.ibann != null)
				return false;
		} else if (!ibann.equals(other.ibann))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "IBANN " + ibann;
	}
	
	

}
