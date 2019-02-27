
public class BankAccount {
	private String ibann;
	private Person owner;
	
	public BankAccount(String ibann, Person owner) {
		this.ibann = ibann;
		this.owner = owner;
	}

	public String getIbann() {
		return ibann;
	}

	public Person getOwner() {
		return owner;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ibann == null) ? 0 : ibann.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount: Owner " + owner + " IBANN: " +ibann ;
	}
	
	
	

}
