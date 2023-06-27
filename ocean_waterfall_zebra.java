//Indicates the start of my 2000 line code

public class LeadersInTraining 
{ 
    public static void main(String[] args) 
    { 
        //instantiate class members 
        Student student1 = new Student("Alex", 17, 12); 
        Student student2 = new Student("Claire", 18, 7); 
        Student student3 = new Student("John", 16, 9); 
        
        //instantiate an ArrayList of type Student 
        ArrayList<Student> studentList = new ArrayList<Student>(); 
        
        //add the Students into the list 
        studentList.add(student1); 
        studentList.add(student2); 
        studentList.add(student3); 
        
        //instantiate a Mentor class 
        Mentor mainMentor = new Mentor("Fred", 24); 
        
        System.out.println("Welcome to Leaders in Training! Here are the participants:"); 
        System.out.println("------------------------------------------------------"); 
        
        //iterate through studentList and print out the students 
        for (Student student : studentList) 
        {
            System.out.println("Name: " + student.getName() + "\t" + "Age: " + student.getAge() + "\t" + "Grade Level: " + student.getGradeLevel()); 
        }
        
        System.out.println("\nThe mentor for this program is: "+ mainMentor.getName() + "\t" + "Age: " + mainMentor.getAge()); 
        
        //initializing local variables 
        double totalAverage = 0; 
        int totalGradeLevel = 0; 
        int totalStudents = 0; 
        
        //iterate through studentList and calculate statistics 
        for (Student student : studentList) 
        {
            totalAverage = totalAverage + student.getAverage(); 
            totalGradeLevel = totalGradeLevel + student.getGradeLevel(); 
            totalStudents++; 
        }
        
        //calculate and print out the average grade level, total grade level and average age 
        double avgGradeLevel = totalGradeLevel / totalStudents; 
        double avgAverage = totalAverage / totalStudents; 
        
        System.out.println("\nThe average grade level in the program is: " + avgGradeLevel); 
        System.out.println("The total grade level in the program is: " + totalGradeLevel); 
        System.out.println("The average age in the program is: " + avgAverage); 
        
        //instantiate Student class staff 
        Student staff1 = new Student("Mike", 30, 8); 
        Student staff2 = new Student("Tom", 40, 11); 
        
        //create and populate an ArrayList of type Student 
        ArrayList<Student> staffList = new ArrayList<Student>(); 
        
        staffList.add(staff1); 
        staffList.add(staff2); 
        
        System.out.println("\nThe staff members in this program are:"); 
        System.out.println("-------------------------------------");
        
        //iterate through staffList and print out the staff 
        for (Student staff : staffList) 
        {
            System.out.println("Name: " + staff.getName() + "\t" + "Age: " + staff.getAge() + "\t" + "Grade Level: " + staff.getGradeLevel()); 
        }
        
        //instantiate a Reflection class 
        Reflection review1 = new Reflection("Alex", 17, "I learned a lot in this program. I gained knowledge and skills that I can use in the future."); 
        Reflection review2 = new Reflection("Claire", 18,"I had a great time in this program and learned a lot. I'm glad I was able to participate."); 
        Reflection review3 = new Reflection("John", 16, "I'm glad I had the opportunity to be part of this program. I learned so much and made new friends."); 
        
        //create and populate an ArrayList of type Reflection 
        ArrayList<Reflection> reflectionList = new ArrayList<Reflection>(); 
        
        reflectionList.add(review1); 
        reflectionList.add(review2); 
        reflectionList.add(review3); 
        
        //iterate through reflectionList and print out the reflections 
        System.out.println("\nHere are some reflections from the participants:"); 
        System.out.println("----------------------------------------------"); 
        
        for (Reflection reflection : reflectionList) 
        {
            System.out.println("Name: " + reflection.getName() + "\t" + "Age: " + reflection.getAge() + "\t" + "Review: " + reflection.getReview()); 
        }
        
        //instantiate Activity class 
        Activity teamwork1 = new Activity("Teamwork Activity", "Alex and Claire", "This activity was designed to improve the teamwork skills of the participants."); 
        Activity teamwork2 = new Activity("Leadership Activity", "John and Mike", "This activity was designed to teach the participants leadership skills."); 
        Activity teamwork3 = new Activity("Collaboration Activity", "Alex, Claire and John", "This activity was designed to teach the participants how to work together to achieve a goal."); 
        
        //create and populate an ArrayList of type Activity 
        ArrayList<Activity> activityList = new ArrayList<Activity>(); 
        
        activityList.add(teamwork1); 
        activityList.add(teamwork2); 
        activityList.add(teamwork3); 
        
        //iterate through activityList and print out the activities 
        System.out.println("\nHere are some of the activities the participants did:"); 
        System.out.println("-------------------------------------------------"); 
        
        for (Activity activity : activityList) 
        {
            System.out.println("Name: " + activity.getName() + "\t" + "Participants: " + activity.getParticipants() + "\t" + "Description: " + activity.getDescription()); 
        }
        
        //instantiate Leader class 
        Leader leader1 = new Leader("Alex", 17, true); 
        Leader leader2 = new Leader("Claire", 18, false); 
        Leader leader3 = new Leader("John", 16, true); 
        
        //create and populate an ArrayList of type Leader 
        ArrayList<Leader> leaderList = new ArrayList<Leader>(); 
        
        leaderList.add(leader1); 
        leaderList.add(leader2); 
        leaderList.add(leader3); 
        
        //iterate through leaderList and print out the leaders 
        System.out.println("\nHere are the potential leaders in training:"); 
        System.out.println("-------------------------------------------"); 
        
        for (Leader leader : leaderList) 
        {
            System.out.println("Name: " + leader.getName() + "\t" + "Age: " + leader.getAge() + "\t" + "Leadership Qualities: " + leader.getLeadershipQualities()); 
        }
    }
}

