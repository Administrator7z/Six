package com.bjpowernode;

import com.alibaba.fastjson.JSONObject;
import com.bjpowernode.model.School;
import com.bjpowernode.model.Student;
import org.dom4j.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootTest
class Boot27FastjsonApplicationTests {


	/**
	 * 把Student转为json ： 实现json的序列化
	 */
	@Test
	public void test01(){
		Student student = new Student();
		student.setAge(20);
		student.setName("李思");
		student.setId(1001);

		//使用fastjson
		String str = JSONObject.toJSONString(student);
		//{"age":20,"id":1001,"name":"李思"}
		System.out.println("json序列化student："+str);
	}

	// List<Student>
	@Test
	public void test02(){
		List<Student> list = new ArrayList<>();
		Student student = new Student();
		student.setAge(20);
		student.setName("李思");
		student.setId(1001);

		list.add(student);

		student = new Student();
		student.setAge(22);
		student.setName("张峰");
		student.setId(1002);
		list.add(student);

		String json = JSONObject.toJSONString(list);
		// [{"age":20,"id":1001,"name":"李思"},{"age":22,"id":1002,"name":"张峰"}]
		System.out.println("json = " + json);
	}

	//Student- School
	@Test
	public void test03(){
		Student student = new Student();
		student.setAge(22);
		student.setName("张峰");
		student.setId(1002);

		School school = new School();
		school.setName("北京大学");
		school.setAddress("北京的海淀区");
		student.setSchool(school);


		//{"age":22,"id":1002,"name":"张峰","school":{"address":"北京的海淀区","name":"北京大学"}}
		String json  = JSONObject.toJSONString(student);
		System.out.println("json="+json);
	}

	// 反序列化， 获取school 的name的值
	@Test
	public void test04(){
		String json="{\"age\":22,\"id\":1002,\"name\":\"张峰\"," +
				    "\"school\":{\"address\":\"北京的海淀区\",\"name\":\"北京大学\"}}";

		JSONObject jsonObject = JSONObject.parseObject(json);
		System.out.println("jsonObject="+jsonObject);

		int age  = jsonObject.getIntValue("age");
		String ageStr = jsonObject.getString("age");
		System.out.println("age="+age);
		System.out.println("ageStr = " + ageStr);

		JSONObject obj = jsonObject.getJSONObject("school");
		String name = obj.getString("name");
		System.out.println("name = " + name);


		//一个语句，链式方式
		String strname = JSONObject.parseObject(json).getJSONObject("school").getString("name");
		System.out.println("strname = " + strname);


	}

	@Test
	public void test05(){
		String json="{\"age\":20,\"id\":1001,\"name\":\"李思\"}";
		Student student = JSONObject.parseObject(json, Student.class);
		System.out.println("student="+student);
	}



	//读xml
	@Test
	public void test06() throws DocumentException {
		String xml="<?xml version=\"1.0\"?>\n" +
				"<class>\n" +
				"   <student id=\"1001\">\n" +
				"      <name>李思凡</name>\n" +
				"      <score>85</score>\n" +
				"   </student>\n" +
				"   <student id=\"1002\">\n" +
				"       <name>郭强</name>\n" +
				"      <score>92</score>\n" +
				"   </student>\n" +
				"   <student id=\"1003\">\n" +
				"      <name>郑闲</name>\n" +
				"      <score>78</score>\n" +
				"   </student>\n" +
				"   <classname>北京2001-java高级班</classname> \n" +
				"</class>";

		// 使用dom4j中的Document对象 doc就表示xml文件
		Document doc = DocumentHelper.parseText(xml);
		
		//调用doc的方法
		Element root = doc.getRootElement();
		List<Node> nodes  = root.selectNodes("//student");

		for(Node node:nodes){
			System.out.println("student="+node.asXML());
		}

	}

	@Test
	public void test07() throws DocumentException {
		String xml = "<?xml version=\"1.0\"?>\n" +
				"<class>\n" +
				"   <student id=\"1001\">\n" +
				"      <name>李思凡</name>\n" +
				"      <score>85</score>\n" +
				"   </student>\n" +
				"   <student id=\"1002\">\n" +
				"       <name>郭强</name>\n" +
				"      <score>92</score>\n" +
				"   </student>\n" +
				"   <student id=\"1003\">\n" +
				"      <name>郑闲</name>\n" +
				"      <score>78</score>\n" +
				"   </student>\n" +
				"   <classname>北京2001-java高级班</classname> \n" +
				"</class>";

		Document doc = DocumentHelper.parseText(xml);
		//Node node = doc.selectSingleNode("class/classname");
		Node node = doc.selectSingleNode("//classname");

		System.out.println("node:"+node.getText());
	}

	@Test
	public void test08(){
		ThreadLocalRandom t = ThreadLocalRandom.current();
		for(int i=0;i<10;i++){
			//System.out.println(t.nextBoolean());
			//System.out.println(t.nextInt(50));
			//System.out.println(t.nextInt(30,50));
			//System.out.println(t.nextInt(1000,10000));
		}


		StringBuilder builder = new StringBuilder();
		for(int i=0;i<10;i++){
			builder = new StringBuilder("");
			for(int m=0;m<4;m++){
				builder.append(t.nextInt(10));
			}
			System.out.println("builder="+builder.toString());
		}

	}
}
