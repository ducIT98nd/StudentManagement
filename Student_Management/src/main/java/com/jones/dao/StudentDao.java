package com.jones.dao;

import org.bson.Document;

import com.jones.model.Student;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class StudentDao {
	MongoClient mongo = new MongoClient("localhost", 27017);
	MongoDatabase database = mongo.getDatabase("QLSinhVien");
	MongoCollection<Document> collection = database.getCollection("Student");

	public boolean addNewStudent(Student student) {
		Document std = new Document();
		std.put("nameId", student.getNameId());
		std.put("name", student.getName());
		std.put("dateOfbirth", student.getDateOfBirth());
		std.put("national", student.getNational());
		std.put("class", student.getClazz());
		std.put("school", student.getSchool());
		collection.insertOne(std);
		return false;
	}

	public boolean modify(Student student) {
		Document query = new Document();
		query.append("nameId", student.getNameId());
		Document setData = new Document();
		setData.append("name", student.getName()).append("dateOfbirth", student.getDateOfBirth())
				.append("national", student.getNational()).append("class", student.getClazz())
				.append("school", student.getSchool());
		Document update = new Document();
		update.append("$set", setData);
		collection.updateOne(query, update);
		return false;

	}
	public boolean delete(Student student) {
		collection.deleteOne(Filters.eq("nameId", student.getNameId()));
		return false;
		
	}

}
