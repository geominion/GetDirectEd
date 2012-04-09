package appEd.getDirectEd.model;

/**
 * @author James Helberg
 * 
 * This is the model class that will represent a facility that has been loaded
 * for viewing. Should be created by a FacilityFactory which is connected to the
 * Facility database for loading and saving new factories.
 */
public class Facility {
	
	/**
	 *   Variables
	 * id          - id within Database for this facility
	 * name        - name of this facility
	 * latitude    - latitude coordinate
	 * longitude   - longitude coordinate
	 * facType     - id for Facility Type database
	 * address     - string for the address of this facility
	 * phone       - the phone number for the facility "###.###.####" or ""
	 * description - description of the location or additional information associated
	 * image       - the image name that will be within the resources folder
	 */
	private long   id;
	private String name;
	private float  latitude;
	private float  longitude;
	private long   facType;
	private String address;
	private String phone;
	private String description;
	private String image;
	
	
	/**
	 * Facility generation requires no specialized inputs
	 */
	public Facility() {
		//TODO: Any initialization required goes here
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
	 * @return latitude
	 */
	public float getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 */
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return longitude
	 */
	public float getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 */
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return facType id
	 */
	public long getFacType() {
		return facType;
	}

	/**
	 * @param facType id
	 */
	public void setFacType(long facType) {
		this.facType = facType;
	}

	/**
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return phone "###.###.####"
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone "###.###.####"
	 */
	public void setPhone(String phone) {
		this.phone = phone;
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
	 * @return image name - for lookup in resources
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image name
	 */
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}