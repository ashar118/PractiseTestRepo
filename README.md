# Rest API testing using Rest-Assured Java Framework
This is repository of basic REST API testing framework
The public API used for this example is - https://restful-booker.herokuapp.com
This framework is developed using Rest-Assured library for Rest API testing
For JSON Parsing in java the library used is Jackson API

Used tools and frameworks
java 11
Rest-Assured
Maven repository
TestNG
Lombok library


Below are instructions are how to create Rest API test framework using Rest Assured Java library
• Maven Dependency to add,
	<<dependencies>
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>6.14.3</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.13.3</version>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<version>1.18.10</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>io.rest-assured</groupId>
			<artifactId>rest-assured</artifactId>
			<version>5.3.0</version>
		</dependency>
	<dependency>
	    <groupId>commons-io</groupId>
	    <artifactId>commons-io</artifactId>
	    <version>2.11.0</version>
	</dependency>
<dependency>
  
  	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.7.0</version>
				<configuration>
				 <suiteXmlFiles>
          <suiteXmlFile>testng.xml</suiteXmlFile>
          </suiteXmlFiles>
					<source>1.8</source>
					<target>1.8</target>
					<encoding>UTF-8</encoding>
				</configuration>
			</plugin>
		</plugins>
	</build>
	
• RestAssured.uri = "" // to specify the basic URL of the API

• Basic building blocks of Rest Assured - given, when, then

• Values that can be provided in the given block,
  #Given Block
  Create RCB_Fixture class and build model request in calss.
  Create a request with Builder,Getter and Setter 
  
  #Created tc using testng framework
  
 #WHEN
  
  for post request
  Create a client with end point and provide bodey and required parameters
  public static Response createTeam(Royal_Challengers_Model royal_Challengers_Model ) {
		
		RequestSpecification request= given().header("authorization", "Bearer ")
		         .contentType(ContentType.JSON)
		         .body(royal_Challengers_Model);
		     return   request.post("") ;
	}
  provide bearer token authorization
  
  for get request
  public static Response getTeam(String id ) {
		
		RequestSpecification request= given().header("authorization", "Bearer ")
		         .pathParam("id", id);
		     return   request.get("/team/{id}/") ;
	}
  
  
#Then
  Compare with correct status code 
  and used testng assertions and Oops concept and validate the result
  
  
  Deserializing JSON response:
  Using getters and setters of POJO classes, serialisation and deserialization of JSON objects can be made simple
	○ To convert a normal java class to POJO => provide the field names, ALT+SHIFT+S, generate getter and setter
  
  We can use JacksonAPI to easily work with json objects and below are the dependencies to be added,
	<dependency>
	    <groupId>com.fasterxml.jackson.core</groupId>
	    <artifactId>jackson-databind</artifactId>
	    <version>2.9.8</version>
	</dependency>
  
  #To run test cases Created testng.xml and configure test suit .
  
  <?xml version="1.0" encoding="UTF-8"?>
<suite name="TesngSuit">
    <test name="TestSuit" >
        <classes>
            <class name="restAssuredAssignment.RestApi.Tc1"/>
            <class name="restAssuredAssignment.RestApi.Tc2"/>
        </classes>
    </test>
</suite>
  
    #Added this test suit in pom.xml class
   <suiteXmlFiles>
          <suiteXmlFile>testng.xml</suiteXmlFile>
          </suiteXmlFiles>
  
  #Rightclick on Testng.xml and click on run with Testng
  #Generated report will be displayed in Testoutput folder in emailable-report.html
  Right click on emailable-report.html and click on open with web browser,Passed and failed test cases report will be displayed with time as shown below:
  
  restAssuredAssignment.RestApi.Tc1 verifyTeamHasFourForeignPlayer 1673539710314 3528 
restAssuredAssignment.RestApi.Tc2 verifyTeamHasOneWicketKeeper 1673539713852 45 

  

  
  
  
  
  
  
  
  
  
  

