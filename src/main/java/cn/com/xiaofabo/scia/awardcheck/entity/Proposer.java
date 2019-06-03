package cn.com.xiaofabo.scia.awardcheck.entity;

public class Proposer {
	private String proposer;
	private String id;
	private String agency;
	private String representative;
	private String address;

	/// Either COM (company) or IND (individual)
	/// this is determined by the id type
	private String type;

	public Proposer() {
    }

	public Proposer(String proposer) {
        this.proposer = proposer;
    }

	public Proposer(String proposer, String id, String agency, String representative, String address) {
        this.proposer = proposer;
        this.id = id;
        this.agency = agency;
        this.representative = representative;
        this.address = address;
    }

	public String getProposer() {
		return proposer;
	}

	public void setProposer(String proposer) {
		this.proposer = proposer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getRepresentative() {
		return representative;
	}

	public void setRepresentative(String representative) {
		this.representative = representative;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
