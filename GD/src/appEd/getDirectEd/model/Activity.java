package appEd.getDirectEd.model;
/**
 * @author James Helberg
 * 
 * This is for representing the Activities that are loaded in from the database.
 * Should be created by the ActivityFactory which will generate Activities from
 * the Activity Database for viewing. 
 */
public class Activity {

	/**
	 *   Variables
	 * id          - the id for the Activity within the Database
	 * name        - the main name for the Activity in question     eg. Swim
	 * subType     - the specific name for the Activity in question     |-> Lane
	 * description - the description of the activity subType
	 * image       - the image associated with the Activity
	 */
	private long   id;
	private String name;
	private Integer subType;
	private String description;
	private String image;
	
	/**
	 * Activity generation requires no specialized inputs
	 */
	public Activity() {
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
	public Integer getSubType() {
		return subType;
	}

	/**
	 * @param integer 
	 */
	public void setSubType(Integer integer) {
		this.subType = integer;
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

	/**
	 * @return image name - for resource lookup
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image name - for resource lookup
	 */
	public void setImage(String image) {
		this.image = image;
	}
	
}