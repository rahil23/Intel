
public class Server {

	private String serverName;
	private  String software;
	private String subsoft;
	private String subversion;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serverName == null) ? 0 : serverName.hashCode());
		result = prime * result + ((software == null) ? 0 : software.hashCode());
		result = prime * result + ((subsoft == null) ? 0 : subsoft.hashCode());
		//result = prime * result + ((subversion == null) ? 0 : subversion.hashCode());
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
		Server other = (Server) obj;
		if (serverName == null) {
			if (other.serverName != null)
				return false;
		} else if (!serverName.equals(other.serverName))
			return false;
		if (software == null) {
			if (other.software != null)
				return false;
		} else if (!software.equals(other.software))
			return false;
		if (subsoft == null) {
			if (other.subsoft != null)
				return false;
		} else if (!subsoft.equals(other.subsoft))
			return false;
		if (subversion == null) {
			if (other.subversion != null)
				return false;
		} else if (subversion.compareTo(other.subversion) >0)
			return false;
		return true;
	}


	public Server(String serverName, String software, String subsoft, String subversion) {
		super();
		this.serverName = serverName;
		this.software = software;
		this.subsoft = subsoft;
		this.subversion = subversion;
	}
	
	
	
}
