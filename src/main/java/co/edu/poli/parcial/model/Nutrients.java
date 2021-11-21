package co.edu.poli.parcial.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "nutrients")
public class Nutrients {
	@Id
	private String id;
	private String name;
	private int rda;
	private String wiki;
	private boolean required;
	private String type;
	private int tui;

	public Nutrients() {

	}

	public Nutrients(String id, String name, int rda, String wiki, boolean required, String type, int tui) {
		super();
		this.id = id;
		this.name = name;
		this.rda = rda;
		this.wiki = wiki;
		this.required = required;
		this.type = type;
		this.tui = tui;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRda() {
		return rda;
	}

	public void setRda(int rda) {
		this.rda = rda;
	}

	public String getWiki() {
		return wiki;
	}

	public void setWiki(String wiki) {
		this.wiki = wiki;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTui() {
		return tui;
	}

	public void setTui(int tui) {
		this.tui = tui;
	}

}
