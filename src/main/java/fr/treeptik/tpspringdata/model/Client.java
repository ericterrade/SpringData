package fr.treeptik.tpspringdata.model;

import javax.persistence.*;



@Entity
public class Client {


		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue
		private Integer id;
		private String clientName;
		
		public Client() {
			
		}

		public Client(Integer id, String clientName) {
			super();
			this.id = id;
			this.clientName = clientName;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getClientName() {
			return clientName;
		}

		public void setClientName(String clientName) {
			this.clientName = clientName;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((clientName == null) ? 0 : clientName.hashCode());
			result = prime * result + ((id == null) ? 0 : id.hashCode());
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
			Client other = (Client) obj;
			if (clientName == null) {
				if (other.clientName != null)
					return false;
			} else if (!clientName.equals(other.clientName))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Client [id=" + id + ", clientName=" + clientName + "]";
		}

		
		
		
		
		
}
