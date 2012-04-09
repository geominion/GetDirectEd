package appEd.getDirectEd.model;
/**
 * @author Eric Klinger
 * 
 
 */
public class SubActivity{

	/**
	 *   Variables
	 * id          - 
	 * name        - 
	 * superType   -
	 * description - 
	 */
	private long   id;
	private String name;
	private String description;
	private long   superTypeID;

	
	/**
	 * Activity generation requires no specialized inputs
	 */
	public SubActivity() {
		//TODO: any initialization required
	}

	/**
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return subType
	 */
	public long getSuperType() {
		return superTypeID;
	}

	/**
	 * @param subType 
	 */
	public void setSuperType(long superTypeID) {
		this.superTypeID = superTypeID;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}	
}
