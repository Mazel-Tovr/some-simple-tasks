package OOP.StudentPackage;


import java.util.ArrayList;

public class StudentTask
{

   // private ArrayList<Student> ListOfFacultyAndCourse = new ArrayList<>();
   // private ArrayList<Student> ListOfStudentBirthAfterYear = new ArrayList<>();
    //private ArrayList<Student> ListOfGroup = new ArrayList<>();

    private ArrayList<Student> listOfStudents = new ArrayList<Student>();



    void Init()
    {
        listOfStudents.add(new Student(1L, "Александр", "Середавкин", "Юрьевич", "13.09.1999", "Lenina 21", 891312313013L, Faculty.Инфорамтики, 3, Group.Pin_1705));
        listOfStudents.add( new Student(2L, "Егор", "Завгороднев", "Юрьевич", "24.08.1999", "Stalina 41-45", 893123123333L, Faculty.Инфорамтики, 3, Group.Pin_1705));
        listOfStudents.add( new Student(3L, "Роман", "Иванов", "Вячеславович", "30.07.1999", "Lenina 21", 8913123113L, Faculty.Инфорамтики, 3, Group.Pin_1705));
        listOfStudents.add( new Student(4L, "Дима", "Скибин", "Викторович", "26.06.1998", "Putina 00-21", 891312423423L, Faculty.Энергетики, 4, Group.Energy_1605));
        listOfStudents.add(new Student(5L, "fgdfgd", "gdfgdg", "gfhrrfgrt", "13.09.1997", "Lenina 21", 8913123132433L, Faculty.Химии, 4, Group.Energy_1605));
        listOfStudents.add(new Student(6L, "fhgffg", "fhghf", "hfghfg", "13.09.1996", "Lenina 21", 8913234213013L, Faculty.Строительства, 5, Group.Cem_1705));
        listOfStudents.add(new Student(7L, "Иван", "Иванов", "Иванович", "22.02.2002", "Hrusheva 60", 891312313013L, Faculty.Энергетики, 1, Group.Build_1705));
        listOfStudents.add(new Student(8L, "Александр", "Пушкин", "Сергеевич", "13.09.1999", "Czarskoe selo 21", 891312313013L, Faculty.Энергетики, 5, Group.Cem_1705));
        listOfStudents.add(new Student(9L, "Александр", "Первый", "Великий", "01.01.1996", "Lenina 21", 891312313013L, Faculty.Строительства, 3, Group.Build_1705));
        listOfStudents.add(new Student(11L, "Блаблабла", "блаблабал", "Бублубу", "16.08.1997", "Lenina 21", 891312313013L, Faculty.Строительства, 4, Group.Energy_1605));
        listOfStudents.add(new Student(12L, "БлоБлаБлу", "Гыгы", "Габаба", "19.07.1998", "Lenina 21", 891312313013L, Faculty.Строительства, 3, Group.Cem_1705));
    }

    public StudentTask()
    {
        Init();
    }

    public ArrayList<Student> studentOfFaculty(Faculty faculty)
    {
        ArrayList<Student> ListOfFaculty = new ArrayList<>();
        for (int i = 0; i < listOfStudents.size() ; i++)
        {
            if(listOfStudents.get(i).getFaculty() == faculty)
            {
                ListOfFaculty.add(listOfStudents.get(i));
            }
        }
        return ListOfFaculty;
    }
    public ArrayList<Student> facultyAndCourse(Faculty faculty,Integer cours)
    {
        ArrayList<Student> ListFacultyAndCourse = new ArrayList<>();
        ArrayList<Student> ListOfFaculty = studentOfFaculty(faculty);
        for (int i = 0; i < ListOfFaculty.size(); i++)
        {

            if(ListOfFaculty.get(i).getCourse() == cours)
            {
                ListFacultyAndCourse.add(ListOfFaculty.get(i));
            }

        }

        return ListFacultyAndCourse;
    }
    public ArrayList<Student> studentBirthAfterYear (final int birthDate)
    {
        ArrayList<Student> ListOfFacultyAndCourse = new ArrayList<>();
        for (int i = 0; i <listOfStudents.size() ; i++)
        {
            var b = listOfStudents.get(i).getDateOfBirth();
           String[] date = b.split("\\.");
           int a = Integer.parseInt(date[date.length-1]);
           if( birthDate < a)
           {
               ListOfFacultyAndCourse.add(listOfStudents.get(i));
           }

        }
        return ListOfFacultyAndCourse;
    }

    public ArrayList<Student> studentsOfGroup(Group group)
    {
        ArrayList<Student> listOfStudentsOfGroup = new ArrayList<>();
        for (int i = 0; i <listOfStudents.size() ; i++)
        {
            if(listOfStudents.get(i).getGroup() == group)
            {
                listOfStudentsOfGroup.add(listOfStudents.get(i));
            }
        }
        return listOfStudentsOfGroup;
    }
}
