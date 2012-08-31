package com.mstiles92.bookrules.lib;

public interface WrittenBook {

	public String getAuthor();
	
	public String getTitle();
	
	public java.util.List<String> getPages();
	
	public String[] getPagesArray();
	
	public void setAuthor(String author);
	
	public void setTitle(String title);
	
	public void setPages(java.util.List<String> pages);
	
	public void setPages(String[] pages);
	
	public org.bukkit.inventory.ItemStack getItemStack(int quantity);
}