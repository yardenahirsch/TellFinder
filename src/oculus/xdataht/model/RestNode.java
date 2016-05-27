/**
Copyright 2016 Uncharted Software Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package oculus.xdataht.model;

import java.util.ArrayList;

public class RestNode {
	private String id;
	private String name;
	private String label;
	private int ring;
	private double size;
	private int clusterSize;
	private StringMap attributes;
	private ArrayList<StringMap> links;
	private String latestad;
	private String attribute;

	public RestNode() { }

	public RestNode(String id, String name, String label, int ring,
			double size, int clusterSize, StringMap attributes,
			ArrayList<StringMap> links, String latestad) {
		super();
		this.id = id;
		this.name = name;
		this.label = label;
		this.ring = ring;
		this.size = size;
		this.clusterSize = clusterSize;
		this.attributes = attributes;
		this.links = links;
		this.latestad = latestad;
	}
	
	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getLatestad() {
		return latestad;
	}

	public void setLatestad(String latestad) {
		this.latestad = latestad;
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getRing() {
		return ring;
	}

	public void setRing(int ring) {
		this.ring = ring;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getClusterSize() {
		return clusterSize;
	}

	public void setClusterSize(int clusterSize) {
		this.clusterSize = clusterSize;
	}

	public StringMap getAttributes() {
		return attributes;
	}

	public void setAttributes(StringMap attributes) {
		this.attributes = attributes;
	}

	public ArrayList<StringMap> getLinks() {
		return links;
	}

	public void setLinks(ArrayList<StringMap> links) {
		this.links = links;
	}
	
}
