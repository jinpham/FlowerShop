package flower_shop.model;
import java.util.List;

public class Order {
	private String id;
	private List<Item> items;
	private double sumPrice;
	private String created;
	private String received_date;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public double getSumPrice() {
		return sumPrice;
	}
	public void setSumPrice(double sumPrice) {
		this.sumPrice = sumPrice;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getReceived_date() {
		return received_date;
	}
	public void setReceived_date(String received_date) {
		this.received_date = received_date;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id  + ", items=" + items + ", sumPrice="
				+ sumPrice + ", received_date = " + received_date +", created=" + created + "]";
	}
	
	
	
}
