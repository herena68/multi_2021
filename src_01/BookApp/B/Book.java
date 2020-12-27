package BookApp.B;

public class Book{
	private int ISBM;
	private String title;
	private int price;
	
	public int getISBM()	{
		return ISBM;
	}
	
	public void setISBM(int ISBM)	{
		this.ISBM =ISBM;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		if(title != null)
			this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if(price > 0)
			this.price = price;
	}
	
	
	public Book()	{}
	
	public Book(int ISBM, String title,int price)	{
		this.setISBM(ISBM);
		this.setTitle(title);
		this.setPrice(price);
	}
	


	@Override
	public String toString() {
		return "Book\n--------------\nISBM=" + ISBM + "\ntitle=" + title + "\nprice=" + price +"\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBM;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)	{
		if(obj != null && obj instanceof Book)	{
			Book temp = (Book)obj;
			if(ISBM == temp.ISBM && title.equals(temp.title) && price == temp.price)	{
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
