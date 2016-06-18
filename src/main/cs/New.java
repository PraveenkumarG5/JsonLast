package main.cs;

import java.math.BigDecimal;
import java.util.List;

import com.github.reinert.jjschema.Attributes;

//@Attributes(title="New", description="A product from Acme's catalog") 
class New {
   // @Attributes(required=true, description="The unique identifier for a product")
    private long id;
   // @Attributes(required=true, description="Name of the product")
    private String name;
   // @Attributes(required=true, minimum=0, exclusiveMinimum=true)
    private BigDecimal price;
  //  @Attributes(minItems=1,uniqueItems=true)
  //  private List<String> tags;
    private int praveen;
    private Old emp;

  
public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getPraveen() {
		return praveen;
	}
	public void setPraveen(int praveen) {
		this.praveen = praveen;
	}
	public String getName() {
        return name;
    }   
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
  /*  public List<String> getTags() {
        return tags;
    }
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
*/
	public Old getEmp() {
		return emp;
	}
	public void setEmp(Old emp) {
		this.emp = emp;
	}}