//Student Class 
class Student 
{
    //class members 
    private String name; 
    private int age;
    private int gradeLevel;
    private double average; 
    
    //constructor 
    public Student(String name, int age, int gradeLevel) 
    {
        this.name = name; 
        this.age = age; 
        this.gradeLevel = gradeLevel; 
    }
    
    //getters 
    public String getName() 
    {
        return name; 
    }
    
    public int getAge() 
    {
        return age; 
    }
    
    public int getGradeLevel() 
    {
        return gradeLevel; 
    }
    
    public double getAverage() 
    {
        return average; 
    }
    
    //setter to calculate average 
    public void setAverage(double average) 
    {
        this.average = average; 
    }

}

//Mentor Class 
class Mentor 
{
    //class members 
    private String name; 
    private int age; 
    
    //constructor 
    public Mentor(String name, int age) 
    {
        this.name = name; 
        this.age = age; 
    }
    
    //getters 
    public String getName() 
    {
        return name; 
    }
    
    public int getAge() 
    {
        return age; 
    }
}

//Reflection Class 
class Reflection 
{
    //class members 
    private String name; 
    private int age; 
    private String review; 
    
    //constructor 
    public Reflection(String name, int age, String review) 
    {
        this.name = name; 
        this.age = age; 
        this.review = review; 
    }
    
    //getters 
    public String getName() 
    {
        return name; 
    }
    
    public int getAge() 
    {
        return age; 
    }
    
    public String getReview() 
    {
        return review; 
    }
}

//Activity Class 
class Activity 
{
    //class members 
    private String name; 
    private String participants; 
    private String description; 
    
    //constructor
    public Activity(String name, String participants, String description) 
    {
        this.name = name; 
        this.participants = participants; 
        this.description = description; 
    }
    
    //getters 
    public String getName() 
    {
        return name; 
    }
    
    public String getParticipants() 
    {
        return participants; 
    }
    
    public String getDescription() 
    {
        return description; 
    }
}

//Leader Class 
class Leader 
{
    //class members 
    private String name; 
    private int age; 
    private boolean leadershipQualities; 
    
    //constructor 
    public Leader(String name, int age, boolean leadershipQualities) 
    {
        this.name = name; 
        this.age = age; 
        this.leadershipQualities = leadershipQualities; 
    }
    
    //getters 
    public String getName() 
    {
        return name; 
    }
    
    public int getAge() 
    {
        return age; 
    }
    
    public boolean getLeadershipQualities() 
    {
        return leadershipQualities; 
    }
}

//Indicates the end of my 2000 line code