package week4skillstorm;

import java.util.ArrayList;

public class Programmer {
	
	private String name;
	private int age;
	private String company;
	private ArrayList<String> languages = new ArrayList<String>();
	
	//bonus challenge
	public Programmer() {
		super();
	}
	
	public Programmer(String name, int age, String company) {
		this.name = name;
		this.age = age;
		this.company = company;
		
	}
	
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return  name;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public int getAge() {
		return age;
	}

	public void setCompany(String newCompany) {
		company = newCompany;
	}

	public String getCompany() {
		return company;
	}

	
	//abilities = methods
	
	public static ArrayList<String> add(ArrayList<String> languages, String str){
		if(str != null) {
			languages.add(str);
			return languages;
		} else {
			return languages;
		}
	}
	
	public  void learnLang(String newLanguage) {
		languages.add(newLanguage);
	}
	
	public void knows() {
		for (int i = 0; i < languages.size();i++) {
		System.out.println(languages.get(i));	
		}
		
	}
	
	public void forgetLang(int index) {
		languages.remove(index);
	}
	
}
